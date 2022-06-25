/**
 * @file rectangle.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 1.0
 * @date 24 de Junho de 2022
 *
 * @copyright Copyright (c) 2022
 *
 * Calculando a area
 * de um retangulo
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float area_rectangle(float b, float h)
{
    float a = b * h;
    return a;
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    float base;
    float height;
    float area;

    printf("CALCULANDO A AREA DE UM RETANGULO.\n");
    printf("****************************************\n\n");

    printf("Digite o valor da base: ");
    scanf("%f", &base);

    printf("Digite o valor da altura: ");
    scanf("%f", &height);

    area = area_rectangle(base, height);

    printf("\n\nArea: %.1f\n", area);
    printf("****************************************");
    printf("************** PROGRAM END *************\n\n");

    return 0;
}