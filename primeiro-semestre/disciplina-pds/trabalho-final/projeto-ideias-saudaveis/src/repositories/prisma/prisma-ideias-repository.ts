import { prisma } from "../../prisma";
import { IdeiaCreateData, IdeiasRepository } from "../ideias-repository";

export class PrismaIdeiasRepository implements IdeiasRepository {
    async create({ image, title, category, description, link }: IdeiaCreateData) {
        await prisma.ideias.create({
            data: {
                image,
                title,
                category,
                description,
                link
            }
        })
    }
}