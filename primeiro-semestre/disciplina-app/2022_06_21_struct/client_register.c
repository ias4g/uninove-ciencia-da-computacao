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
    char zipcode[10];
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
    system("cls");
    system("color A");

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
        gets(client[i].address.street);

        printf("NUMERO: ");
        fflush(stdin);
        scanf("%d", &client[i].address.number);

        printf("BAIRRO: ");
        fflush(stdin);
        gets(client[i].address.district);

        printf("CIDADE: ");
        fflush(stdin);
        gets(client[i].address.city);

        printf("ESTADO: ");
        fflush(stdin);
        gets(client[i].address.state);

        printf("CEP: ");
        fflush(stdin);
        gets(client[i].address.zipcode);

        printf("DIA: ");
        fflush(stdin);
        scanf("%d", &client[i].birthday.day);

        printf("MES [EX: 01]: ");
        fflush(stdin);
        scanf("%d", &client[i].birthday.month);

        printf("ANO [EX: 2022]: ");
        scanf("%d", &client[i].birthday.year);
    }

    for (i = 0; i < qtd_client; i++)
    {
        printf("\nCLIENTE %d\n", i + 1);
        printf("NOME: %s\n", client[i].name);
        printf("TELEFONE: \n", client[i].phone);
        printf("ANIVERSARIO: %2d/%2d/%d", client[i].birthday.day, client[i].birthday.month, client[i].birthday.year);
    }

    printf("\n\n");

    // system("pause");
    return 0;
}