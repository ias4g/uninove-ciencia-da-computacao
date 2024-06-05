import { FastifyInstance } from 'fastify'
import { z } from 'zod'
import { prisma } from '../lib/prisma'

export async function createPrompts(app: FastifyInstance) {
  app.post('/prompts', async (request, replay) => {
    const bodySchema = z.object({
      title: z.string(),
      template: z.string()
    })
    const { title, template } = bodySchema.parse(request.body)

    const prompt = await prisma.prompt.create({
      data: {
        title,
        template
      }
    })

    return prompt
  })
}