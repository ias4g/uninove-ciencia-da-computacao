export interface IdeiaCreateData {
    image: string
    title: string
    category: string
    description: string
    link: string
}

export interface IdeiasRepository {
    create: (data: IdeiaCreateData) => Promise<void>
}