import { fastify } from 'fastify'
import fastifyCors from '@fastify/cors'
import { createPrompts } from './routes/create-prompts'
import { uploadVideoRoute } from './routes/upload-video'
import { getAllPromptsRoute } from './routes/get-all-prompts'
import { createTranscriptionRoute } from './routes/create-transcription'
import { generateAiCompletionRoute } from './routes/generate-ai-completion'

const app = fastify()

app.register(fastifyCors, {
  origin: '*'
})

app.register(createPrompts)
app.register(uploadVideoRoute)
app.register(getAllPromptsRoute)
app.register(createTranscriptionRoute)
app.register(generateAiCompletionRoute)

app.listen(
  { port: 3333 }
).then(() => {
  console.log('HTTP Server running on host: http://localhost:3333')
})