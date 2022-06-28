/**
 * @file factorial.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 1.0
 * @date 28 de Junho de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float factorial(int number)
{
    int fact = 1;
    int i;

    for (i = 0; i < number; i++)
    {
        fact = fact * i;
    }

    return fact;
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int number;
    int fat = 0;

    printf("Deseja saber o fatorial de qual numero: ");
    scanf("%d", &number);

    fat = factorial(number);

    printf("Fatorial de %d eh: %d\n\n", number, fat);

    return 0;
}