/**
 * @file struct_initial.c
 * @author Izael Silva (https://github.com/Ias4g)
 * @brief
 * @version 0.1
 * @date 2022-06-07
 *
 * @copyright Copyright (c) 2022
 *
 */
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>

struct struct_initial
{
    char name[20];
    char reference[5];
    float price;
};

int main()
{
    system("cls");
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    // tipo de dado nome var
    struct struct_initial example;

    printf("Nome do componente: ");
    fgets(example.name, 20, stdin);

    printf("Reference: ");
    fflush(stdin);
    fgets(example.reference);

    printf("Preco: ");
    scanf("%f", &example.price);

    printf("Componente: %s\n", example.name);

    system("pause");
    return 0;
}

// #include<stdio.h>
// #include<stdlib.h>
// #include<locale.h>
// #include<conio.h>

// struct componente{
	
// 	char nome[20];
// 	char referencia[5];
// 	float preco;
	
// };



// int main(){
// 	system("color E");
// 	setlocale(LC_ALL,"Portuguese");
	
// 	// tipo de dado   nome var
// 	struct componente comp;
	
// 	printf("Nome do componente: ");
// 	fgets(comp.nome,20,stdin);
	
// 	printf("Referencia: ");
// 	fflush(stdin);
// 	gets(comp.referencia);
	
// 	printf("Preço: ");
// 	scanf("%f",&comp.preco);
	
// 	printf("Componente: %s\n",comp.nome);
	
	
		
   
   
// 	system("pause");
// 	return 0;
// }

