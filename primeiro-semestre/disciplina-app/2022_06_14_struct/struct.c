/**
 * @brief
 * @version 1.0
 * @file struct.c
 * @date 14 de Junho de 2022
 * @copyright Copyright (c) 2022
 *
 * @author Izael Silva (https://github.com/Ias4g)
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

struct ficha_aluno
{
    char nome[50];
    char disciplina[50];
    float n1;
    float n2;
};

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    struct ficha_aluno Aluno;

    printf("Cadastro da ficha de aluno\n");
    printf("----------------------------------\n\n");

    printf("Nome do aluno: ");
    fflush(stdin);
    gets(Aluno.nome);

    printf("Disciplina: ");
    fflush(stdin);
    gets(Aluno.disciplina);

    printf("Prova 01: ");
    scanf("%f", &Aluno.n1);

    printf("Prova 02: ");
    scanf("%f", &Aluno.n2);

    printf("\n\n");
    system("cls");

    printf("Informacoes do aluno\n");
    printf("=============================\n\n");
    printf("Nome: %s\n", Aluno.nome);
    printf("Disciplina: %s\n", Aluno.disciplina);
    printf("Nota da primeira prova: %.2f\n", Aluno.n1);
    printf("Nota da segunda prova: %.2f\n\n", Aluno.n2);

    printf("FIM DO PROGRAMA...\n\n");

    return 0;
}