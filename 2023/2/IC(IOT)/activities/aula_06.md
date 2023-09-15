# Atividade Aula 06

>PROFº FELIPE SANTOS DE JESUS

>ALUNO: IZAEL ALVES DA SILVA - RA: 922114939

>DISCIPLINA: INTERNET DAS COISAS (IOT) - TURMA 50 - MM

<br>

## 1. Escreva um algoritmo que conte de 1 até o valor que você digitar.
```c
// 1. Escreva um algoritmo que conte de 1 até o valor que você digitar.
void countNumber() {
  int option;
  int number;

  printf("\n=> VOCÊ QUER CONTAR ATÉ QUE NÚMERO: ");
  scanf("%i", &number);

  printf("=> Contando...\n");

  for (int i = 1; i <= number; i++) {
    printf("\t-> %i\n", i);
  }

  printf("=> Fim..\n");
}
```

<br>

## 2. Escreva um algoritmo que some todos os valores que você digitar e pare quando você determinar.
```c
// 2. Escreva um algoritmo que some todos os valores que você digitar
//    e pare quando você determinar.
void sumNumber() {
  int option;
  int number;
  int sum = 0;

  while (option != 0) {
    printf("\n=> DIGITE UM NÚMERO: ");
    scanf("%i", &number);

    sum += number;

    printf("\n\n-> Quer parar? digite <0>. Continuar digite <1>: ");
    scanf("%i", &option);
  }

  printf("\n\n=> A SOMA DOS NÚMEROS DIGITADOS É: %i\n", sum);
}
```

<br>

## 3. Escreva um algoritmo que exiba a soma dos números pares e ímpares e escolha quando parar.
```c
// 3. Escreva um algoritmo que exiba a soma dos números pares
//    e ímpares e escolha quando parar
void sumImparPar() {
  int option;
  int number;
  int sumPar = 0;
  int sumImpar = 0;

  do {
    printf("\n\n=> DIGITE UM NÚMERO: ");
    scanf("%i", &number);

    if (number % 2 == 0) {
      sumPar += number;
    } else {
      sumImpar += number;
    }

    printf("\n-> Quer parar? digite <0>. Continuar digite <1>: ");
    scanf("%i", &option);

    printf("\n\n");
  } while (option != 0);

    printf("\n-------------------------------------------------------\n");
    printf("=> A SOMA DOS NÚMEROS PARES DIGITADOS É: %i\n", sumPar);
  printf("=> A SOMA DOS NÚMEROS íMPARES DIGITADOS É: %i\n", sumImpar);
}
```

<br>

## Programa principal.
```c
//  Este é o programa principal onde mostrará ummenu paraescolha de uma opção.
int main(void) {

  int option;

  printf("\n###################### M E N U ######################\n");
  printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
  printf("#\t\tESCOLHA UMA OPÇÃO NO MENU ABAIXO.\t\t\t#\n");
  printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
  printf("#\t\t1. Escreva um algoritmo que conte de 1\t\t#\n");
  printf("#\t\t\taté o valor que você digitar.\t\t\t#\n");
  printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
  printf("#\t\t2. Escreva o Algoritmo que some todos\t\t#\n");
  printf("#\t\t\tos valores que você digitar e pare\t\t#\n");
  printf("#\t\t\tquando você determinar.\t\t\t\t\t#\n");
  printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
  printf("#\t\t3. Escreva um algoritmo que exiba a\t\t\t#\n");
  printf("#\t\t\tsoma dos números pares e ímpares\t\t#\n");
  printf("#\t\t\te escolha quando parar.\t\t\t\t\t#\n");
  printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
  printf("#####################################################\n\n");

  printf("O QUE VOCÊ ESCOLHE? 1, 2 OU 3? ");
  scanf("%i", &option);

  switch (option) {
  case 1:
    countNumber();
    break;

  case 2:
    sumNumber();
    break;

  case 3:
    sumImparPar();
    break;

  default:
    printf("O número não é 1 nem 2 nem 3\n");
  }

  return 0;
}
```

<br>
<br>
<br>
<hr>

>Para executar o programa e fazer testes, clique neste link para ser redirecionando ao 🔗[Replit - Atividade - Aula 06](https://replit.com/@IZAELALVES/Internet-das-coisas-atividade-aula-6#main.c)