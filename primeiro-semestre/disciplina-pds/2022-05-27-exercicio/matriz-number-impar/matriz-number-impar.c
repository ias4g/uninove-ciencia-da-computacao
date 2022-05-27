/**
 * @file matriz-number-impar.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-27
 *
 * @copyright Copyright (c) 2022
 * constriur um programa em c que armazena dados inteiros em uma
 * matriz de ordem 4x4 e imprima todos os elementos impares!
 */

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <locale.h>

#define MATRIZ_L 2
#define MATRIZ_C 2

int main()
{
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int i;
    int j;
    int matrix[MATRIZ_L][MATRIZ_C];

    printf("\n\n");
    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            printf("[%d][%d]=: ", i, j);
            scanf("%d", &matrix[i][j]);
        }
    }

    printf("\n\nMatriz digitada com todos os valores.\n");
    printf(".........................................\n");
    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            printf("%3d", matrix[i][j]);
        }

        printf("\n");
    }

    printf("\n\nMatriz com valores impares\n");
    printf("........................................\n");
    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            if (matrix[i][j] % 2 == 1)
            {
                printf("%3d", matrix[i][j]);
            }
            else
            {
                printf(" ");
            }
        }

        printf("\n");
    }

    return 0;
}