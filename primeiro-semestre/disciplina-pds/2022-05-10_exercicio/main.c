#include <stdio.h>
#include <stdlib.h>
#include <time.h> //para usar a fun��o rand()
#include <conio.h>
#include <ctype.h>	// para usar comando toupper( )
#include <string.h> //strings - tamanho de string

int main()
{
	char nome[15];
	int i, t;

	printf("Digite seu nome: ");
	fflush(stdin);
	gets(nome);

	t = strlen(nome); // contar quantos caracteres tem a palavra digitada

	for (i = 0; i <= t - 1; i++)
	{
		printf("%c", nome[i]);
		sleep(1);
	}

	printf("");

	for (i = t + 1; i >= 0; i--)
	{
		printf("%c", nome[i]);
		sleep(1);
	}

	printf(" -> Tem %d letras\n", t);

	printf("\n");
	system("pause");
	return 0;
}
