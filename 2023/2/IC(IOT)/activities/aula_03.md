# Atividade Aula 03

>PROFº FELIPE SANTOS DE JESUS

>ALUNO: IZAEL ALVES DA SILVA - RA: 922114939

>DISCIPLINA: INTERNET DAS COISAS (IOT) - TURMA 50 - MM

<br>

## Desenvolva um algoritmo que receba duas notas. Me mostre a média e se o aluno foi aprovado ou reprovado. Média 6: Aprovado, abaixo de 6:: Reprovado.
<hr>
<br>

```c
#include <stdio.h>

// Esta função recebe as duas notas do tipo float, e retorna a soma das notas no tipo float.
float calculateAverage(float n1, float n2) { return (n1 + n2) / 2; }

int main() {
  float n1, n2, average;

  printf("\nDigite a primeira nota: ");
  scanf("%f", &n1);

  printf("\nDigite a segunda nota: ");
  scanf("%f", &n2);

  average = calculateAverage(n1, n2);

  printf("\n\n**************************");
  printf("\nMedia: %.1f\n", average);

  if (average >= 6) {
    printf("Aluno Aprovado\n");
  } else {
    printf("Aluno Reprovado\n");
  }

  return 0;
}
```
<hr>

>Para executar o programa e fazer testes, clique neste link para ser redirecionando ao 🔗[Replit - Atividade - Aula 03](https://replit.com/@IZAELALVES/Internet-das-coisas-atividade-aula-03#main.c)