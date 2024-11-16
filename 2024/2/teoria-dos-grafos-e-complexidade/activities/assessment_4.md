![AVAUNINOVE](https://aapa.uninove.br/seu/AVA/imgs/logo-ava.png)

## ATIVIDADES | AVA UNI9

#### TEORIA DOS GRAFOS E COMPLEXIDADE

#### Avaliação 4 - Teoria dos Grafos e Complexidade | Mútipla Escolha

| RA          | 922114939               |
|:----------- |:----------------------- |
| NOME        | IZAEL ALVES DA SILVA    |
| CURSO       | CIÊNCIA DA COMPUTAÇÃO   |
| SÉRIE/TURMA | 06/30                   |
| ANO         | 2024/02                 |
| CAMPUS      | MEMORIAL AMÉRICA LATINA |

### QUESTÃO 1 DE 5
**Dado o algoritmo abaixo, que tem como objetivo buscar o maior elemento de um vetor v[0...n-1]. Assinale a alternativa que representa a complexidade de tempo do mesmo.**
```java

    int max( int n, int v[]){
        int j, x = v[0];
        for (j=1; j<n; j+=1)
        if(x <v[j]) x=v[j]
        return x
    }

```
> - [x] O(n)
- [ ] O(n2)
- [ ] O(1)
- [ ] O(log n)

---

### QUESTÃO 2 DE 5
**A notação O-Grande (Big-O notation) é denominada complexidade do algoritmo, sendo exemplos dessa notação O(n2), O(log n), O(n), (n.logn), O(1). Neste contexto, analise as afirmações abaixo que tratam da complexidade de um algoritmo, e assinale a alternativa correta.**

I. É uma medida da eficiência do algoritmo quando o tamanho do conjunto de dados tende para infinito.

II. É uma medida do número de ciclos de CPU necessários para processar um dado conjunto de dados.

III. A complexidade de um algoritmo varia, se mais processadores forem usados.

IV. A complexidade de um algoritmo é menor em processadores mais rápidos.

V. É uma medida do tempo necessário para processar um dado conjunto de dados.
- [ ] Somente a IV é correta
- [ ] Somente a II é correta
- [ ] Somente a III é correta
- [ ] Somente a V é correta
> - [x] Somente a I é correta

---

### QUESTÃO 3 DE 5
**Tomando o algoritmo de busca binária, e sabendo que o mesmo é um algoritmo de desempenho ótimo para encontrar um item em:**
- [ ] uma lista ligada ordenada.
- [ ] uma árvore de busca binária.
- [ ] um heap binário.
> - [x] um vetor ordenado.
- [ ] uma árvore B.

---

### QUESTÃO 4 DE 5
**Dado o vetor `[10, 20, 30, 40, 50, 60, 70, 80]`, ordenado de forma crescente. Assinale a alternativa que represente o número de iterações necessárias para que o valor 80 seja encontrado, aplicando o algoritmo de busca binária.**
- [ ] 8
- [ ] 9
- [ ] 3
> - [x] 4
- [ ] 2

---

### QUESTÃO 5 DE 5
**A descrição de um programa recursivo é representada pela formula,**

```java

    0 if i = 0 || j = 0

    x(a, b) = {

        1 + x (a - 1, b - 1)
        
        if 0 < a < M,
        
        0 < b <= N && a = b

        minx{
            x(a, b - 1)
            x(a - 1, b)
        }

        if 0 < a < M,

        0 < b ≤ N && a != b

    }

```
**Assinale a alternativa que representa sua complexidade.**
> - [x] O(n2).
- [ ] O(n2 x log n).
- [ ] O(n x log n).
- [ ] O(2n).
- [ ] O(n3).

<br>
<br>

<p align="center">
    © 2024 | Feito com 💟 por
    <a href="https://www.linkedin.com/in/izaelsilva" target="_blank">Silva, Izael A.</a>
</p>
