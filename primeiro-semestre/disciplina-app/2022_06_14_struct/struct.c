/**
 * @brief
 * @version 1.0
 * @file struct.c
 * @date 14 de Junho de 2022
 * @copyright Copyright (c) 2022
 *
 * @author Izael Silva (https://github.com/Ias4g)
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

struct ficha_aluno
{
    char nome[50];
    char disciplina[50];
    float n1;
    float n2;
};

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    struct ficha_aluno Aluno;

    system("pause");
    return 0;
}