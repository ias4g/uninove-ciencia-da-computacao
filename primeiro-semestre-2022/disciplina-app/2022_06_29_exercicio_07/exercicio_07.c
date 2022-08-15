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
 * diagonal Raiz(base2 + altura2)
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float calculate_perimeter(float b, float h)
{
    // GOSTO MAIS DESSA FORMA
    return 2 * (b + h);

    // OUTRA MANEIRA DE RESOLVER.
    // return ((2 * b) + (2 * h));
}

float calculate_area(float b, float h)
{
    return b * h;
}

float calculate_diagonal(float b, float h)
{
    // VERSÃO VERBOSA
    // float b_pow_two = pow(b, 2);
    // float h_pow_two = pow(h, 2);
    // float soma = b_pow_two + h_pow_two;
    // return sqrt(soma);

    // VERSÃO SIMPLES E DIRETA
    return sqrt((pow(b, 2)) + (pow(h, 2)));
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    float base;
    float height;

    float area;
    float diagonal;
    float perimeter;

    printf("\n\n");
    printf("INFORME A BASE: ");
    scanf("%f", &base);

    printf("INFORME A ALTURA: ");
    scanf("%f", &height);

    area = calculate_area(base, height);
    diagonal = calculate_diagonal(base, height);
    perimeter = calculate_perimeter(base, height);
    printf("--------------------------------------------\n\n");

    system("cls");
    printf("\n\n");
    printf("RESULTADOS:\n\n");

    printf("Area: %.1fcm\n", area);
    printf("Perimetro: %.1fcm\n", perimeter);
    printf("Diagonal: %.1fcm\n", diagonal);
    printf("--------------------------------------------\n\n");

    return 0;
}