/**
 * @file test.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 1.0
 * @date 12 de Junho de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int numX = -5;
    int numY = 10;
    int numZ = 13;
    int aux;

    numX++;           // - 5 + 1 => -4
    numY -= 2;        // 10 - 2 => 8
    numZ *= numX + 1; // 13 * (- 4 + 1) => -39
    aux = numY++;     // aux recebe o valor anterior de numY = 8; só depois incrementa = 9

    printf("numX = %d,  numY = %d,  numZ = %d,  aux = %d\n\n", numX, numY, numZ, aux);

    return 0;
}