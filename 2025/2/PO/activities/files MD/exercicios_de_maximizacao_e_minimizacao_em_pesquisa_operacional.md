# Exercícios  de Maximização e Minimização em PO

|   ALUNO       |   IZAEL ALVES DA SILVA   |
|:---------------|:--------------------------|
|   PROFESSOR    |   JOAO VAGNER PEREIRA DA SILVA          |
|   DISCIPLINA  |   PESQUISA OPERACIONAL |

<br>

> ### Exercício 1: Maximização de Lucro na Produção de Móveis
> 
Uma pequena marcenaria produz dois tipos de móveis: **mesas** e **cadeiras**. A produção de uma mesa consome 2 horas de mão de obra e 1 unidade de
madeira, gerando um lucro de R$ 80,00. A produção de uma cadeira consome 1 hora de mão de obra e 1 unidade de madeira, com um lucro de R$ 50,00. A marcenaria dispõe de um total de 40 horas de mão de obra e 30 unidades de madeira por semana. O objetivo é determinar quantas mesas e cadeiras devem ser produzidas semanalmente para maximizar o lucro total.

#### Equacione o problema:

- **Variáveis de decisão:**
   - x = número de mesas por semana
   - y = número de cadeiras por semana

- **Função Objetivo (Maximizar Lucro):**
  - $Z = 80x + 50y$

- **Restrições**
   - **Mão de obra:** $2x + y \le 40$
   - **Madeira:** $x + y \le 30$
   - **Não-negatividade:** $x \ge 0,\; y \ge 0$

#### Resolução:
A solução ótima fica em um dos vértices formados pelas restrições. Testamos os vértices relevantes:

* $(x,y)=(0,0)$ → $Z=0$
* eixo $y$: $x=0\Rightarrow y\le 30$ → ponto candidato $(0,30)$: $Z=50\cdot30=1500$
* eixo $x$: $y=0\Rightarrow 2x\le40 \Rightarrow x\le20$ → ponto $(20,0)$: $Z=80\cdot20=1600$
* interseção das duas retas: resolver

$
\begin{cases}
2x+y=40\\
x+y=30
\end{cases}
\Rightarrow x=10,\; y=20
$

$Z=80\cdot10 +50\cdot20 =800+1000=1800$.

**Ótimo:** produzir **10 mesas** e **20 cadeiras** por semana.
**Lucro máximo:** **R\$ 1.800,00**.

---

> ### Exercício 2: Minimização de Custos em uma Dieta
Um nutricionista está elaborando uma dieta com base em dois alimentos, A e B. Cada 100g do alimento A contém 10g de proteína e 5g de carboidratos, custando R$ 2,00. Cada 100g do alimento B contém 5g de proteína e 15g de carboidratos, custando R$ 1,50. A dieta precisa ter no mínimo 20g de proteína e 30g de carboidratos por dia. O objetivo é determinar a quantidade de cada alimento que deve ser consumida para satisfazer as necessidades nutricionais com o menor custo possível.

#### Equacione o problema:

- **Variáveis de decisão:**
   - x = quantidade (em 100g) do alimento A
   - y = quantidade (em 100g) do alimento B
- **Função Objetivo (Minimizar Custo):**
  - $Z = 2.00x + 1.50y$  (R\$ por cada 100 g)
  
- **Restrições:**
   - **Proteína:** $10x + 5y \ge 20$  (gramas)
   - **Carboidratos:** $5x + 15y \ge 30$  (gramas)
   - **Não-negatividade:** $x \ge 0,\; y \ge 0$

### Resolução:

Procuramos a combinação mais barata que satisfaça ambas as igualdades. Igualando as restrições como iguais e resolvendo:

$
\begin{cases}
10x + 5y = 20\\
5x + 15y = 30
\end{cases}
$

Dividindo a primeira por 5: $2x + y =4$ → $y = 4 - 2x$.
Segunda por 5: $x + 3y =6$. Substituindo $y$:

$
x + 3(4-2x) = 6 \Rightarrow x +12 -6x =6 \Rightarrow -5x = -6 \Rightarrow x = \tfrac{6}{5} = 1{,}2
$

Então $y = 4 - 2(1{,}2) = 4 - 2{,}4 = 1{,}6$.

Essas quantidades são em porções de 100 g, ou seja: **120 g** do alimento A e **160 g** do alimento B.

Custo: $Z = 2\cdot1{,}2 + 1{,}5\cdot1{,}6 = 2{,}4 + 2{,}4 = \mathbf{R\$\,4{,}80}$.

**Ótimo:** comer **120g de A** e **160g de B** por dia.
**Custo mínimo diário:** **R\$ 4,80**.

---

> ### Exercício 3: Maximização de Produção Agrícola
Um agricultor tem 100 hectares de terra para plantar milho e soja. O custo de plantio por hectare de milho é de R$ 200,00 e o de soja é R$100,00. O agricultor tem um orçamento máximo de R$ 12.000,00 para o plantio. A mão de obra necessária para o milho é de 2 dias por hectare e para a soja é de
3 dias por hectare. O agricultor dispõe de no máximo 240 dias de mão de obra. O lucro por hectare de milho é de R$ 500,00 e de soja é R$ 300,00. O objetivo é determinar quantos hectares de cada cultura devem ser plantados para maximizar o lucro.

#### Equacione o problema:

- **Variáveis de decisão:**
   - x = hectares
   - y = hectares

* Área total disponível: **100 hectares**.
* Custo por ha:
  * milho R\$200
  * soja R\$100
  * orçamento máximo **R\$ 12.000,00**.
* Mão de obra:
  * milho 2 dias/ha
  * soja 3 dias/ha
  * máximo **240 dias**.
* Lucro por ha:
  * milho R\$500
  * soja R\$300.

- **Função Objetivo (Maximizar Lucro):**
   - $Z=500x+300y$

- **Restrições:**
   - **Área:** $x + y \le 100$
   - **Custo:** $200x + 100y \le 12000$ → dividir por 100: $2x + y \le 120$
   - **Mão de obra:** $2x + 3y \le 240$
   - **Não-negatividade:** $x \ge 0,\; y \ge 0$

#### Resolução:
Calculei os vértices das interseções das retas e verifiquei quais satisfazem todas as restrições; os candidatos factíveis e seus lucros:

* $(x,y)=(0,80)$: verifica as três restrições → $Z=300\cdot80=24.000$
* $(x,y)=(60,0)$: factível → $Z=500\cdot60=30.000$
* interseção custo × mão de obra: $(30,60)$ — verifica todas as restrições → $Z=500\cdot30 +300\cdot60 =15.000+18.000=33.000$
  (Outros vértices violavam alguma restrição.)

**Ótimo:** plantar **30 ha de milho** e **60 ha de soja**.
**Lucro máximo:** **R\$ 33.000,00**.

*Observação intuitiva:* nesse ponto o orçamento (custo) e a mão de obra ficam totalmente utilizados (são restrições ativas), sobrando 10 ha de área não utilizados porque custo/mão-de-obra limitam mais do que a área disponível.

<div align="center">
   <br>
   <br>
   <br>
   <br>
   <hr>
   👋 Feito com ❤️ by Izael Silva 👋
</div>