import { UploadSimple, Waveform } from "@phosphor-icons/react";
import { Separator } from "./ui/separator";
import { Label } from "./ui/label";
import { Textarea } from "./ui/textarea";
import { Button } from "./ui/button";
import { ChangeEvent, FormEvent, useMemo, useRef, useState } from "react";
import { getFFmpeg } from "@/lib/ffmpeg";
import { fetchFile } from "@ffmpeg/util";
import { api } from "@/lib/axios";

type Status = 'waiting' | 'converting' | 'uploading' | 'generating' | 'success'

const statusMessages = {
  converting: 'Convertendo...',
  uploading: 'Fazendo Upload...',
  generating: 'Gerando Transcrição...',
  success: 'Sucesso!',
}

interface VideoInputFormProps {
  onVideoUploaded: (id: string) => void
}

export function VideoInputForm({ onVideoUploaded }: VideoInputFormProps) {
  const [videoFile, setVideoFile] = useState<File | null>(null)
  const [status, setStatus] = useState<Status>('waiting')

  const promptInputRef = useRef<HTMLTextAreaElement>(null)

  function handleFileSelected(event: ChangeEvent<HTMLInputElement>) {
    const { files } = event.currentTarget
    if (!files) {
      return
    }
    const selectedFile = files[0]
    setVideoFile(selectedFile)
  }

  async function convertVideoToAudio(video: File) {
    console.log('Converte started!')

    const ffmpeg = await getFFmpeg()
    await ffmpeg.writeFile('input.mp4', await fetchFile(video))

    // ffmpeg.on('log', log => {
    //   console.log(log)
    // })

    ffmpeg.on('progress', progress => {
      console.log('Convert progress: ' + Math.round(progress.progress * 100))
    })

    await ffmpeg.exec([
      '-i',
      'input.mp4',
      '-map',
      '0:a',
      '-b:a',
      '20k',
      '-acodec',
      'libmp3lame',
      'output.mp3'
    ])

    const data = await ffmpeg.readFile('output.mp3')

    const audioFileBlob = new Blob([data], { type: 'audio/mpeg' })
    const audioFile = new File([audioFileBlob], 'audio.mp3', {
      type: 'audio/mpeg'
    })

    console.log('Convert finished!')

    return audioFile
  }

  async function handleUploadVideo(event: FormEvent<HTMLFormElement>) {
    event.preventDefault()
    const prompt = promptInputRef.current?.value

    if (!videoFile) {
      return
    }

    setStatus('converting')

    const audioFile = await convertVideoToAudio(videoFile)

    const data = new FormData()
    data.append('file', audioFile)

    setStatus('uploading')

    const response = await api.post('/videos', data)
    const videoId = response.data.video.id

    setStatus('generating')

    await api.post(`/videos/${videoId}/transcription`, { prompt })

    setStatus('success')

    onVideoUploaded(videoId)
  }

  const previewURL = useMemo(() => {
    if (!videoFile) {
      return null
    }
    return URL.createObjectURL(videoFile)
  }, [videoFile])

  return (
    <form onSubmit={handleUploadVideo} className="space-y-6">
      <label htmlFor="video" className=" relative h-full flex flex-col items-center justify-center gap-4 bg-green-900/10 hover:bg-green-900/20 transition-colors border border-dashed border-green-900/50 rounded-md cursor-pointer aspect-video overflow-hidden">
        {previewURL ? (
          <video src={previewURL} controls={false} className="pointer-events-none absolute inset-0" />
        ) : (
          <>
            <Waveform className="size-7" />
            Selecionar um audio
          </>
        )}
      </label>
      <input type="file" id="video" accept="video/mp4" className="sr-only" onChange={handleFileSelected} />

      <Separator />

      <div className="space-y-2">
        <Label htmlFor="transcription_prompt">Prompt de transcrição</Label>
        <Textarea
          ref={promptInputRef}
          disabled={status !== 'waiting'}
          id="transcription_prompt"
          className="min-h-20 leading-relaxed resize-none"
          placeholder="Inclua palavras-chave mencionadas no video separadas por (,)"
        />
      </div>

      <Button
        type="submit"
        disabled={status !== 'waiting' || !videoFile}
        data-success={status === 'success'}
        className="w-full data-[success=true]:bg-green-700 select-none"
      >
        {status === 'waiting' ? (
          <>
            Carregar audio
            <UploadSimple className="size-4 ml-2" weight="bold" />
          </>
        ) : statusMessages[status]}
      </Button>
    </form>
  )
}