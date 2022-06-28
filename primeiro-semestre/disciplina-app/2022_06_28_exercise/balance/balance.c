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

    float balance;
    float rate;
    float new_balance;

    printf("Informe seu saldo em reais: ");
    scanf("%f", &balance);

    printf("Informe o percentual do reajuste: ");
    scanf("%f", &rate);

    new_balance = calculate_balance(balance, rate);

    printf("Saldo anterior: %.2f reais\n", balance);
    printf("Saldo atual: %.2f reais\n\n", new_balance);

    return 0;
}