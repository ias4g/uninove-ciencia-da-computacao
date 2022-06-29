/**
 * @file exercicio_07.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 1.0
 * @date 29 de Junho de 2022
 *
 * @copyright Copyright (c) 2022
 *
 * Faça um programa que leia a base e a altura de um retângulo e,
 * imprima o perímetro, a área e a diagonal.
 * Para fazer os cálculos, implemente três funções,
 * cada uma deve realizar um cálculo especifico conforme solicitado.
 * Utilize as fórmulas a seguir.
 * perimetro = 2x (base + altura)
 * area = base x altura
 * diagonal Vbase2+ altura2
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float calculate_perimeter(float b, float h)
{
    return 2 * (b + h);
}

float calculate_area(float b, float h)
{
    return b * h;
}

float calculate_diagonal(float b, float h)
{
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    printf("%.2f", calculate_perimeter(6, 4));

    return 0;
}