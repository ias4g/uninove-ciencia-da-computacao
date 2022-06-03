/**
 * Elabore um Algoritmo para resolver uma equação do 2º grau.
 * O usuario deve informar os coeficientes: a,b,c.
 *
 * Profª: Debora Virgilia Canne
 * Data postagem: 11 de março de 2022
 *
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    system("color A");

    float a;
    float b;
    float c;
    float x1;
    float x2;
    float delta;

    printf("\n\n");
    printf("\n\nf(x): ax2 + bx + c\n\n");

    printf("Digite o valar para o coeficiente A: ");
    scanf("%f", &a);

    printf("Digite o valar para o coeficiente B: ");
    scanf("%f", &b);

    printf("Digite o valar para o termo independente C: ");
    scanf("%f", &c);

    system("cls");

    printf("\n\nFuncao a ser resolvida -> f(x): %4.1fx2 + %4.1fx + %4.1f", a, b, c);
    printf("\n\n");

    delta = (b * b) - (4 * a * c);

    if (delta < 0)
    {
        printf("\nDelta = %8.2f\nNeste caso delta nao possui raizes reais.\n\n", delta);
    }
    else
    {
        if (delta == 0)
        {
            x1 = -b / (2 * a);
            printf("\nDelta = %.2f\n X1 = %.2f\n\n", delta, x1);
        }
        else
        {
            x1 = (-b - sqrt(delta)) / (2 * a);
            x2 = (-b + sqrt(delta)) / (2 * a);

            printf("Delta = %.1f\n X1 = %.1f\n X2 = %.1f\n\n", delta, x1, x2);
        }
    }

    system("pause");
    return 0;
}