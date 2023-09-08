# Atividade Aula 05

>PROFº FELIPE SANTOS DE JESUS

>ALUNO: IZAEL ALVES DA SILVA - RA: 922114939

>DISCIPLINA: INTERNET DAS COISAS (IOT) - TURMA 50 - MM

<br>

## 01: Usando FOR: criar a tabuada do 1 ao 10, mostrando a multiplicação das 10 tabuadas. 
  Exemplo:
  ```
    1 X 1 = 1
    1 X 2 = 2
    .........
    10 X 9 = 90
    10 X 10 = 100
  ```

## 02: Crie um algoritmo que faça a contagem de 1 a 100.
Instruções:
```
  Escolha 1 - Para exibir somente números ímpares.
  Escolha 2 - Para exibir somente números pares.
  Caso não seja 1 e nem 2, exiba todos os números.
```
<hr>
<br>

```c
Método para calcular Ímpares e Pares:

  void oddEvenProgram() {
  int option;
  char resp;

  do {
    system("clear");
    printf("* VOCÊ ESTÁ NO PROGRAMA PAR/ÍMPAR\n\n");

    printf("Escolha um número:\n");
    printf("\t1 - Exibir números ímpares.\n");
    printf("\t2 - Exibir números pares.\n");
    printf("\tQualquer outro número exibir todos.\n\n");

    printf("Qual sua opção? ");
    scanf("%d", &option);

    switch (option) {
    case 1:
      // Exibir números ímpares
      printf("\nNúmeros ímpares de 0 à 100:\n");
      for (int i = 0; i <= 100; i++) {
        if (i % 2 != 0) {
          printf("%d", i);

          if (i >= 99 && i <= 100) {
            printf(".");
          } else {
            printf(", ");
          }
        }
      }
      break;

    case 2:
      // Exibir números pares
      printf("\nNúmeros pares de 0 à 100:\n");
      for (int i = 0; i <= 100; i++) {
        if (i % 2 == 0) {
          printf("%d", i);

          if (i >= 99 && i <= 100) {
            printf(".");
          } else {
            printf(", ");
          }
        }
      }
      break;

    default:
      // Exibir todos os números de 1 a 100
      printf("\nTodos os números de 0 à 100:\n");
      for (int i = 0; i <= 100; i++) {
        printf("%d", i);
        if (i >= 100) {
          printf(".");
        } else {
          printf(", ");
        }
      }
    }

    printf("\n\nQuer continuar no Programa Par/Ímpar? [S/N]: ");
    scanf("%s", &resp);

    system("clear");

  } while (resp == 's');
}
```

```c
Método para calcular Tabuada:

  void calculatorProgram() {
  int number;
  char operation;
  char option;

  do {
    system("clear");
    printf("==> VOCÊ ESTÁ NO PROGRAMA CALCULADORA\n\n");

    printf("Escolha uma operação[*/+-] e um número:\n\n");

    printf("<?> Qual a operação você quer fazer? ");
    scanf("%s", &operation);

    printf("\n<?> Com que número? ");
    scanf("%d", &number);

    switch (operation) {
    case '*':
      printf("\n\nA tabuada de multiplicação do número %d é.\n", number);
      for (int i = 0; i <= 10; i++) {
        printf("%d * %d = %d\n", number, i, number * i);
      }
      break;

    case '/':
      printf("\n\nA tabuada de divisão do número %d é.\n", number);
      for (int i = 1; i <= 10; i++) {
        printf("%d / %d = %.1f\n", number, i, (float)number / i);
      }
      break;

    case '+':
      printf("\n\nA tabuada de adição do número %d é.\n", number);
      for (int i = 0; i <= 10; i++) {
        printf("%d + %d = %d\n", number, i, number + i);
      }
      break;

    case '-':
      printf("\n\nA tabuada de subtração do número %d é.\n", number);
      for (int i = 0; i <= 10; i++) {
        printf("%d - %d = %d\n", number, i, number - i);
      }
      break;

    default:
      printf("\nOperação Invalida!\n");
    }

    printf("\n\n<?> Quer continuar no Programa Calculadora? [S/N]: ");
    scanf("%s", &option);

    system("clear");

  } while (option == 's');
}
```

```c
Programa principal:

  #include <stdio.h>
  #include <stdlib.h>

  int main(void) {
    int option;

    printf("\n*********************************************\n");
    printf("*\t\t\t\tSTART PROGRAM\t\t\t\t*\n");
    printf("*********************************************\n");
    printf("Escolha uma opcao:\n");
    printf("1: Programa Calculadora.\n");
    printf("2: Programa Par/Impar.\n\n");

    printf("Qual sua opcao? ");
    scanf("%d", &option);

    switch (option) {
    case 1:
      calculatorProgram();
      break;

    case 2:
      oddEvenProgram();
      break;
    }

    system("clear");

    printf("\n*********************************************\n");
    printf("*\t\t\t\tPROGRAM EXIT\t\t\t\t*\n");
    printf("*********************************************\n");

    return 0;
  }
```
<hr>

>Para executar o programa e fazer testes, clique neste link para ser redirecionando ao 🔗[Replit - Atividade - Aula 05](https://replit.com/@IZAELALVES/Internet-das-coisas-atividade-aula-5#main.c)