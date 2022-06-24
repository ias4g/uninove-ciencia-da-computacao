/**
 * @file potence.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 1.0
 * @date 24 de Junho de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    float base;
    float exp;
    float pot;

    printf("Informe o valor da base: ");
    scanf("%f", &base);

    printf("Informe o valor do expoente: ");
    scanf("%f", &exp);

    pot = pow(base, exp);

    system("pause");
    return 0;
}