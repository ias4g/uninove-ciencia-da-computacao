# Atividade Aula 02

>PROFº FELIPE SANTOS DE JESUS

>ALUNO: IZAEL ALVES DA SILVA - RA: 922114939

>DISCIPLINA: INTERNET DAS COISAS (IOT) - TURMA 50 - MM

<br>

## Crie um algoritmo em C, que informe duas notas e o nome do aluno. Exiba o nome e a média das notas.
<br>

```c
#include <stdio.h>

// Esta função recebe as duas notas do tipo float, e retorna a soma das notas no tipo float.
float calculateAverage(float n1, float n2) {
  return (n1 + n2) / 2;
}

int main() {
  char name[50];
  float n1, n2, average;
  
  printf("Digite o nome do aluno: ");
  scanf("%s", name);
  
  printf("\nDigite a primeira nota: ");
  scanf("%f", &n1);
  
  printf("\nDigite a segunda nota: ");
  scanf("%f", &n2);
  
  average = calculateAverage(n1, n2);

  printf("\n\n**************************");
  printf("\nAluno: %s\n", name);
  printf("Média das notas: %.1f\n", average);
  
  return 0;
}
```
<hr>

>Para executar o programa e fazer testes, clique neste link para ser redirecionando ao 🔗[Replit - Atividade - Aula 02](https://replit.com/@IZAELALVES/Internet-das-coisas-atividade-Aula-2#main.c)