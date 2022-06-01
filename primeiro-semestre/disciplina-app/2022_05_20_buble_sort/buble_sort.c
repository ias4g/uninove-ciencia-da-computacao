/**
 * @file buble_sort.c
 * @author Izael Silva (https//github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-20
 *
 * @copyright Copyright (c) 2022
 *
 * ORDENAÇÃO DE VALORES EM UM VETOR
 * ESTRUTURA DE ORDENAÇÃO BUBLESORT
 * ####################################################################
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define TAM 4 // CONSTANTE

int main()
{
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int numeros[TAM];
    int i;
    int aux;
    int cont;

    printf("Digite os %d numeros inteiros\n", TAM);
    for (i = 0; i < TAM; i++)
    {
        printf("Numeros %d: ", i + 1);
        scanf("%d", &numeros[i]);
    }

    printf("Ordem atual dos numeros: \n");
    for (i = 0; i < TAM; i++)
    {
        printf("%4d", numeros[i]);
    }

    printf("\nNumeros em ordem crescente:\n");
    for (cont = 1; cont < TAM; cont++)
    {
        for (i = 0; i < TAM - 1; i++)
        {
            if (numeros[i] > numeros[i + 1])
            { // Se Verdade --> Troca
                aux = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = aux;
            }
        }
    }

    for (i = 0; i < TAM; i++)
    {
        printf("%4d", numeros[i]);
    }

    printf("\n");
    return 0;
}