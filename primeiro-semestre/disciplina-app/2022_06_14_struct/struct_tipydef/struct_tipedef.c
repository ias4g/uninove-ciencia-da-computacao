/**
 * @brief
 * @version 1.0
 * @file struct_tipedef.c
 * @date 14 de Junho de 2022
 * @copyright Copyright (c) 2022
 *
 * @author Izael Silva (https://github.com/Ias4g)
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct
{
    int idade;
    float peso;
    float altura;
} pessoa;

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    pessoa p1, p2;

    p1.peso = 54.5;

    printf("Peso = %.1fKg\n\n", p1.peso);

    return 0;
}