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

#define MATRIZ_L 4
#define MATRIZ_C 4

int main()
{
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int i;
    int j;
    int matrix[MATRIZ_L][MATRIZ_C];

    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            printf("[%d][%d]=: ", i, j);
            scanf("%d", &matrix[i][j]);
        }
    }

    printf("Matriz digitada com todos os valores.\n");
    printf("----------------------------------------");

    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            printf("[%d][%d]=: ", i, j);
        }
    }

    return 0;
}