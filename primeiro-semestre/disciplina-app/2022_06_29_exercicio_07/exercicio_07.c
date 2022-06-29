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
    float b_pow_two = pow(b, 2);
    float h_pow_two = pow(h, 2);

    float soma = b_pow_two + h_pow_two;

    return sqrt(soma);
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    printf("Perimetro: %.2f\n", calculate_perimeter(6, 4));
    printf("Area: %.2f\n", calculate_area(6, 4));
    printf("Diagonal: %.2f\n\n", calculate_diagonal(6, 4));

    return 0;
}