# ATIVIDADE: APRENDIZADO DE MÁQUINA

| DISCIPLINA  | METODOS NUMERICOS COMPUTACIONAIS - TURMA 48 - MM  |
|-------------|-------------------------------------------------|
| PROFESSOR   | DEBORA VIRGILIA CANNE                          |
| ALUNO       | IZAEL ALVES DA SILVA                            |

<br>

**📚 Situação/Problema: Ajuste de Threshold em um Classificador de Fraudes**

Uma empresa utiliza um modelo de **aprendizado de máquina** para detectar **transações fraudulentas**. O modelo retorna uma **probabilidade** de que a transação seja fraude, e a decisão final é tomada com base em um **threshold** (limiar) **T**.

### Cenário:
- Se a **probabilidade ≥ T**, a transação é **classificada como fraude**.
- Se a **probabilidade < T**, é **classificada como legítima**.

A equipe deseja encontrar o **valor de T** que resulta em uma **taxa de falsos negativos (FN)** de **10%** — ou seja, que apenas 10% das fraudes reais passem despercebidas.

Para isso, a taxa de FN é aproximada por esta função (baseada em resultados empíricos do modelo):

`f(T) = 0,3 * e−5T − 0,10`

<br>


### Suponha que você deseja encontrar a raiz da função `f(x) = x³ - 2x - 5` no intervalo `[2, 3]`. A tolerância adotada é `0,001 (|f(x)| < 0,001)`.

| k  | a           | b   | f(a)          | f(b) | xk          | f(xk)           | \| f(xk) \| < E |
|:----|:-------------|:-----|:---------------|:------|:-------------|:------------------|:----------------|
| 1  | 2           | 3   | -1            | 16   | 2,058823529 | -0,3907999186    | FALSE          |
| 2  | 2,058823529 | 3   | -0,3907999186 | 16   | 2,08126366  | -0,1472040596    | FALSE          |
| 3  | 2,08126366  | 3   | -0,1472040596 | 16   | 2,08963921  | -0,05467650327   | FALSE          |
| 4  | 2,08963921  | 3   | -0,05467650327| 16   | 2,092739574 | -0,02020286631   | FALSE          |
| 5  | 2,092739574 | 3   | -0,02020286631| 16   | 2,093883708 | -0,007450505938  | FALSE          |
| 6  | 2,093883708 | 3   | -0,007450505938|16   | 2,094305451 | -0,002745672838  | FALSE          |
| 7  | 2,094305451 | 3   | -0,002745672838|16   | 2,094460846 | -0,001011573949  | FALSE          |
| 8  | 2,094460846 | 3   | -0,001011573949|16   | 2,094518093 | -0,0003726528256 | TRUE           |

> A raiz aproximada é: **2,094518093**

---

<br>

### Dada a função `f(x) = x⁴ - 5x³ + 10x² - 10x + 4`, verifique primeiramente se existe pelo menos uma raiz real no intervalo `[0,1]`, se existir, calcule a raiz aproximada com tolerância de erro de `0,0005`.

| k  | a | b | f(a) | f(b) | xk | f(xk) | \| f(xk) \| < 0,0005 |
|:----|:---|:---|:------|:------|:----|:--------|:--------------------|
| 1  | 0 | 1 | 4    | 0    | 1  | 0      |          TRUE         |
| 2  | 0 | 1 | 4    | 0    | 1  | 0      |         TRUE           |

> A raiz aproximada é: **Não existe raiz real no intervalo solicitado**

---

<br>

### Seja `f(x) = x³ - x² + 2x ln(x) – 3`, verifique se existe raiz neste intervalo `[1,2]`, se existir, determine a melhor raiz aproximada com `Erro < 0,001`.

| k  | a           | b | f(a)         | f(b)        | xk          | f(xk)          |  \| f(xk) \| < E |
|:----|:-------------|:---|:--------------|:-------------|:-------------|:----------------|:----------------|
| 1  | 1           | 2 | -3           | 3,772588722 | 1,442962082 | -1,019428496   | FALSE          |
| 2  | 1,442962082 | 2 | -1,019428496 | 3,772588722 | 1,561463394 | -0,239408536   | FALSE          |
| 3  | 1,561463394 | 2 | -0,239408536 | 3,772588722 | 1,587632257 | -0,05108192196 |  FALSE          |
| 4  | 1,587632257 | 2 | -0,05108192196 | 3,772588722 | 1,59314124 | -0,01067525526 |  FALSE          |
| 5  | 1,59314124  | 2 | -0,01067525526 | 3,772588722 | 1,594828896 | -0,00221992371 |  FALSE          |
| 6  | 1,594828896 | 2 | -0,00221992371 | 3,772588722 | 1,594527587 | -0,00046135498 | TRUE           |

> A raiz aproximada é: **1,594527587**

---

<br>

### Seja `f(x) = x³ - 2x² + sen(x) + 2cos(x) – 1`, no intervalo `[0,1]` e `tolerância 0,001`, calcule a raiz aproximada. Quantas iterações você precisou fazer?

| k  | a          | b          | f(a)          | f(b)          | xk          | f(xk)           |  \| f(xk) \| < E |
|:----|:------------|:------------|:---------------|:---------------|:-------------|:------------------|:----------------|
| 1  | 0          | 1          | -0,07792440346| 0,07672558021 | 0,9277088419| -0,07672558021   | FALSE          |
| 2  | 0          | 0,9277088419| 1             | 0,07672558021 | 1,004802093 | -0,0882143204    |FALSE          |
| 3  | 1,004802093| 0,9277088419| -0,0882143204 | 0,07672558021 | 0,9635709262| 0,0001242716449  |  TRUE           |

> A raiz aproximada é: **0,9635709262**
