/**
 * @file prime_number.c
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

int prime_number(int number)
{
    int i;
    int aux = 0;

    for (i = 0; i <= number; i++)
    {
        if (number % i == 0)
        {
            aux++;
        }
    }
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    return 0;
}