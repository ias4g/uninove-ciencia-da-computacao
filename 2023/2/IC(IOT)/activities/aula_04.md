# Atividade Aula 04

>PROFº FELIPE SANTOS DE JESUS

>ALUNO: IZAEL ALVES DA SILVA - RA: 922114939

>DISCIPLINA: INTERNET DAS COISAS (IOT) - TURMA 50 - MM

<br>

## Digite duas notas. Verificar se as notas do aluno são validas por exemplo, a nota deve estar entre 0 e 10. Faça a média. Se a média do aluno foi aprovada Maior e igual a 6, reprovada Menor que 4 ou está em exame Menor que 6 e maior igual a 4.
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

   printf("\n..........................................");

  // Verifica se as notas são válidas
  if ((n1 >= 0 && n1 <= 10) && (n2 >= 0 && n2 <= 10)) {
    // Calcula a média
    average = calculateAverage(n1, n2);

    // Verifica a situação do aluno
    if (average >= 6) {
        printf("\nAluno aprovado com média %.1f\n", average);
    } else if (average <= 4) {
        printf("\nAluno reprovado com média %.1f\n", average);
    } else {
        printf("\nAluno em exame com média %.1f\n", average);
    }
  } else {
    printf("\n-> Notas inválidas.\n-> Certifique-se de que as notas estejam entre 0 e 10.\n");
  }

  return 0;
}
```
<hr>

>Para executar o programa e fazer testes, clique neste link para ser redirecionando ao 🔗[Replit - Atividade - Aula 04](https://replit.com/@IZAELALVES/Internet-das-coisas-atividade-aula-04#main.c)