# ATIVIDADE

### Regra de Crammer para 3 incógnitas

|   ALUNO       |   IZAEL ALVES DA SILVA   |
|:---------------|:--------------------------|
|   PROFESSOR    |   JOÃO VAGNER PEREIRA DA SILVA         |
|   DISCIPLINA  |   PESQUISA OPERACIONAL |

---

<br>

### Pesquise sobre o calculo de determinante ( regra de Crammer ) para 3 incógnitas

### O que é a Regra de Cramer?

A **Regra de Cramer** é um método para resolver sistemas lineares do tipo:

$
\begin{cases}
a_{11}x + a_{12}y + a_{13}z = b_1 \\
a_{21}x + a_{22}y + a_{23}z = b_2 \\
a_{31}x + a_{32}y + a_{33}z = b_3
\end{cases}
$

onde:

* $a_{ij}$ são os coeficientes do sistema,
* $b_i$ são os termos independentes,
* $x, y, z$ são as incógnitas.

O método se aplica quando o determinante da matriz dos coeficientes ($\Delta$) é **diferente de zero**.

---

### Determinante de ordem 3

Para calcular o determinante de uma matriz $3 \times 3$:

$
\Delta = \begin{vmatrix}
a_{11} & a_{12} & a_{13} \\
a_{21} & a_{22} & a_{23} \\
a_{31} & a_{32} & a_{33}
\end{vmatrix}
$

Existem dois métodos principais:

**Regra de Sarrus** (mais prática para matrizes $3 \times 3$):

1. Reescreve-se as duas primeiras colunas ao lado da matriz:

   $
   \begin{vmatrix}
   a_{11} & a_{12} & a_{13} \\
   a_{21} & a_{22} & a_{23} \\
   a_{31} & a_{32} & a_{33}
   \end{vmatrix}
   \;\;\Rightarrow\;\;
   \begin{matrix}
   a_{11} & a_{12} & a_{13} & a_{11} & a_{12} \\
   a_{21} & a_{22} & a_{23} & a_{21} & a_{22} \\
   a_{31} & a_{32} & a_{33} & a_{31} & a_{32}
   \end{matrix}
   $

2. Faz-se a soma dos produtos das diagonais principais (↘):

   $
   (a_{11}a_{22}a_{33}) + (a_{12}a_{23}a_{31}) + (a_{13}a_{21}a_{32})
   $

3. Subtrai-se a soma dos produtos das diagonais secundárias (↙):

   $
   \left[(a_{13}a_{22}a_{31}) + (a_{11}a_{23}a_{32}) + (a_{12}a_{21}a_{33})\right]
   $

Assim,

$
\Delta = a_{11}a_{22}a_{33} + a_{12}a_{23}a_{31} + a_{13}a_{21}a_{32} - a_{13}a_{22}a_{31} - a_{11}a_{23}a_{32} - a_{12}a_{21}a_{33}
$

---

### Aplicando a Regra de Cramer

Depois de calcular o determinante principal $\Delta$, definimos:

* $\Delta_x$: substituímos a **1ª coluna** de $\Delta$ pelos termos independentes $(b_1, b_2, b_3)$.
* $\Delta_y$: substituímos a **2ª coluna** por $(b_1, b_2, b_3)$.
* $\Delta_z$: substituímos a **3ª coluna** por $(b_1, b_2, b_3)$.

Assim:

$
x = \frac{\Delta_x}{\Delta}, \quad
y = \frac{\Delta_y}{\Delta}, \quad
z = \frac{\Delta_z}{\Delta}
$

---

### Exemplo prático

Resolver:

$
\begin{cases}
x + y + z = 6 \\
2x - y + z = 3 \\
3x + 2y - 2z = 1
\end{cases}
$

Matriz dos coeficientes:

$
A = \begin{bmatrix}
1 & 1 & 1 \\
2 & -1 & 1 \\
3 & 2 & -2
\end{bmatrix}
$

Determinante principal:

$
\Delta = \begin{vmatrix}1&1&1\\2&-1&1\\3&2&-2\end{vmatrix} = 14
$

Determinantes auxiliares:

$
\Delta_x = \begin{vmatrix}6&1&1\\3&-1&1\\1&2&-2\end{vmatrix} = 14,\quad
\Delta_y = 28,\quad
\Delta_z = 42
$

Portanto:

$
x=1,\; y=2,\; z=3
$

<br>
<br>
<br>
<br>
<br>

<div align="center">
   👋 Feito com ♥ by Izael Silva 👋
</div>