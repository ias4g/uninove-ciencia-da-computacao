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
 *
 * Professora: Debora Virgilia Canne
 * Data postagem: 19 de abril de 2022.
 * Data prevista de entrega: 23 de abril de 2022.
 * Data de entrega: 31 de Maio de 2022.
 * Valendo: 1 ponto
 * Anexar o arquivo do seu codigo ou  print da tela
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
    int opcao;

    printf("\n\n#########################################\n");
    printf("#\tESCOLHA UMA OPCAO ABAIXO. \t#\n");
    printf("#---------------------------------------#\n");
    printf("#\t1 - + ADICAO\t\t\t#\n");
    printf("#\t2 - - SUBTRACAO\t\t\t#\n");
    printf("#\t3 - * MULTIPLICACAO\t\t#\n");
    printf("#\t4 - / DIVISAO\t\t\t#\n");
    printf("#########################################\n\n");

    printf("QUAL OPERACAO MATEMATICA QUER FAZER? ");
    scanf("%i", &opcao);

    printf("\nDIGITE O NUMERO INTEIRO QUE DESEJA FAZER A OPERACAO ESCOLHIDA: ");
    scanf("%i", &number);

    switch (opcao)
    {
    case 1:
        printf("\n\n.................... RESULTADO ....................\n\n");
        for (i = 1; i <= 10; i++)
        {
            printf("%2i + %i = %2i\n", number, i, number + i);
        }
        printf("\n\n");
        break;

    case 2:
        printf("\n\n.................... RESULTADO ....................\n\n");
        for (i = number; i <= 10 + number; i++)
        {
            printf("%2i - %i = %2i\n", i, number, i - number);
        }
        printf("\n\n");
        break;

    case 3:
        printf("\n\n.................... RESULTADO ....................\n\n");
        for (i = 1; i <= 10; i++)
        {
            printf("%2i * %2i = %2i\n", number, i, number * i);
        }
        printf("\n\n");
        break;

    case 4:
        printf("\n\n.................... RESULTADO ....................\n\n");
        for (i = number; i <= 10 * number; i += number)
        {
            printf("%2i / %2i = %2i\n", i, number, i / number);
        }
        printf("\n\n");
        break;

    default:
        printf("\n\n\n-----------------------------------------------------------------------------\n");
        printf("OPERACAO INVALIDA - [ escolha apenas 1, 2, 3 ou 4 ]\n");
        printf("-----------------------------------------------------------------------------\n\n\n");
        break;
    }

    system("pause");
    return 0;
}