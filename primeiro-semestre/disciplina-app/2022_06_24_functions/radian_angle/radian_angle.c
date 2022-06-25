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

    return 0;
}