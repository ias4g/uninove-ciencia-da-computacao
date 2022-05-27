/**
 * @file matriz-number-real.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-27
 *
 * @copyright Copyright (c) 2022
 * Constriur um programa em c que armazena dados reais em uma
 * matriz de ordem 3x2 e imprima todos os elementos!
 */

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <locale.h>

#define MATRIZ_L 3
#define MATRIZ_C 2

int main()
{
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int i;
    int j;
    float mat[MATRIZ_L][MATRIZ_C];

    printf("Matriz de numeros reais\n");
    printf("-------------------------------------\n");

    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            printf("[%d][%d]= ", i, j);
            scanf("%f", &mat[i][j]);
        }
    }

    printf("\n");

    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            printf("%5.1f", mat[i][j]);
        }

        printf("\n");
    }

    return 0;
}