import { IdeiasRepository } from "../repositories/ideias-repository"

interface SubmitIdeiaUseCaseRequest {
    image: string
    title: string
    category: string
    description: string
    link: string
}

export class SubmitIdeiaUseCase {
    constructor(
        private ideiasRepository: IdeiasRepository,
    ) { }

    async execute(req: SubmitIdeiaUseCaseRequest) {
        const {
            image,
            title,
            category,
            description,
            link
        } = req

        await this.ideiasRepository.create({
            image,
            title,
            category,
            description,
            link
        })

    }
} 