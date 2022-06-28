/**
 * @file balance.c
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
#include <locale.h>

float calculate_balance(float value, float rate)
{
    return value + (rate / 100);
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    system("pause");
    return 0;
}