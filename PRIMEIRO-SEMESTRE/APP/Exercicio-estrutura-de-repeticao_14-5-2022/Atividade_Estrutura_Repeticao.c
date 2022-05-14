#include <stdio.h>
#include <stdlib.h>
#include <locale.h> //necessário para usar setlocale
#include <ctype.h>	//necessário para usar o isdigit()

// ########## DADOS DO ALUNO ##########
// NOME: IZAEL ALVES DA SILVA
// RA: 922114939
// TURMA 1/25

//	Faça um programa em C que permita entrar com o nome, a idade e o sexo de 5 pessoas.
//	O programa deve imprimir o nome da pessoa se ela for do sexo masculino e tiver mais de 20 anos.
//	Use  1 - para masculino - 2- para feminino

int main(void)
{
	setlocale(LC_ALL, "Portuguese");

	int sexo;
	int idade;
	int i = 1;
	char nome[50];
	int qtd_pessoas;
	char caracter_digitado;

	printf("\n\n");
	printf(">>>>>>>>>>>>>>>>>>>> PROGRAM STAR... \n\n");

	printf("Digite a quantidade de pessoas: ");
	scanf("%i", &qtd_pessoas);

	do
	{
		caracter_digitado = getch();
		if (isdigit(caracter_digitado) != 0)
		{
			printf("DIGITE APENAS NÚMEROS");
		}
		else
		{
			printf("Digite o nome da %iª pessoas: ", i);
			fflush(stdin);
			fgets(nome, 50, stdin);

			printf("Digite sua idade: ");
			scanf("%i", &idade);

			printf("Digite seu sexo | [1] - Masculino. [2] - Feminino: ");
			scanf("%i", &sexo);

			printf("----------------------------------------------------- \n");

			if (sexo == 1 && idade > 20)
			{
				printf("Nome: %s \n", nome, idade);
			}
			else
			{
				printf("Não enquadra nos requisitos do programa! \n");
			}

			i++;

			printf("####################################################### \n\n");
		}

	} while (i <= qtd_pessoas);

	printf(">>>>>>>>>>>>>>>>>>>> PROGRAM END... \n\n");

	return 0;
}