/**
 * @file search-name-array.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-24
 *
 * @copyright Copyright (c) 2022
 *
 * CADASTRO DE NOMES DE EMPRESAS DE TI
 */

#include <stdio.h>
#include <string.h>
#define QUANT 2

int main()
{
    system("color A");
    int i;
    int achei = 0;
    char busca[50];
    char empresa[QUANT][50];

    printf("===============================\n");
    printf("\t** CADASTRO DE EMPRESAS **\n");
    printf("===============================\n");

    for (i = 0; i < QUANT; i++)
    {
        printf("DIGITE O NOME DA %dEMPRESA: ", i + 1);
        gets(empresa[i]);
    }

    printf("-- EMPRESAS CADASTRADAS --\n");
    for (i = 0; i < QUANT; i++)
    {
        printf("%s\t", empresa[i]);
    }

    printf("\n\nDIGITE O NAME DA EMPRESA QUE DESEJA CONSULTAR: ");
    gets(busca);
    for (i = 0; i < QUANT; i++)
    {
        if (strcmp(empresa[i], busca) == 0)
        {
            printf("\n\nEMPRESA ENCONTRADA: %s\n\n", empresa[i]);
            achei = 1;
        }
    }

    if (!achei)
    {
        printf("EMPRESA NAO ENCONTRADA!\n");
    }
}