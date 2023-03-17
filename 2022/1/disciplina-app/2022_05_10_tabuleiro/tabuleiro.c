/**
 * @file tabuleiro.c
 * @author Izael Silva (https//github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-05-20
 *
 * @copyright Copyright (c) 2022
 * ############################################################################################
 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h> //para usar a fun��o rand()
#include <conio.h>
#include <ctype.h> // para usar comando toupper( )

int main()
{
	system("color A");
	// IMPRIMIR UM TABULEIRO DE 8X8
	int L, C;

	printf("\tTABULEIRO DE XADREZ\n");
	printf("==================================\n");

	for (L = 0; L < 8; L++)
	{

		for (C = 0; C < 8; C++)
		{

			if ((L + C) % 2 == 0)
			{
				printf("\xFE "); // caractere da tabela ASCII em hexadecimal
			}
			else
			{
				printf("\x6F ");
			}
		}

		printf("\n");
	}
	printf("\n");

	system("pause");
	return 0;
}
