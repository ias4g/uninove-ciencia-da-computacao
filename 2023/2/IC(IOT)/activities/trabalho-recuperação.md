# Trabalho de Recuperação Prova 1 - Valendo 2 pontos

>PROFº FELIPE SANTOS DE JESUS

>ALUNO: IZAEL ALVES DA SILVA - RA: 922114939

>DISCIPLINA: INTERNET DAS COISAS (IOT) - TURMA 50 - MM

<br>

## 1. VEJA AS OBSERVAÇÕES DO TRABALHO: 

1. SOMENTE FAZER SE O ALUNO NÃO TIVER A NOTA DA PROVA 1 OU SE FOI MAL NELA
2. É INDIVIDUAL
3. SE TIVER TRABALHO IGUAL IREI ZERAR OU DESCONSIDERAR O TRABALHO.
4. CUIDADO AO USAR O CHAT GPT OU OUTRA IA GENERATIVA, SE ELE FORNECER UMA RESPOSTA IGUAL  A DE OUTRO COLEGA FICA POR SUA CONTA E RISCO, POIS VOU CONSIDERAR O TÓPICO 3.
5. O TRABALHO É GRANDE É IMPOSSÍVEL UM ALUNO PENSAR IGUAL AO OUTRO

> Esse trabalho é para quem perdeu a Prova 1 ou se foi mal na Prova.

### Enunciado: Calculadora de Média

*Crie um programa em uma linguagem de programação de sua escolha que solicite ao usuário que insira três notas (de 0 a 10) e, em seguida, calcule e exiba a média dessas notas. Certifique-se de validar as entradas do usuário para garantir que estejam dentro do intervalo válido (0 a 10). Caso o usuário insira uma nota fora desse intervalo, exiba uma mensagem de erro apropriada e solicite uma nova entrada. Após calcular a média, o programa deve informar se o aluno foi aprovado (média igual ou superior a 7) ou reprovado (média inferior a 7).*

#### O programa deve seguir os seguintes passos:

* Solicitar ao usuário que insira a primeira nota.
* Validar se a nota está dentro do intervalo válido (0 a 10). Se não estiver, exibir uma mensagem de erro e pedir uma nova entrada.
* Repetir os passos 1 e 2 para a segunda e terceira notas.
* Calcular a média das três notas.
* Exibir a média calculada.
* Determinar se o aluno foi aprovado ou reprovado e exibir essa informação.

> Lembre-se de utilizar estruturas de controle de fluxo, como condicionais, para implementar a validação e a decisão de aprovação/reprovação.

<br/>

<br/>

**Código em Java 👇**
```java

  import java.util.ArrayList;
  import java.util.Scanner;

  public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int i = 0;
      float n = 0, soma = 0, media = 0;
      ArrayList<Float> notas = new ArrayList<>();

      do {
        System.out.printf("Insira sua %d nota: ", i + 1);
        n = sc.nextFloat();

        if (n >= 0 && n <= 10) {
          notas.add(n);
          i++;
        } else {
          System.out.println("Nota inválida! (entre 0 e 10)");
        }
      } while (notas.size() < 3 || (n < 0 || n > 10));

      sc.close();

      System.out.print("\033[H\033[2J");
      System.out.flush();

      System.out.print("\nVocê digitou as notas:");
      for (Float nota : notas) {
        soma += nota;
        System.out.print(" " + nota);
      }

      media = soma / notas.size();

      if (media >= 7) {
        System.out.printf("\n\n%sParabéns! Você foi aprovado com média %.2f%s\n\n", ANSI_GREEN, media, ANSI_RESET);
      } else {
        System.out.printf("\n\n%sShêêê... você foi reprovado com média %.2f%s\n\n", ANSI_RED, media, ANSI_RESET);
      }

      System.out.printf("Porque esta média? porque %.2f (soma) dividido por %d (quantidade) é %.2f\n\n", soma, notas.size(), media);
    }
  }                     

```

<br>
<hr>

> Para executar o programa, clique neste link para ser redirecionando ao 🔗[Trabalho de Recuperação Prova 1 - Valendo 2 pontos](https://replit.com/@IZAELALVES/trabalhoRecuperacaoProva01Valendo2Pontos#Main.java)