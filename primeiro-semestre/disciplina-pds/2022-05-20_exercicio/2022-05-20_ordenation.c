/**
 * @file 2022-05-20_ordenation.c
 * @author Izael Silva (https//github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-20
 *
 * @copyright Copyright (c) 2022
 * ####################################################################
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define SIZE 5

int main()
{
    system("color f");
    setlocale(LC_ALL, "Portuguese");

    int i;             // controle do laço
    char letras[SIZE]; // recebe 10 caracteres

    for (i = 0; i < SIZE; i++)
    {
        printf("Digite a %2dª letra: ", i + 1);
        fflush(stdin);
        scanf("%c", &letras[i]); // lê e guarda o valor
    }
    printf("\n\n");
    printf("-. Lista das letras .-\n");
    printf("####################################################################\n");

    for (i = 0; i < SIZE; i++)
    { // laço para imprimir o valor
        printf("%2dª Letra: %c\n", i + 1, letras[i]);
    }
    printf("\n\n");
    system("pause");
    return 0;
}
