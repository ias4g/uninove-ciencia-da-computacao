# Prova | Aula 7 | 20/09/2023

>PROFº FELIPE SANTOS DE JESUS

>ALUNO: IZAEL ALVES DA SILVA - RA: 922114939

>DISCIPLINA: INTERNET DAS COISAS (IOT) - TURMA 50 - MM

<br>

## Exercício 01 | (0,5).
**Crie um programa que simule o funcionamento de um caixa eletrônico. O programa deve pedir ao usuário que insira o número da conta e, em seguida, oferecer um menu com as seguintes opções: (Não utilizar Looping)**
1. Verificar saldo
2. Depositar dinheiro.(Adicionar dinheiro e mostrar novo saldo)
3. Sacar dinheiro(Retirar dinheiro e mostrar novo saldo)
4. Sair
```c

  #include "questionOne.h"
  #include <stdio.h>
  #include <stdlib.h>

  void questionOne() {
    int op;
    int account;
    float values;
    float balance = 0;

    printf("\x1B[33m");
    printf("\n\t+++++++++++++++++++++++++++++++++\n");
    printf("\t+\t\t\t\t\t\t\t\t+\n");
    printf("\t+\tVOCÊ ESTÁ NO EXERCÍCIO 01\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t+\n");
    printf("\t+++++++++++++++++++++++++++++++++\n");

    printf("\x1B[0m");
    printf("\n\t<?> Insira o número da sua conta: ");
    scanf("%i", &account);

    if (account < 10000) {
      system("clear");
      printf("\x1B[31m");
      printf("\n\n\t* Conta inválida!");
      printf("\n\t* A conta precisa ter mais de 5 digitos.\n");

      printf("\x1B[33m");
      printf("\n\tPrograma encerrado... ");
      printf("reinicie o programa\n");
      return;
    }

    printf("\n\t++++++++++++++++++++++ M E N U ++++++++++++++++++++++\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\tESCOLHA UMA OPÇÃO NO MENU ABAIXO.\t\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\t1. Verificar saldo da conta.\t\t\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\t2. Depositar dinheiro.(Adicionar\t\t\t+\n");
    printf("\t+\t\t\tdinheiro e mostrar novo saldo)\t\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\t3. Sacar dinheiro(Retirar dinheiro\t\t\t+\n");
    printf("\t+\t\te mostrar novo saldo)\t\t\t\t\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\t4. Sair\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t\t\t\t\t\t+\n");
    printf("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");

    printf("\tQual sua opção? [1, 2, 3 ou 4]: ");
    scanf("%i", &op);

    switch (op) {
    case 1:
      system("clear");
      printf("\n\tO valor atual da sua conta é R$%.2f\n", balance);
      break;

    case 2:
      printf("\n\tDigite o valor do deposito: ");
      scanf("%f", &values);

      balance += values;

      system("clear");
      printf("\n\tNovo valor com o deposito ");
      printf("\x1B[32m");
      printf("R$%.2f\n", balance);
      break;

    case 3:
      printf("\n\tDigite o valor do saque: ");
      scanf("%f", &values);

      balance -= values;

      system("clear");
      printf("\n\tNovo valor com o saque, sua conta está negativa ");
      printf("\x1B[31m");
      printf("R$%.2f\n", balance);
      break;

    case 4:
      system("clear");
      printf("\x1B[33m");
      printf("\n\tPrograma encerrado... ");
      printf("reinicie o programa\n");
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

## Exercício 02 | (0,5).
**Você foi designado para criar um sistema de gerenciamento de notas escolares para uma escola. O sistema deve ser capaz de fazer o seguinte:**
1. Armazenar informações dos alunos, incluindo nome, número de aluno.
2. Calcular a média das notas de cada aluno.
3. Identificar o aluno com melhor nota.
```c

  #include "questionTwo.h"
  #include <stdio.h>
  #include <stdlib.h>

  // Structure to represent a student
  struct Student {
    int ra;
    char name[50];
    float grades[4];
  };

  // Function to calculate the average of a student's grades
  float avgCalculate(struct Student student) {
    float avg = 0;
    float sum = 0;

    for (int i = 0; i < 4; i++) {
      sum += student.grades[i];
    }

    avg = sum / 4;

    return avg;
  }

  // Function to find the student with the best grade
  struct Student findBestStudent(struct Student students[], int qtdStudents) {
    struct Student bestStudent = students[0];
    float bestAvg = avgCalculate(students[0]);

    for (int i = 1; i < qtdStudents; i++) {
      float avg = avgCalculate(students[i]);
      if (avg > bestAvg) {
        bestStudent = students[i];
      }
    }

    return bestStudent;
  }

  void questionTwo() {
    int option;
    int qtdStudents;

    printf("\x1B[33m");
    printf("\n\t+++++++++++++++++++++++++++++++++\n");
    printf("\t+\t\t\t\t\t\t\t\t+\n");
    printf("\t+\tVOCÊ ESTÁ NO EXERCÍCIO 02\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t+\n");
    printf("\t+++++++++++++++++++++++++++++++++\n");

    printf("\x1B[0m");

    printf("\n\tInsira a quantidade de alunos: ");
    scanf("%i", &qtdStudents);

    printf("\n\n");

    if (qtdStudents <= 0 || qtdStudents > 5) {
      system("clear");
      printf("\x1B[31m");
      printf("\n\n\tQuantidade de alunos inválida!\n");
      printf("\x1B[33m");
      printf("\tVocê digitou %i, minimo (1), máximo (5).\n", qtdStudents);
      return;
    }

    struct Student students[qtdStudents];

    for (int i = 0; i < qtdStudents; i++) {
      printf("\tDigite o nome do aluno %i: ", i + 1);
      scanf("%s", students[i].name);

      printf("\tDigite o RA do aluno %i: ", i + 1);
      scanf("%i", &students[i].ra);

      for (int j = 0; j < 4; j++) {
        printf("\tDigite a nota 0%i do aluno 0%i: ", j + 1, i + 1);
        scanf("%f", &students[i].grades[j]);
      }

      printf("\n");
    }

    struct Student bestStudent = findBestStudent(students, qtdStudents);

    printf("\x1B[32m");
    printf("\n\tO aluno com a melhor média é:\n");
    printf("\tNome: %s\n", bestStudent.name);
    printf("\tNúmero do aluno: %i\n", bestStudent.ra);
    printf("\tMédia das notas: %.1f\n", avgCalculate(bestStudent));
  }

```

<br>

## Exercício 03 | (1,0).
**Você foi contratado por uma empresa de monitoramento climático para criar um programa que analise dados de temperatura. O programa deve ser capaz de processar uma série de leituras de temperatura e fornecer informações úteis. Você deve criar um programa em que os usuários possam inserir leituras de temperatura em um loop contínuo. O programa deve ser capaz de realizar as seguintes tarefas:**

1. Calcular a temperatura média com base nas leituras inseridas até o momento.
2. Identificar a temperatura máxima e mínima registrada até o momento.
3. Exibir uma mensagem de alerta se a temperatura ultrapassar um limite crítico (por exemplo, acima de 35 graus Celsius).
4. Permitir que os usuários parem de inserir leituras quando desejarem.

- O programa deve continuar a coletar dados até que o usuário escolha parar. Após a parada, o programa deve exibir um resumo das informações coletadas, incluindo média, máxima e mínima.
```c

  #include "questionThree.h"
  #include <stdio.h>

  void questionThree() {
    int option;
    int cont = 0;
    float temperature;
    float temp_min = 0;
    float temp_max = 0;
    float temp_sum = 0;
    float temp_media = 0;

    printf("\x1B[33m");
    printf("\n\t+++++++++++++++++++++++++++++++++\n");
    printf("\t+\t\t\t\t\t\t\t\t+\n");
    printf("\t+\tVOCÊ ESTÁ NO EXERCÍCIO 03\t+\n");
    printf("\t+\t\t\t\t\t\t\t\t+\n");
    printf("\t+++++++++++++++++++++++++++++++++\n");

    printf("\x1B[0m");

    do {
      printf("\n\t<?> Insira a temperatura: ");
      scanf("%f", &temperature);

      if (cont == 0) {
        temp_min = temperature;
        temp_max = temperature;
      }

      if (temperature < temp_min) {
        temp_min = temperature;
      }

      if (temperature > temp_max) {
        temp_max = temperature;
      }

      cont++;
      temp_sum += temperature;
      temp_media = temp_sum / cont;

      printf("\n\tDeseja continuar?\n\tDigite <1> para encerrar digite <0>: ");
      scanf("%i", &option);
    } while (option != 0);

    printf("\n\n\tVocê inseriu %i temperaturas.\n", cont);
    printf("\tA soma delas é de %.2f\n", temp_sum);
    printf("\tA temperatura mínima inserida foi %.2f graus\n", temp_min);
    printf("\tA temperatura máxima inserida foi %.2f graus\n", temp_max);
    printf("\tA temperatura média é de %.2f graus.\n\n", temp_media);

    if (temperature > 35) {
      printf("\x1B[31m");
      printf("\t[cuidado]: temperatura muito elevada.\n");
    }
  }

```

<br>

## Programa principal (main).
```c

  #include "questionOne/questionOne.h"
  #include "questionThree/questionThree.h"
  #include "questionTwo/questionTwo.h"
  #include <stdio.h>
  #include <stdlib.h>

  int main(void) {
    int op;

    printf("\n-- M E N U ------------------------------------------\n");
    printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("|\t\tESCOLHA UMA OPÇÃO NO MENU ABAIXO.\t\t\t|\n");
    printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("|\t\t1. Executa o exercicio 01.\t\t\t\t\t|\n");
    printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("|\t\t2. Executa o exercicio 02\t\t\t\t\t|\n");
    printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("|\t\t3. Executa o exercicio 03\t\t\t\t\t|\n");
    printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    printf("-----------------------------------------------------\n\n");

    printf("Qual sua opção? [1, 2 ou 3]: ");
    scanf("%i", &op);

    switch (op) {
    case 1:
      system("clear");
      questionOne();
      break;

    case 2:
      system("clear");
      questionTwo();
      break;

    case 3:
      system("clear");
      questionThree();
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
<br>
<br>
<hr>

>Para executar o programa e fazer testes, clique neste link para ser redirecionando ao 🔗[Replit | Prova | Aula 7 | 20/09/2023](https://replit.com/@IZAELALVES/Internet-das-coisas-atividade-aula-6#main.c)