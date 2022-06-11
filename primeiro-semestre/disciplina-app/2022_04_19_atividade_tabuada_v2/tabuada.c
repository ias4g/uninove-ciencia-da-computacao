/**
 * @file tabuada.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 0.2
 * @date 2022-04-19
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
    system("cls");
    setlocale(LC_ALL, "Portuguese");
    system("color A");

    int i;
    int number;
    char operation;

    do
    {
        printf("\n\n#########################################\n");
        printf("#\tESCOLHA UMA OPCAO ABAIXO. \t#\n");
        printf("#---------------------------------------#\n");
        printf("#\t+ ADICAO\t\t\t#\n");
        printf("#\t- SUBTRACAO\t\t\t#\n");
        printf("#\t* MULTIPLICACAO\t\t\t#\n");
        printf("#\t/ DIVISAO\t\t\t#\n");
        printf("#########################################\n\n");

        printf("\nDIGITE UM NUMERO: ");
        scanf("%i", &number);

        printf("\nDIGITE [+] [-] [*] [/] OU PRESSIONE 'F' PARA FINALIZAR O PROGRAMA: ");
        setbuf(stdin, NULL); // limpa o buffer do teclado
        scanf("%c", &operation);

        // getchar();
        // printf("Caracter = %s\n", operation);

        system("cls");

        switch (operation)
        {
        case '+':
            printf("\n\n.................... RESULTADO ....................\n\n");
            for (i = 1; i <= 10; i++)
            {
                printf("%2i + %i = %2i\n", number, i, number + i);
            }
            printf("\n............................................................\n");
            break;

        case '-':
            printf("\n\n.................... RESULTADO ....................\n\n");
            for (i = number; i <= 10 + number; i++)
            {
                printf("%2i - %i = %2i\n", i, number, i - number);
            }
            printf("\n............................................................\n");
            break;

        case '*':
            printf("\n\n.................... RESULTADO ....................\n\n");
            for (i = 1; i <= 10; i++)
            {
                printf("%2i * %2i = %2i\n", number, i, number * i);
            }
            printf("\n............................................................\n");
            break;

        case '/':
            printf("\n\n.................... RESULTADO ....................\n\n");
            for (i = number; i <= 10 * number; i += number)
            {
                printf("%2i / %2i = %2i\n", i, number, i / number);
            }
            printf("\n............................................................\n");
            break;

        default:
            printf("\n\n\n-----------------------------------------------------------------------------\n");
            printf("OPERACAO INVALIDA, ESCOLHA APENAS AS OPERACOES MATEMATICAS [+] [-] [*] [/].\n");
            printf("-----------------------------------------------------------------------------\n\n\n");
            break;
        }
    } while (operation != 'f' && operation != 'F');

    system("cls");
    printf("\nPROGRAMA FINALIZADO...\n\n");

    return 0;
}