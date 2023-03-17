import { format } from 'date-fns';
import express from 'express';
import { prisma } from './prisma';
import { PrismaIdeiasRepository } from './repositories/prisma/prisma-ideias-repository';
import { SubmitIdeiaUseCase } from './use-cases/submit-ideia-use-case';

export const routes = express.Router()

async function getUsers() {
    const users = await prisma.ideias.findMany()
    let newUsers = [] as any

    users.map(item => {
        const dt = format(item.createdAt, 'dd/MM/yyyy HH:mm:ii')
        const result = {
            id: item.id,
            image: item.image,
            title: item.title,
            category: item.category,
            description: item.description,
            link: item.link,
            createdAt: dt
        }

        newUsers.push(result)
    })

    return newUsers
}

routes.get('/', async (req, res) => {
    const users = await getUsers()
    // console.log(t)

    const reversedIdeas = [...users].reverse()
    let lastIdeas = []
    for (let idea of reversedIdeas) {
        if (lastIdeas.length < 2) {
            lastIdeas.push(idea)
        }
    }

    return res.render('index.html', { ideas: lastIdeas })
})

routes.get('/ideias', async (req, res) => {
    const users = await getUsers()

    const reversedIdeas = [...users].reverse()
    return res.render('ideias.html', { ideas: reversedIdeas })

})

routes.post('/', async (req, res) => {
    const { image, title, category, description, link } = req.body
    const prismaIdeiasRepository = new PrismaIdeiasRepository()
    const submitIdeiaUseCase = new SubmitIdeiaUseCase(
        prismaIdeiasRepository
    )

    await submitIdeiaUseCase.execute({
        image,
        title,
        category,
        description,
        link
    })

    return res.redirect('/')
})