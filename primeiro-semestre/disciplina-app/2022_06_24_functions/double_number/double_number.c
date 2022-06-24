/**
 * @file double_number.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 1.0
 * @date 24 de Junho de 2022
 *
 * @copyright Copyright (c) 2022
 *
 * Faça um programa em c, que leia 3 numeros
 * pra cada um imprimir o dobro
 * o calculo deve ser realizado por uma função
 * e o resultado apresentado no final no programa
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

// void double_number(int n1, int n2, int n3)
// {
//     printf("\nO dobro do numero %d eh: %d\n", n1, n1 * 2);
//     printf("\nO dobro do numero %d eh: %d\n", n2, n2 * 2);
//     printf("\nO dobro do numero %d eh: %d\n", n3, n3 * 2);
// }

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    void double_number(int n1, int n2, int n3);
    int n1, n2, n3;

    printf("Digite tres numeros: ");
    scanf("%d %d %d", &n1, &n2, &n3);

    double_number(n1, n2, n3);

    return 0;
}

void double_number(int n1, int n2, int n3)
{
    printf("\nO dobro do numero %d eh: %d\n", n1, n1 * 2);
    printf("\nO dobro do numero %d eh: %d\n", n2, n2 * 2);
    printf("\nO dobro do numero %d eh: %d\n", n3, n3 * 2);
}