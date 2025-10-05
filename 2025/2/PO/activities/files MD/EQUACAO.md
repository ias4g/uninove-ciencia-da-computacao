# ATIVIDADE | EQUACIONAR

### EQUACIONAR PARA UMA PESQUISA OPERACIONAL

|   ALUNO       |   IZAEL ALVES DA SILVA   |
|:---------------|:--------------------------|
|   PROFESSOR    |   JOÃO VAGNER PEREIRA DA SILVA         |
|   DISCIPLINA  |   PESQUISA OPERACIONAL |

---

<br>

> ### Equacione o seguinte descritivo:

#### Produção de camisetas em uma fábrica

Uma pequena fábrica produz dois tipos de camisetas: padrão e premium.
Cada tipo de camiseta requer uma quantidade diferente de tecido e tempo de costura. A fábrica tem um estoque limitado de tecido (100 metros) e um tempo máximo de produção disponível (80 horas por semana).

Cada camiseta padrão consome 2 metros de tecido e 1 hora de costura, enquanto cada camiseta premium consome 3 metros de tecido e 2 horas de costura.
A fábrica deseja **maximizar o número de camisetas produzidas respeitando essas restrições**. 

- Identificar as variáveis de decisão.
- Numero de camisetas a serem produzidas
- Restrições e função objetivo

---

### **1️⃣ Variáveis de decisão**

Seja:

$x = \text{número de camisetas padrão a serem produzidas}$

$y = \text{número de camisetas premium a serem produzidas}$

### **2️⃣ Restrições**

O problema nos dá **duas limitações**: tecido e tempo de costura.

1. **Tecido disponível**:

* Camiseta padrão consome 2 metros
* Camiseta premium consome 3 metros
* Estoque total = 100 metros

    $2x + 3y \leq 100$

2. **Tempo de costura**:

* Camiseta padrão consome 1 hora
* Camiseta premium consome 2 horas
* Tempo total disponível = 80 horas

    $1x + 2y \leq 80 \quad \text{ou apenas } x + 2y \leq 80$

3. **Não negatividade**:

    $x \geq 0, \quad y \geq 0$

### **3️⃣ Função objetivo**

A fábrica quer **maximizar o número total de camisetas produzidas**:

$\text{Maximizar } Z = x + y$

### ✅ **Resumo do modelo**

$$\begin{cases}
\text{Max } Z = x + y \\
2x + 3y \leq 100 \\
x + 2y \leq 80 \\
x \geq 0, \, y \geq 0
\end{cases}
$$

<br>
<br>
<br>
<br>
<br>

<div align="center">
   👋 Feito com ♥ by Izael Silva 👋
</div>