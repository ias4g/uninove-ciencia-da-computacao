import { Button } from "@/components/ui/button";
import { SpotifyLogo, YoutubeLogo, Waveform, MagicWand } from "@phosphor-icons/react"
import { Separator } from "./components/ui/separator";
import { Textarea } from "./components/ui/textarea";
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from "./components/ui/select";
import { Slider } from "./components/ui/slider";
import { Label } from "./components/ui/label";
import { VideoInputForm } from "./components/video-input-form";
import { PromptSelect } from "./components/prompt-select";
import { useState } from "react";
import { useCompletion } from 'ai/react'

export function App() {
  const [temperature, setTemperature] = useState(0.5)
  const [videoId, setVideoId] = useState<string | null>(null)

  const { input, setInput, handleInputChange, handleSubmit, completion, isLoading } = useCompletion({
    api: 'http://localhost:3333/ai/complete',
    body: {
      videoId,
      temperature
    },
    headers: {
      "Content-Type": "application/json"
    }
  })

  return (
    <div className="min-h-screen flex flex-col">
      <div className="px-6 py-3 flex items-center justify-between border-b border-green-900/50">
        <div className="flex flex-col items-center justify-center">
          <Waveform className="size-5" />
          <h1 className="text-base font-bold">
            <span className="text-green-500">speech</span>4<span className="text-green-500">text</span>.ai
          </h1>
        </div>
        <div className="flex items-center gap-3">
          <span className=" text-xs text-muted-foreground">
            Desenvolvido com ❤ como trabalho de conclusão do 5º semestre do curso de ciência da computação
          </span>
          <Separator orientation="vertical" className="h-6" />
          <Button variant={"outline"}>
            <SpotifyLogo className="size-5 mr-2 text-green-500" />
            Spotify
          </Button>
          <Button variant={"outline"}>
            <YoutubeLogo className="size-5 mr-2 text-red-500" />
            Youtube
          </Button>
        </div>
      </div>

      <main className="flex-1 p-6 flex gap-6">
        {/* <header className="h-40 flex items-center justify-between space-x-6">
          <form className="h-full aspect-video">
            <label
              htmlFor="video"
              className="h-full flex flex-col items-center justify-center gap-4 bg-green-900/10 hover:bg-green-900/20 transition-colors border border-dashed border-green-900/50 rounded-md cursor-pointer aspect-video"
            >
              <Waveform className="size-7" />
              Selecionar um audio
            </label>
            <input type="file" name="video" id="video" accept="audio/mp3" className="sr-only" />

            <Separator orientation="vertical" />  

            <div className="flex-1 w-full space-y-1">
              <p>Prompt de transcição</p>
              <Textarea className="h-20 resize-none p-2 leading-relaxed" placeholder="Inclua o prompt para a AI..." />
            </div>
            <Button className="w-full flex gap-2 text-base" type="submit">
              Carregar audio
              <UploadSimple className="size-4" weight="bold" />
            </Button>
          </form>

          <Separator orientation="vertical" />

          <form className="h-full aspect-video flex flex-col justify-between">
            <div className="space-y-1">
              <p>Prompt</p>
              <Select>
                <SelectTrigger>
                  <SelectValue placeholder="Selecione um prompt" />
                </SelectTrigger>
                <SelectContent>
                  <SelectItem value="spotify">Spotify</SelectItem>
                  <SelectItem value="youtube">Youtube</SelectItem>
                </SelectContent>
              </Select>
            </div>
            <div className="space-y-1">
              <p>Modelo</p>
              <Select disabled>
                <SelectTrigger>
                  <SelectValue placeholder="GPT 3.5-turbo 16k" />
                </SelectTrigger>
                <SelectContent>
                  <SelectItem value="gpt-3.5">GPT 3.5-turbo 16k</SelectItem>
                </SelectContent>
              </Select>
            </div>
            <span className="text-xs text-muted-foreground">Você poderá customizar essa opção em breve</span>
          </form>

          <Separator orientation="vertical" />

          <form className="h-full  aspect-video flex flex-col justify-between">
            <div className="space-y-3">
              <p>Prompt de transcição</p>
              <Slider className="bg-zinc-900" defaultValue={[33]} max={100} step={1} />
            </div>
            <span className="text-xs text-muted-foreground">Você poderá customizar essa opção em breve</span>
            <Button className="w-full flex gap-2 items-center justify-center text-base">
              Executar
              <MagicWand className="size-4" weight="bold" />
            </Button>
          </form>
        </header> */}
        <div className="flex flex-col flex-1 gap-4">
          <div className="grid grid-rows-2 gap-4 flex-1">
            <Textarea
              placeholder="Inclua o prompt para a AI..."
              className="resize-none p-4 leading-relaxed text-base"
              value={input}
              onChange={handleInputChange}
            />
            <Textarea
              readOnly
              placeholder="Resultado gerado pela AI..."
              className="resize-none p-4 leading-relaxed text-base"
              value={completion}
            />
          </div>
          <p className="text-xs text-muted-foreground">
            Lembre-se: você pode utilizar a variavel <code className="text-green-500">{'{description}'}</code> no seu prompt para adicionar o conteudo da transcrição do video selecionado.
          </p>
        </div>

        <aside className="w-64 space-y-6">
          <VideoInputForm onVideoUploaded={setVideoId} />

          <Separator />

          <div className="space-y-2">
            <Label>Prompt</Label>
            <PromptSelect onPromptSelected={setInput} />
          </div>

          <form onSubmit={handleSubmit} className="space-y-6">
            <div className="space-y-2">
              <Label>Modelo</Label>
              <Select defaultValue="gpt-3.5" disabled>
                <SelectTrigger>
                  <SelectValue />
                </SelectTrigger>
                <SelectContent>
                  <SelectItem value="gpt-3.5">GPT 3.5-turbo 16k</SelectItem>
                </SelectContent>
              </Select>
              <span className="block text-xs text-muted-foreground italic">
                Você poderá customizar esta opção em breve
              </span>
            </div>

            <Separator />

            <div className="space-y-4">
              <Label>Temperatura</Label>
              <Slider
                className="bg-zinc-900"
                min={0}
                max={1}
                step={0.1}
                value={[temperature]}
                onValueChange={vl => setTemperature(vl[0])}
              />
              <span className="block text-xs text-muted-foreground italic leading-relaxed">
                Valores mais altos tendem a deixar o resultado mais criativo e com possiveis erros.
              </span>
            </div>

            <Separator />

            <Button disabled={isLoading} type="submit" className="w-full">
              Executar
              <MagicWand className="size-4 ml-2" weight="bold" />
            </Button>
          </form>
        </aside>
      </main>
    </div>
  )
}
