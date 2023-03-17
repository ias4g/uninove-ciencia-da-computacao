/**
 * @file matrizes.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-06-07
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

    int x = 25;
    int y = 5;
    int z = 0;

    for (z = 0; x >= y; x = x - y, z++)
    {
        printf("x=%2d, y=%2d, z=%2d\n", x, y, z);
    }

    printf("------------------\n\n");

    for (z = 0; x >= y; x = x - y, z++); // ESTE PONTO E VIRGULA FAZ COM QUE O FOR EXECUTE SOMENTE UMA VEZ, E PRINTA SOMENTE A ULTIMA LINHA
    printf("x=%2d, y=%2d, z=%2d\n", x, y, z);

    printf("------------------\n\n");
}