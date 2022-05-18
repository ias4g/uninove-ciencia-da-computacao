/**
 * @file programArray-2022-05-17.c
 * @author Izael Silva (https//github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-17
 *
 * @copyright Copyright (c) 2022
 *
 */

/**
 * Desenvolver um programa em C que permita o usuário cadastrar N nomes de alunos,
 * Escolher uma letra inicial para exibir a lista de nomes com a inicial escolhida.
 */

#include <stdio.h>
#include <string.h>
#include <conio.h>
#include <locale.h>
#include <stdlib.h>

int main()
{
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int n;
    int i;
    char cadastro[30][60];
    char hasLetra[10][20];
    char letra;

    printf("\tCADASTRO DE ALUNO.\n");
    printf("-----------------------------------------------------------------------------------------------\n\n");

    printf("QUANTOS NOME DESEJA CADASTRAR? ");
    scanf("%i", &n);

    printf("Legal! Você vai poder cadastar %i nomes.\n", n);
    for (i = 0; i < n; i++)
    {
        printf("Digite o %i nome: ", i + 1);
        fflush(stdin);
        gets(cadastro[i]);
    }

    printf("\nListando os nomes com a letra solicitada\n");
    printf("----------------------------------------------------------------------------------------------\n\n");
    printf("Digite a 1ª letra do nome: ");
    letra = toupper(getchar()); // scanf("%c", &letra); outra maneira de resolver
    for (i = 0; i < n; i++)
    {
        if (cadastro[i][0] == letra)
        {
            printf("Aluno %2d: %10s\n", i + 1, cadastro[i]);
        }
        else
        {
            printf("Nenhum nome encontrado com esta letra.\n");
            break;
        }

        // if (achei != 1)
        // {
        //     printf("Nenhum nome encontrado com esta letra.\n");
        // }
    }

    printf("----------------------------------------------------------------------------------------------\n\n");

    system("pause");
    return 0;
}