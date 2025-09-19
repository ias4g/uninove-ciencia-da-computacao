# ATIVIDADE II

### Calcular por regra de Cramer 

|   ALUNO       |   IZAEL ALVES DA SILVA   |
|:---------------|:--------------------------|
|   PROFESSOR    |   JOÃO VAGNER PEREIRA DA SILVA         |
|   DISCIPLINA  |   PESQUISA OPERACIONAL |

---

<br>

### 6 exercícios de sistemas lineares para serem resolvidos utilizando a Regra de Cramer, conforme solicitado.

#### Sistemas com 2 incógnitas

##### Exercício 1:
Resolva o sistema linear a seguir:
$
\begin{cases}
2x+3y=7\\
x-4y=-2
\end{cases}
$

$
\Delta=\begin{vmatrix}2&3\\1&-4\end{vmatrix}=-11,\quad
\Delta_x=\begin{vmatrix}7&3\\-2&-4\end{vmatrix}=-22,\quad
\Delta_y=\begin{vmatrix}2&7\\1&-2\end{vmatrix}=-11
$

$
x=\frac{\Delta_x}{\Delta}=2,\quad y=\frac{\Delta_y}{\Delta}=1
$

**Solução:** $(x,y)=(2,1)$.

---

##### Exercício 2:
Encontre os valores de x e y no sistema:
$
\begin{cases}
5x-2y=8\\
3x+y=7
\end{cases}
$

$
\Delta=\begin{vmatrix}5&-2\\3&1\end{vmatrix}=11,\quad
\Delta_x=\begin{vmatrix}8&-2\\7&1\end{vmatrix}=22,\quad
\Delta_y=\begin{vmatrix}5&8\\3&7\end{vmatrix}=11
$

$
x=\frac{22}{11}=2,\quad y=\frac{11}{11}=1
$

**Solução:** $(x,y)=(2,1)$.

---

<br>
<br>

#### Sistemas com 3 incógnitas

##### Exercício 3:
Resolva o seguinte sistema linear:
$
\begin{cases}
x+y+z=6\\
2x-y+z=3\\
3x+2y-2z=1
\end{cases}
$

$
\Delta=\begin{vmatrix}1&1&1\\ 2&-1&1\\ 3&2&-2\end{vmatrix}=14,\;
\Delta_x=14,\;\Delta_y=28,\;\Delta_z=42
$

$
x=\tfrac{14}{14}=1,\; y=\tfrac{28}{14}=2,\; z=\tfrac{42}{14}=3
$

**Solução:** $(x,y,z)=(1,2,3)$.

---

##### Exercício 4:
Encontre a solução para o sistema:
$
\begin{cases}
x-2y+z=0\\
2x+y-3z=-5\\
-x+3y+2z=7
\end{cases}
$

$
\Delta=\begin{vmatrix}1&-2&1\\ 2&1&-3\\ -1&3&2\end{vmatrix}=20,\;
\Delta_x=0,\;\Delta_y=20,\;\Delta_z=40
$

$
x=0,\quad y=1,\quad z=2
$

**Solução:** $(x,y,z)=(0,1,2)$.

---

##### Exercício 5:
Determine o conjunto solução do sistema abaixo:
$
\begin{cases}
3x+y-z=10\\
x-y+2z=-1\\
2x+2y-3z=11
\end{cases}
$

$
\Delta=\begin{vmatrix}3&1&-1\\ 1&-1&2\\ 2&2&-3\end{vmatrix}=0,\;
\Delta_x=0,\;\Delta_y=0,\;\Delta_z=0
$

Como $\Delta=\Delta_x=\Delta_y=\Delta_z=0$, o sistema é **possível indeterminado** (infinitas soluções). Da redução (ou parametrizando via Cramer/combinações lineares), obtemos:

$
\begin{aligned}
x&=\frac{9}{4}-\frac{1}{4}t,\\
y&=\frac{13}{4}+\frac{7}{4}t,\\
z&=t,\qquad t\in\mathbb{R}.
\end{aligned}
$

(Equivalente: tomando $z=4s$, então $x=9-s,\; y=13+7s,\; z=4s$.)

---

##### Exercício 6:
Calcule os valores de x, y e z usando a Regra de Cramer:
$
\begin{cases}
4x-y+z=7\\
x+2y-z=2\\
-x-3y+2z=-5
\end{cases}
$

$
\Delta=\begin{vmatrix}4&-1&1\\1&2&-1\\-1&-3&2\end{vmatrix}=4,\;
\Delta_x=10,\;\Delta_y=-14,\;\Delta_z=-26
$

$
x=\tfrac{10}{4}=\tfrac{5}{2},\quad
y=\tfrac{-14}{4}=-\tfrac{7}{2},\quad
z=\tfrac{-26}{4}=-\tfrac{13}{2}
$

**Solução:** $\left(x,y,z\right)=\left(\tfrac{5}{2},-\tfrac{7}{2},-\tfrac{13}{2}\right)$.

<br>
<br>
<br>
<br>
<br>

<div align="center">
   👋 Feito com ♥ by Izael Silva 👋
</div>