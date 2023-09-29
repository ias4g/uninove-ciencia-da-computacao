# Atividade Aula 08

>PROFº FELIPE SANTOS DE JESUS

>ALUNO: IZAEL ALVES DA SILVA - RA: 922114939

>DISCIPLINA: INTERNET DAS COISAS (IOT) - TURMA 50 - MM

<br>

## 1. Crie um procedimento que receba um valor e informe se ele é positivo ou não.
```c

  #include "procedure.h"
  #include <stdio.h>
  #include <stdlib.h>

  // Esta procedure calcula se o número passado como parametro
  // é POSITIVO ou NEGATIVO.
  void positiveOrNegative(int n) {
    if (n >= 0) {
      printf("\n\tO número [%i], é ", n);
      printf("\x1B[32m");
      printf("POSITIVO.\n");
    } else {
      printf("\n\tO número [%i], é ", n);
      printf("\x1B[31m");
      printf("NEGATIVO.\n");
    }
  }

  // Esta procedure executa o exercício 01.
  void programNumberPositiveOrNegative() {
    int n;

    system("clear");

    system("clear");
    printf("\n\t+++++++++++++++++++++++++++++\n");
    printf("\t+\t\t\t\t\t\t\t+\n");
    printf("\t+\t\tEXERCÍCIO 01.\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t+\n");
    printf("\t+++++++++++++++++++++++++++++");

    printf("\n\n\tCrie um procedimento que receba um valor");
    printf("\n\te informe se ele é positivo ou não.\n\n");

    printf("\tInsira um número: ");
    scanf("%i", &n);

    positiveOrNegative(n);
  }

```

<br>

## 2. Crie uma função que receba 3 números e retorne o maior valor, use a função da questão.
```c

  #include "programFindHigherNumber.h"
  #include <stdio.h>
  #include <stdlib.h>

  // Função para descobrir qual o maior valor passado nos paramentros.
  int findHigherNumber(int n1, int n2, int n3) {
    int higherNumber;

    if (n1 > n2 && n1 > n3) {
      higherNumber = n1;
    } else if (n2 > n1 && n2 > n3) {
      higherNumber = n2;
    } else {
      higherNumber = n3;
    }

    // Outra maneira de resolver esta questão 👇.
    /*
      int higherNumber = n1;

      if (n2 > higherNumber) {
        higherNumber = n2;
      }

      if (n3 > higherNumber) {
        higherNumber = n3;
      }
  */

    return higherNumber;
  }

  void programFindHigherNumber() {
    int n1, n2, n3;

    system("clear");
    printf("\n\t+++++++++++++++++++++++++++++\n");
    printf("\t+\t\t\t\t\t\t\t+\n");
    printf("\t+\t\tEXERCÍCIO 02.\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t+\n");
    printf("\t+++++++++++++++++++++++++++++\n\n");

    printf("\tCrie uma função que receba 3 números e retorne o maior\n");
    printf("\tvalor, use a função da questão.\n\n");

    printf("\tInsira o primeiro número: ");
    scanf("%i", &n1);

    printf("\n\tInsira o segundo número: ");
    scanf("%i", &n2);

    printf("\n\tInsira o terceiro número: ");
    scanf("%i", &n3);

    int higherNumber = findHigherNumber(n1, n2, n3);

    printf("\n\n\tO maior número entre: [%i] [%i] [%i] é: ", n1, n2, n3);
    printf("\x1B[32m");
    printf("%i\n", higherNumber);
  }

```

<br>

## 3. Insira 2 números e escolha qual função calculadora: faça funções para adição, subtração, multiplicação e divisão.
```c

  #include "programCalculator.h"
  #include <stdio.h>
  #include <stdlib.h>

  // Função para somar [+]
  int sum(int n1, int n2) { return n1 + n2; }

  // Função para dividir [/]
  float division(float n1, float n2) { return n1 / n2; };

  // Função para subtrair [-]
  int subtraction(int n1, int n2) { return n1 - n2; };

  // Função para multiplicar [*]
  int multiplication(int n1, int n2) { return n1 * n2; };

  void programCalculator() {
    int op;
    int n1, n2;

    system("clear");
    printf("\n\t+++++++++++++++++++++++++++++\n");
    printf("\t+\t\t\t\t\t\t\t+\n");
    printf("\t+\t\tEXERCÍCIO 03.\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t+\n");
    printf("\t+++++++++++++++++++++++++++++\n\n");

    printf("\tInsira 2 números e escolha qual função calculadora: faça\n");
    printf("\tfunções para adição, subtração, multiplicação e divisão.\n\n");

    printf("\tInsira o primeiro número: ");
    scanf("%i", &n1);

    printf("\tInsira o segundo número: ");
    scanf("%i", &n2);

    printf("\n\t+++++++++++++++++++++++++++++++++++++++++++++++++\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\tPARA MULTIPLICAR, ESCOLHA <1>.\t\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\tPARA DIVIDIR, ESCOLHA <2>.\t\t\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\tPARA SUBTRAIR, ESCOLHA <3>\t\t\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\tPARA SOMAR,ESCOLHA <4>\t\t\t\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+++++++++++++++++++++++++++++++++++++++++++++++++\n\n");

    printf("\tQual sua opção? [1, 2, 3 ou 4]: ");
    scanf("%i", &op);

    switch (op) {
    case 1:
      printf("\x1B[32m");
      printf("\n\tResultado! %i * %i = %i\n", n1, n2, multiplication(n1, n2));
      break;

    case 2:
      printf("\x1B[32m");
      printf("\n\tResultado! %i / %i = %.2f\n", n1, n2, division(n1, n2));
      break;

    case 3:
      printf("\x1B[32m");
      printf("\n\tResultado! %i - %i = %i\n", n1, n2, subtraction(n1, n2));
      break;

    case 4:
      printf("\x1B[32m");
      printf("\n\tResultado! %i + %i = %i\n", n1, n2, sum(n1, n2));
      break;

    default:
      system("clear");
      printf("\x1B[33m");
      printf("\n\tOpção inválida! -> ");
      printf("reinicie o programa\n");
    }
  }

```

<br>

## Programa principal.
```c

  #include "functions/programCalculator.h"
  #include "functions/programFindHigherNumber.h"
  #include "procedure/procedure.h"
  #include <stdio.h>
  #include <stdlib.h>

  int main(void) {
    int op;

    printf("\n\t-- M E N U ----------------------------------------------\n");
    printf("\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("\t|\tESCOLHA UMA OPÇÃO NO MENU ABAIXO.\t\t\t\t\t|\n");
    printf("\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("\t|\t[1] Crie um procedimento que receba um valor\t\t|\n");
    printf("\t|\t\te informe se ele é positivo ou não.\t\t\t\t|\n");
    printf("\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("\t|\t[2] Crie uma função que receba 3 números e retorne\t|\n");
    printf("\t|\t\to maior valor, use a função da questão.\t\t\t|\n");
    printf("\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("\t|\t[3] Insira 2 valores e escolha a operação.\t\t\t|\n");
    printf("\t|\t\tfaça funções para adição, subtração,\t\t\t|\n");
    printf("\t|\t\tmultiplicação ou divisão.\t\t\t\t\t\t|\n");
    printf("\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("\t---------------------------------------------------------\n\n");

    printf("\tQual sua opção? [1, 2 ou 3]: ");
    scanf("%i", &op);

    switch (op) {
    case 1:
      programNumberPositiveOrNegative();
      break;

    case 2:
      programFindHigherNumber();
      break;

    case 3:
      programCalculator();
      break;

    default:
      system("clear");
      printf("\x1B[33m");
      printf("\n\tOpção inválida! -> ");
      printf("reinicie o programa\n");
    }

    return 0;
  }

```

<br>
<hr>

>Para executar o programa e fazer testes, clique neste link para ser redirecionando ao 🔗[Replit - Atividade - Aula 08](https://replit.com/@IZAELALVES/Internet-das-coisas-atividade-aula-8#main.c)