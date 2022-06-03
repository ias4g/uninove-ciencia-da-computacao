/**
 * Desenvolver um programa em linguagem c
 * para exibir a soma das linhas de uma matriz
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define ML 3 // define a quantidade de linhas que a matriz tem
#define MC 3 // define a quantidade de colunas que a matriz tem

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int i;
    int j;
    float soma;
    float SL[ML][MC];

    printf("\n\n");
    printf("ESTE PROGRAMA ARMAZENA UMA DETERMINADA MATRIZ\n");
    printf("E EXIBE A SOMA DE CADA LINHA.\n\n");

    for (i = 0; i < ML; i++)
    {
        for (j = 0; j < MC; j++)
        {
            printf("SL[%i][%i] = ", i, j);
            scanf("%f", &SL[i][j]);
        }
    }

    for (i = 0; i < ML; i++)
    {
        for (j = 0; j < MC; j++)
        {
            printf("%8.2f", SL[i][j]);
        }

        printf("\n\n");
    }

    for (i = 0; i < ML; i++)
    {
        for (j = 0; j < MC; j++)
        {
            soma += SL[i][j];
        }

        printf("SL {%i} = %.2f\n", i + 1, soma);
        soma = 0;
    }

    system("pause");
    return 0;
}