/**
 * @file search-number-array.c
 * @author Izael Silva (https://gitub.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-24
 *
 * @copyright Copyright (c) 2022
 *
 * BUSCA DE VALORES EM UM VETOR
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define QUANT 4

int main()
{
    system("color E");
    setlocale(LC_ALL, "Portuguese");

    int vet[QUANT], i, nump, achei = 0;

    for (i = 0; i < QUANT; i++)
    { // leitura dos valores
        printf(" Digite o [%d]º número: ", i + 1);
        scanf("%d", &vet[i]);
    }
    printf("\n");
    printf("Qual valor deseja consultar? ");
    scanf("%d", &nump);

    // imprimir valor quando existir

    for (i = 0; i < QUANT; i++)
    {
        if (vet[i] == nump)
        {
            printf("O número %d está na posição %d\n", nump, i + 1);
            achei = 1; // verdade
        }
    }

    // caso não consta o valor
    if (achei != 1)
    {
        printf("O número %2d não existe nesta relação.\n", nump);
    }
    printf("\n\n");
    system("pause");
    return 0;
}
