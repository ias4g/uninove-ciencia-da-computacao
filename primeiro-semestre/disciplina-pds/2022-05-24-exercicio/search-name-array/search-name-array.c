/**
 * @file search-name-array.c
 * @author Izael Silva (https://gitub.com/Ias4g)
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

int main()
{
    char empresa[4][50];
    int i;

    printf("===============================\n");
    printf("**\t CADASTRO DE EMPRESAS **\n");
    printf("===============================\n");

    for (i = 0; i < 4; i++)
    {
        printf("DIGITE O NOME DA %dEMPRESA: ", i + 1);
        gets(empresa[i]);
    }
}