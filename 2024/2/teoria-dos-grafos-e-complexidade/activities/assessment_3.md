![AVAUNINOVE](https://aapa.uninove.br/seu/AVA/imgs/logo-ava.png)

## ATIVIDADES | AVA UNI9

#### TEORIA DOS GRAFOS E COMPLEXIDADE

#### Avaliação 3 - Teoria dos Grafos e Complexidade | Mútipla Escolha

| RA          | 922114939               |
|:----------- |:----------------------- |
| NOME        | IZAEL ALVES DA SILVA    |
| CURSO       | CIÊNCIA DA COMPUTAÇÃO   |
| SÉRIE/TURMA | 06/30                   |
| ANO         | 2024/02                 |
| CAMPUS      | MEMORIAL AMÉRICA LATINA |

### QUESTÃO 1 DE 5
**Um especialista em algoritmos construiu a análise de três algoritmos, classificando-os como: Algoritmo A: O(log n); Algoritmo B: O(n2); Algoritmo C: O(n.log n). Considerando esta análise é corretor afirmar que:**
- [ ] C é o mais eficiente.
> - [x] B é o menos eficiente.
- [ ] A não é o mais eficiente nem o menos eficiente.
- [ ] A é o menos eficiente.
- [ ] C é o menos eficiente.

---

### QUESTÃO 2 DE 5
**Dado um algoritmo responsável por concatenar vetores inteiros na forma ordenada, o qual recebe dois vetores ordenados de tamanho N, e tem como saída um vetor de tamanho 2N, isto é, não há elementos repetidos nos dois vetores de entrada. Dado este contexto, assinale a alternativa que representa a complexidade de tempo de melhor caso desse processo.**
- [ ] O(log N), pois se usa a busca binária para determinar qual será o próximo elemento copiado para o vetor de destino.
> - [x] O(N), pois se precisa fazer uma cópia de cada um dos elementos originais, o que implica uma varredura completa de cada vetor de origem.
- [ ] O(1), pois se precisa fazer apenas uma cópia simples de cada um dos elementos originais.
- [ ] O(N2 ), pois, como há dois vetores, precisa-se fazer dois laços de forma aninhada (um dentro do outro), gerando uma multiplicação das quantidades de elementos.
- [ ] O(Nlog N), pois se precisa fazer uma busca de cada elemento para depois inseri-lo no vetor de destino.

---

### QUESTÃO 3 DE 5
**Ao desenvolver um sistema de análise financeira, foi utilizado um algoritmo de complexidade de tempo no pior caso igual a O(N). Porém ao se refinar o sistema outro algoritmo de melhor complexidade foi identificado para solução do problema. Neste contexto assinale a alternativa que representa a complexidade do algoritmo identificado como de melhor complexidade.**
- [ ] O(n!).
- [ ] O(n log n).
- [ ] O(n2).
- [ ] O(2n).
> - [x] O(log n).

---

### QUESTÃO 4 DE 5
**Para se solucionar um problema P, que tem uma entrada de tamanho N, foram apresentados cinco algoritmos com diferentes complexidades, e sabendo que cada uma das alternativas representa um algoritmo. Neste contexto e considerando a analise assintótica (Big O) assinale a alternativa que representa o algoritmo de menor complexidade.**
> - [x] 2 + 10log n
- [ ] 3n2 + n
- [ ] 2n3 + 1000
- [ ] 4n
- [ ] 5n + 128

---

### QUESTÃO 5 DE 5
**Analise o algoritmo dado, quanto a sua complexidade de tempo, no pior caso, e sabendo que n corresponde ao número de elementos da variável vetor, assinale a alternativa correta.**

```c
int algoritmo( int TAM, int vetor[]) {
    int x, y, tr, troca=1;
    for( x = 0; x < TAM-1 && troca; x++ ) {
        troca = 0;
        for( y = 0; y < TAM-x-1 ; y++) {
            if( vetor[y] > vetor[y+1]) {
                tr = vetor[y];
                vetor[y] = vetor[y+1];
                vetor[y+1]=tr;
                troca = 1;
            }
        }
    }
    return 0;
}
```
> - [x] O(n2).
- [ ] Correto
- [ ] T(n log n).
- [ ] O(n2 log n).
- [ ] T(n).
- [ ] O(n log n).

<br>
<br>

<p align="center">
    © 2024 | Feito com 💟 por
    <a href="https://www.linkedin.com/in/izaelsilva" target="_blank">Silva, Izael A.</a>
</p>
