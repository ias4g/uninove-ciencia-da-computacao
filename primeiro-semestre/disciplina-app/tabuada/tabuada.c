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
    int opcao;

    printf("\n\n#########################################\n");
    printf("#\tESCOLHA UMA OPCAO ABAIXO. \t#\n");
    printf("#---------------------------------------#\n");
    printf("#\t1 - ADICAO\t\t\t#\n");
    printf("#\t2 - SUBTRACAO\t\t\t#\n");
    printf("#\t3 - MULTIPLICACAO\t\t\t#\n");
    printf("#\t4 - DIVISAO\t\t\t#\n");
    printf("#########################################\n\n");

    printf("QUAL OPERACAO MATEMATICA QUER FAZER? ");
    scanf("%i", &opcao);

    printf("\nDIGITE O NUMERO INTEIRO QUE DESEJA FAZER A OPERACAO ESCOLHIDA: ");
    scanf("%i", &number);

    printf("\n\nRESULTADO\n\n");
    switch (opcao)
    {
    case 1:
        for (i = 0; i <= 10; i++)
        {
            printf("%i + %i = %i\n", number, i, number + i);
        }
        break;

    case 2:
        for (i = 0; i <= 10; i++)
        {
            printf("%i - %i = %f\n", number, i, number - i);
        }
        break;

    case 3:
        for (i = 0; i <= 10; i++)
        {
            printf("%i * %i * %i\n", number, i, number * i);
        }
        break;

    case 4:
        for (i = 0; i <= 10; i++)
        {
            printf("%i / %i = %i\n", i + number, i, number / i);
        }
        break;

    default:
        printf("OPERACAO INVALIDA!");
        break;
    }
    // for (i = 0; i <= 10; i++)
    // {
    //     printf("%i x %i = %i\n", number, i, number * i);
    // }

    system("pause");
    return 0;
}