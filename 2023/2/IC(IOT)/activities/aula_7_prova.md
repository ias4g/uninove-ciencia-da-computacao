# Prova | Aula 7 | 20/09/2023

>PROFº FELIPE SANTOS DE JESUS

>ALUNO: IZAEL ALVES DA SILVA - RA: 922114939

>DISCIPLINA: INTERNET DAS COISAS (IOT) - TURMA 50 - MM

<br>

## Exercício 01 | (0,5)
**Crie um programa que simule o funcionamento de um caixa eletrônico. O programa deve pedir ao usuário que insira o número da conta e, em seguida, oferecer um menu com as seguintes opções: (Não utilizar Looping)**
1. Verificar saldo
2. Depositar dinheiro.(Adicionar dinheiro e mostrar novo saldo)
3. Sacar dinheiro(Retirar dinheiro e mostrar novo saldo)
4. Sair
```c

  #include <stdio.h>
  #include <stdlib.h>

  int main(void) {
    int op;
    int account;
    float values;
    float balance = 0;

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
    }

    printf("\n###################### M E N U ######################\n");
    printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
    printf("#\t\tESCOLHA UMA OPÇÃO NO MENU ABAIXO.\t\t\t#\n");
    printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
    printf("#\t\t1. Verificar saldo da conta.\t\t\t\t#\n");
    printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
    printf("#\t\t2. Depositar dinheiro.(Adicionar\t\t\t#\n");
    printf("#\t\t\tdinheiro e mostrar novo saldo)\t\t\t#\n");
    printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
    printf("#\t\t3. Sacar dinheiro(Retirar dinheiro\t\t\t#\n");
    printf("#\t\te mostrar novo saldo)\t\t\t\t\t\t#\n");
    printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
    printf("#\t\t4. Sair\t\t\t\t\t\t\t\t\t\t#\n");
    printf("#\t\t\t\t\t\t\t\t\t\t\t\t\t#\n");
    printf("#####################################################\n\n");

    printf("Qual sua opção? [1, 2, 3 ou 4]: ");
    scanf("%i", &op);

    switch (op) {
    case 1:
      printf("\nO valor atual da sua conta é R$%.2f\n", balance);
      break;

    case 2:
      printf("\nDigite o valor do deposito: ");
      scanf("%f", &values);

      balance += values;

      system("clear");
      printf("\nNovo valor com o deposito ");
      printf("\x1B[32m");
      printf("R$%.2f\n", balance);
      break;

    case 3:
      printf("\nDigite o valor do saque: ");
      scanf("%f", &values);

      balance -= values;

      system("clear");
      printf("\nNovo valor com o saque, sua conta está negativa ");
      printf("\x1B[31m");
      printf("R$%.2f\n", balance);
      break;

    case 4:
      system("clear");
      printf("\x1B[33m");
      printf("\nPrograma encerrado... ");
      printf("reinicie o programa\n");
      break;

    default:
      system("clear");
      printf("\x1B[33m");
      printf("\nOpção inválida! -> ");
      printf("reinicie o programa\n");
    }
  }

```

<br>

## Exercício 02 | (0,5)
**Você foi designado para criar um sistema de gerenciamento de notas escolares para uma escola. O sistema deve ser capaz de fazer o seguinte:**
1. Armazenar informações dos alunos, incluindo nome, número de aluno.
2. Calcular a média das notas de cada aluno.
3. Identificar o aluno com melhor nota.
```c

```

<br>

## Exercício 03 | (1,0)
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
    printf("\tA temperatura média é de %.2f graus.\n", temp_media);
  }

```

<br>
<br>
<br>
<hr>

>Para executar o programa e fazer testes, clique neste link para ser redirecionando ao 🔗[Replit | Prova | Aula 7 | 20/09/2023](https://replit.com/@IZAELALVES/Internet-das-coisas-atividade-aula-6#main.c)