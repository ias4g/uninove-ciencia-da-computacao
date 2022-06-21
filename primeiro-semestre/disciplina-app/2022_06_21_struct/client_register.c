/**
 * @file client_register.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 1.0
 * @date 21 de Junho de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
#include <string.h>
#define qtd_client 2

struct tp_address
{
    int number;
    char city[25];
    char state[3];
    char code[10];
    char street[50];
    char district[50];
};

struct tp_birth_date
{
    int day;
    int month;
    int year;
};

struct client_register
{
    char name[50];
    char phone[20];
    struct tp_address address;
    struct tp_birth_date birthday;
} client[qtd_client];

int main()
{
    system('cls');
    system('color A');

    int i;

    printf("\n\n");
    printf("===================================\n");
    printf("-- CADASTRO DE CLIENTES --\n");
    printf("===================================\n\n");

    for (i = 0; i < qtd_client; i++)
    {
        printf("CLIENTE %d\n", i + 1);

        printf("NOME: ");
        fflush(stdin);
        gets(client[i].name);

        printf("TELEFONE: ");
        fflush(stdin);
        gets(client[i].phone);

        printf("RUA: ");
        fflush(stdin);
        gets(client);
    }

    system('pause');
    return 0;
}