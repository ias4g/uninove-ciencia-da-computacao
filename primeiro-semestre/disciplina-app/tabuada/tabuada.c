/**
 * @file tabuada.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-30
 *
 * @copyright Copyright (c) 2022
 *
 * FAZER UM ALGORITMO EM LINGUAGEM C PARA EXIBIR NA TELA A TABUADA ESCOLHIDA PELO USUARIO.
 * USE A ESTRUTURA WHILE(). Trabalhe as formatações de saída.
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    system("color A");

    int i;
    int number;
    char operacao;

    printf("Digite o numero para fazer a operacao: ");
    scanf("%i", &number);

    printf("Digite a operacao [+][-][*][/]: ");
    scanf("%c", &operacao);

    printf("%s\n", operacao);

    for (i = 0; i <= 10; i++)
    {
        printf("%i x %i = %i\n", number, i, number * i);
    }

    return 0;
}