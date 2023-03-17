/**
 * @file functions.c
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
#include <math.h>

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    float number;
    float root;

    printf("\n\n");

    printf("Digite um numero: ");
    scanf("%f", &number);

    root = sqrt(number);

    printf("A raiz quadrada do numero %.2f, eh %.2f\n\n", number, root);

    // system("pause");
    return 0;
}