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

🎯 **Objetivo:**

Encontrar o valor de **threshold \( T \)** tal que a taxa de FN seja **exatamente 10%**, ou seja, resolver:

`f(T) = 0 ⇒ 0,3 * e−5T = 0,10 ⇒ T = ?`

📌 **Parâmetros para a Bisseção:**
- **Função:** `f(T) = 0,3 * e −5 * T − 0,10`

- **Intervalo:** `T ∈ [0,1 1,0]`
  
- **Tolerância:**  `ε = 0,001`

<br>

✅ **Interpretação esperada:**

- O valor de \( T \) encontrado será o **threshold ideal** para o modelo manter exatamente **10% de falsos negativos**.
- Um **valor de \( T \) mais baixo** torna o modelo mais **sensível** (detecta mais fraudes).
- Um **valor mais alto** torna o modelo mais **preciso**, mas **perde fraudes**.
- Aplicar o Método da Falsa Posição e Bisseçao para este cenário e fazer a análise do resultado.

<br>

### MÉTODO DA FALSA POSIÇÃO

| k | a       | b       | f(a)     | f(b)     | raiz aproximada (xk) | f(xk)    | critério de parada (abs(f(xk)) < 0,001) |
|---|---------|---------|----------|----------|----------------------|----------|-----------------------------------------|
| 1 | 0,1     | 1       | 0,081959 | -0,097979| 0,509938             | -0,076568| FALSE                                   |
| 2 | 0,1     | 0,509938| 0,081959 | -0,076568| 0,311939             | -0,036940| FALSE                                   |
| 3 | 0,311939| 0,509938| -0,036940| -0,076568| 0,127372             | 0,058685 | FALSE                                   |
| 4 | 0,311939| 0,127372| -0,036940| 0,058685 | 0,240641             | -0,009931| FALSE                                   |
| 5 | 0,240641| 0,127372| -0,009931| 0,058685 | 0,224247             | -0,002237| FALSE                                   |
| 6 | 0,224247| 0,127372| -0,002237| 0,058685 | 0,220690             | -0,000483| TRUE                                    |

<br>

### MÉTODO DA BISSEÇÃO

| k  | a         | b         | raiz aproximada (xk = (a+b)/2) | f(xk)      | critério de parada ([f(xk)] < 0,001) |
|----|-----------|-----------|--------------------------------|------------|-------------------------------------|
| 1  | 0,100000  | 1,000000   | 0,550000                      | -0,080822  | FALSE                               |
| 2  | 0,100000  | 0,550000   | 0,325000                      | -0,040926  | FALSE                               |
| 3  | 0,100000  | 0,325000   | 0,212500                      | 0,003677   | FALSE                               |
| 4  | 0,212500  | 0,325000   | 0,268750                      | -0,021740  | FALSE                               |
| 5  | 0,212500  | 0,268750   | 0,240625                      | -0,009924  | FALSE                               |
| 6  | 0,212500  | 0,240625   | 0,226563                      | -0,003362  | FALSE                               |
| 7  | 0,212500  | 0,226563   | 0,219531                      | 0,000096   | TRUE                                |

<br>

### Interpretando os resultados:

#### 1. Método da Falsa Posição
- A raiz foi encontrada em 𝑇 ≈ 0,220690
- O critério de parada | f(xk) | < 0,001 foi satisfeito no **6º passo**, porque:
  - | f(0,220690) | = 0,000483, que é menor que 0,001.

✅ **Convergência OK!**

#### 2. Método da Bisseção
- A raiz foi encontrada em T ≈ 0,21953125.
- O critério de parada também foi satisfeito, porque:
  - | f(0,21953125) | = 0,000096, que é muito menor que 0,001.

✅ **Convergência OK!**

#### 3. Analisando os Resultados
- Ambos os métodos encontraram um **valor de T muito próximo**.
- O **Método da Falsa Posição** chegou na solução com **menos iterações** (6 contra 7 da bisseção).
- Isso acontece porque o Falsa Posição geralmente converge mais rápido **quando a função é aproximadamente linear** no intervalo.

#### 4. Em relação ao modelo (conforme o enunciado):
- O valor de T encontrado será usado como **threshold** para manter **10% de falsos negativos**.
- Se você **escolher um T menor que 0,22**, o modelo ficará **mais sensível** (detectando mais fraudes).
- Se você **aumentar o T**, o modelo será **mais preciso**, mas poderá **perder detecção de fraudes**.
