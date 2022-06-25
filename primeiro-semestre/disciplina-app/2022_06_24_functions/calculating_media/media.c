/**
 * @file media.c
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

float calculating_media(float p1, float p2, float p3)
{
    return (p1 + p2 + p3) / 3;
}

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    float n1;
    float n2;
    float n3;

    printf("Calculo da media de 3 provas.\n");
    printf("**********************************\n\n");

    printf("Digite as tres notas, dando enter depois de cada uma.");
    scanf("%f %f %f", &n1, &n2, &n3);

    return 0;
}