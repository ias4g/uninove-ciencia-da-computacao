#include<stdio.h>
#include<stdlib.h>
#include<time.h>//para usar a função rand()
#include<conio.h>
#include<ctype.h>// para usar comando toupper( )

int main(){
	system("color F0");
	// IMPRIMIR UM TABULEIRO DE 8X8
	int L,C;
	
	printf("\tTABULEIRO DE XADREZ\n");
	printf("==================================\n");
	
	
	for(L=0;L<8;L++){
		
		for(C=0;C<8;C++){
			
			if((L+C) %2==0){
				printf("\xFE ");// caractere da tabela ASCII em hexadecimal
			}
			else{
				printf("\x6F ");
			}
		}
		
		printf("\n");
	}
	printf("\n");
	
	system("pause");
	return 0;
}

