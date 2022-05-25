/**
 * @file matriz.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-24
 *
 * @copyright Copyright (c) 2022
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MATRIZ_L 3
#define MATRIZ_C 3

int main()
{
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int i;
    int j;
    int matriz[MATRIZ_L][MATRIZ_C];

    printf("\n\n**** Matriz de numeros ****\n\n");
    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            printf("Digite o numero da posicao [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("\n\nImprimindo valores da matriz\n\n");
    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            printf("%4d", matriz[i][j]);
        }
        printf("\n\n");
    }

    printf("\n\n");
    // system("pause");
    return 0;
}