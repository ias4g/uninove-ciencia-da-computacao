import { FastifyInstance } from 'fastify'
import { z } from 'zod';
import { prisma } from '../lib/prisma'
import { createReadStream } from 'node:fs' // Alterado de 'node:fs' para 'fs'
import { openai } from '../lib/openai'

export async function createTranscriptionRoute(app: FastifyInstance) {
  app.post('/videos/:videoId/transcription', async (request, reply) => { // Corrigido 'replay' para 'reply'
    const paramsSchema = z.object({
      videoId: z.string().uuid()
    })

    const { videoId } = paramsSchema.parse(request.params);

    const bodySchema = z.object({
      prompt: z.string()
    })
    const { prompt } = bodySchema.parse(request.body);

    const video = await prisma.video.findUniqueOrThrow({
      where: {
        id: videoId
      }
    })

    const videoPath = video.path;
    const audioReadStream = createReadStream(videoPath);

    try {
      const response = await openai.audio.transcriptions.create({
        file: audioReadStream,
        model: "whisper-1",
        language: 'pt',
        response_format: 'json',
        temperature: 0,
        prompt
      })

      const transcription = response.text

      await prisma.video.update({
        where: {
          id: videoId,
        },
        data: {
          transcription
        }
      })

      return { transcription }
      
    } catch (error) {
      return reply.status(400).send({ message: error })
    }
  })
}
