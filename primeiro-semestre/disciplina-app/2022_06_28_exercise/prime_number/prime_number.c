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
    int cont = 0;

    for (i = 1; i <= number; i++)
    {
        if (number % i == 0)
        {
            cont++;
        }
    }

    return cont;
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int number;
    int result;

    printf("Digite o numero inteiro para saber se eh primo: ");
    scanf("%d", &number);

    result = prime_number(number);

    if (result == 2)
    {
        printf("O numero %d eh primo.\n", number);
    }
    else
    {
        printf("O numero %d nao eh primo.\n\n", number);
    }

    return 0;
}