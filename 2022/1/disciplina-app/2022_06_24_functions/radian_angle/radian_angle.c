/**
 * @file radian_angle.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 1.0
 * @date 24 de Junho de 2022
 *
 * @copyright Copyright (c) 2022
 *
 * Faça um programa em C
 * que leia o valor de um angulo em graus
 * e o converta, ultilizando uma função
 * para radiano e no final imprimir o resultado.
 * Formula: rad = (ang * pi) / 180
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float radian_angle(int valor)
{
    return (valor * 3.14) / 180;
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int valor;
    float radian;

    printf("Convertendo angulo em radiano.\n");
    printf("**********************************\n\n");

    printf("Informe o angulo em graus: ");
    scanf("%d", &valor);

    radian = radian_angle(valor);

    printf("\n\nO resultado eh: %.2f", radian);
    printf("\n**********************************\n");
    printf("PROGRAM END ****************\n\n");

    return 0;
}