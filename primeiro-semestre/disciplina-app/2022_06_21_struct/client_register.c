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
};

int main()
{
    system('cls');
    system('color A');
    setlocale(LC_ALL, 'Portuguese');

    system('pause');
    return 0;
}