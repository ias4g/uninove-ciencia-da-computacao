# Exercício de equacionamento de Pesquisa operacional

|   ALUNO       |   IZAEL ALVES DA SILVA   |
|:---------------|:--------------------------|
|   PROFESSOR    |   JOAO VAGNER PEREIRA DA SILVA          |
|   DISCIPLINA  |   PESQUISA OPERACIONAL |

<br>

> ### Exercício 1: Planejamento da Produção
Uma fábrica produz dois tipos de brinquedos: carros e bonecas. Cada carro requer 3 horas de trabalho no setor de montagem e 1 hora no setor de pintura. Cada boneca requer 2 horas no setor de montagem e 2 horas no setor de pintura. A fábrica dispõe de um máximo de 180 horas de trabalho por semana no setor de montagem e 100 horas por semana no setor de pintura. O lucro por carro vendido é de $8 e o lucro por boneca vendida é de $6.
Problema: Determine o número de carros e bonecas que a fábrica deve produzir por semana para maximizar o lucro total.

Variáveis

$x$ = número de carros por semana

$y$ = número de bonecas por semana

Função objetivo (maximizar lucro): $\max\ Z = 8x + 6y$

Restrições (horas disponíveis):

* Montagem: $3x + 2y \le 180$
* Pintura: $1x + 2y \le 100$
* Não-negatividade: $x\ge0,\; y\ge0$

**Solução (verificação por vértices):**
Vértices candidatos: $(0,0), (60,0), (0,50)$ e interseção das duas retas: resolver

$$
\begin{cases}3x+2y=180\\
x+2y=100\end{cases}\Rightarrow x=40,\ y=30
$$

Lucros:

* (60,0) → $Z=8\cdot60=480$
* (0,50) → $Z=6\cdot50=300$
* (40,30) → $Z=8\cdot40+6\cdot30=500$

**Ótimo:** produzir **40 carros** e **30 bonecas** por semana; **lucro máximo = \$500**.

_✅ Comentário: solução inteira natural aqui; ambos os recursos são aproveitados na solução ótima (verificação: 3·40+2·30 = 180 e 1·40+2·30 =100)._

---

> ### Exercício 2: O Alfaiate Otimizador
Um alfaiate dispõe de 16 metros de algodão, 11 metros de seda e 15 metros de lã para produzir dois tipos de produtos: camisas e calças. 
- Exigem 2 metros de algodão e 1 metro de seda.
- Exigem 1 metro de algodão, 1 metro de seda e 2 metros de lã.

Para cada camisa vendida, ele obtém um lucro de R$ 50,00 e para cada calça, R$ 70,00. Objetivo: Formular um modelo de Programação Linear para que o alfaiate maximize seu lucro total, considerando os recursos limitados de tecido. 

Variáveis

$x$ = número de camisas

$y$ = número de calças

Dados (recursos):

* Algodão disponível = 16 m
* Seda disponível = 11 m
* Lã disponível = 15 m

Requisitos por produto:

* Camisa: 2 m algodão, 1 m seda
* Calça: 1 m algodão, 1 m seda, 2 m lã

Função objetivo (maximizar lucro):

$$
\max\; Z = 50x + 70y
$$

Restrições:

$$
\begin{cases}
2x + 1y \le 16 & (\text{algodão})\\[4pt]
1x + 1y \le 11 & (\text{seda})\\[4pt]
2y \le 15 & (\text{lã})\\[4pt]
x\ge0,\ y\ge0
\end{cases}
$$

Resolver por vértices (examinar interseções):

* Intersecção algodão–seda: $2x+y=16$ e $x+y=11$ → $x=5,\; y=6$. $Z=50·5+70·6=670$.
* Intersecção algodão–lã (usar $y=7.5$ da lã): com $y=7.5$ então $2x+7.5=16\Rightarrow x=4.25$. $Z=50·4.25+70·7.5=737.5$.
* Intersecção seda–lã: $x+y=11$ e $y=7.5\Rightarrow x=3.5$. $Z=700$.
* Eixos: (8,0) → $Z=400$; (0,7.5) → $Z=525$.

**Ótimo contínuo:** $x = 4{,}25$ camisas e $y = 7{,}5$ calças, com **lucro máximo = R\$ 737{,}50**.
Observação: a restrição de lã (y ≤ 7,5) é ativa; seda e algodão estão próximas de limitar também.

_✅ Comentário prático: se for necessário produzir números inteiros, avalie as combinações inteiras próximas (por exemplo (4,7) ou (5,7)) e compare lucros — o ótimo inteiro pode ser (4,7) ou (5,7) dependendo de qual combinação respeite todas as restrições._

---

> ### Exercício 3: Produção de Bolos
Uma confeitaria produz dois tipos de bolos: um tipo simples e um tipo recheado. 

- Requer 1 kg de farinha, 0,5 kg de açúcar e 2 ovos. O lucro por bolo é de R$ 10,00.
- Requer 1,5 kg de farinha, 0,8 kg de açúcar, 3 ovos e 0,2 kg de chocolate. O lucro por bolo é de R$ 18,00.

A confeitaria possui um estoque de 150 kg de farinha, 70 kg de açúcar e 100 dúzias de ovos. Objetivo: Modelar um problema de otimização para a confeitaria determinar a quantidade de cada tipo de bolo a ser produzida, a fim de maximizar o lucro, sujeito às restrições de matéria-prima. 

Variáveis

$s$ = número de bolos simples

$r$ = número de bolos recheados

Dados e requisitos:

* Bolo simples: farinha 1 kg, açúcar 0{,}5 kg, ovos 2 unidades; lucro R\$ 10.
* Bolo recheado: farinha 1{,}5 kg, açúcar 0{,}8 kg, ovos 3 unidades, chocolate 0{,}2 kg; lucro R\$ 18.
* Estoque: farinha 150 kg; açúcar 70 kg; ovos 100 dúzias = $100\times12=1200$ ovos.
* Nota: não foi informado estoque de chocolate — assumirei **chocolate suficiente** (não-limitante). Se houver limite, incluir mais uma restrição.

Formulação:
$$
\max\; Z = 10s + 18r
$$

sujeito a

$$
\begin{cases}
1.0\,s + 1.5\,r \le 150 & (\text{farinha, kg})\\[4pt]
0.5\,s + 0.8\,r \le 70 & (\text{açúcar, kg})\\[4pt]
2\,s + 3\,r \le 1200 & (\text{ovos, unidades})\\[4pt]
s\ge0,\; r\ge0
\end{cases}
$$

Resolver (vértices): as duas primeiras restrições não se intersectam em ponto com ambas coordenadas não-negativas factíveis (uma interseção dá r negativo), e a restrição de açúcar é a mais restritiva para $r$. Os vértices relevantes são:

* $(0,0)$,
* $(140,0)$ — max s com os recursos (respeita açúcar e ovos),
* $(0,87.5)$ — max r limitado pelo açúcar: $r \le 70/0.8 = 87.5$.

Lucros:

* (140,0) → $Z=10·140=1400$
* (0,87.5) → $Z=18·87.5=1575$

**Ótimo contínuo:** produzir **0 bolos simples** e **87{,}5 bolos recheados** (lucro R\$ 1.575).
Interpretação: o recurso limitante é **açúcar**; produzir só recheados usa melhor a disponibilidade de insumos para maximizar lucro (o recheado é mais lucrativo por “unidade de açúcar”).

_✅ Comentário prático: como número de bolos deve ser inteiro, avalie 87 ou 88 recheados e verifique consumo de recursos e lucro; provavelmente 87 recheados é a opção inteira factível com menor desperdício._

---

> ### Exercício 4: Distribuição de Notícias
Uma estação de televisão local tem dois tipos de programas: o Programa A e o Programa B. 

- Traz 20% de audiência para o público jovem e 30% para o público adulto.
- Traz 15% de audiência para o público jovem e 40% para o público adulto.

A empresa quer atrair pelo menos 2.000.000 de jovens e 3.000.000 de adultos ao dia. Objetivo: Construir um modelo matemático para que a estação determine quantas horas cada programa deve exibir para atingir os objetivos de audiência, minimizando o tempo total de exibição.

Variáveis

$x$ = horas do Programa A

$y$ = horas do Programa B

Seja $P_{Y}$ = “população base jovem” atingível por unidade de percentagem (ou seja, 1% corresponde a $P_{Y}$ espectadores). Analogamente $P_{A}$ = população base adulta por 1%.

Dados percentuais:

* Programa A: 20% jovens, 30% adultos → por hora gera $0{,}20\cdot P_{Y}$ jovens e $0{,}30\cdot P_{A}$ adultos.
* Programa B: 15% jovens, 40% adultos → por hora gera $0{,}15\cdot P_{Y}$ jovens e $0{,}40\cdot P_{A}$ adultos.

Metas absolutas: 2.000.000 jovens e 3.000.000 adultos.

Problema (minimizar tempo total):
$
\min\; x + y
$

sujeito a

$$
\begin{cases}
0.20\,P_{Y}\,x + 0.15\,P_{Y}\,y \;\ge\; 2\,000\,000 \\[4pt]
0.30\,P_{A}\,x + 0.40\,P_{A}\,y \;\ge\; 3\,000\,000 \\[4pt]
x\ge0,\; y\ge0
\end{cases}
$$

Dividindo cada desigualdade por $P_{Y}$ e $P_{A}$, respectivamente:

$$
\begin{cases}
0.20\,x + 0.15\,y \;\ge\; \dfrac{2{,}000{,}000}{P_{Y}}\\[6pt]
0.30\,x + 0.40\,y \;\ge\; \dfrac{3{,}000{,}000}{P_{A}}
\end{cases}
$$

Assim, para resolver numericamente precisamos especificar $P_Y$ e $P_A$ (quantos espectadores correspondem a 1 ponto percentual na escala que o enunciado usa).

### Solução numérica com uma suposição plausível

Para dar um número concreto, suponhamos que **1%** equivale a **1.000.000 de espectadores** (apenas uma hipótese para exemplo). Então:

* 20% → 200.000 espectadores por hora (Programa A, jovens)
* 15% → 150.000 por hora (Programa B, jovens)
* 30% → 300.000 por hora (A, adultos)
* 40% → 400.000 por hora (B, adultos)

As desigualdades ficam (números em espectadores):

$$
\begin{cases}
200{,}000\,x + 150{,}000\,y \;\ge\; 2{,}000{,}000\\
300{,}000\,x + 400{,}000\,y \;\ge\; 3{,}000{,}000
\end{cases}
$$

Dividindo por 1{,}000 (ou reescrevendo em milhares) facilita; resolvendo o sistema igualando as restrições (buscando interseção), obtemos

$$
x = 10,\; y\approx 0.
$$

_✅ Isto é: **exibir 10 horas do Programa A** (e 0 do B) já satisfaz ambas as metas sob essa suposição numérica — e minimiza $x+y$ (total de horas = 10)._

<div align="center">
   <br>
   <br>
   <br>
   <br>
   <hr>
   👋 Feito com ❤️ by Izael Silva 👋
</div>

---

Ótimo — vou resolver cada exercício passo a passo: (i) formular o modelo de Programação Linear, (ii) resolver (quando possível) e (iii) comentar a solução. Vou assumir solução contínua (não-inteira) a menos que eu diga o contrário.

---

# **Exercício 1 — Planejamento da Produção (carros e bonecas)**

Variáveis
$x$ = número de carros por semana
$y$ = número de bonecas por semana

Função objetivo (maximizar lucro):

$$
\max\; Z = 8x + 6y
$$

Restrições (horas disponíveis):

* Montagem: $3x + 2y \le 180$
* Pintura: $1x + 2y \le 100$
* Não-negatividade: $x\ge0,\; y\ge0$

**Solução (verificação por vértices):**
Vértices candidatos: $(0,0), (60,0), (0,50)$ e interseção das duas retas: resolver
$\begin{cases}3x+2y=180\\ x+2y=100\end{cases}\Rightarrow x=40,\; y=30.$

Lucros:

* (60,0) → $Z=8\cdot60=480$
* (0,50) → $Z=6\cdot50=300$
* (40,30) → $Z=8\cdot40+6\cdot30=500$

**Ótimo:** produzir **40 carros** e **30 bonecas** por semana; **lucro máximo = \$500**.

Comentário: solução inteira natural aqui; ambos os recursos são aproveitados na solução ótima (verificação: 3·40+2·30 = 180 e 1·40+2·30 =100).

---

# **Exercício 2 — O Alfaiate (camisas e calças)**

Variáveis
$x$ = número de camisas
$y$ = número de calças

Dados (recursos):

* Algodão disponível = 16 m
* Seda disponível = 11 m
* Lã disponível = 15 m

Requisitos por produto:

* Camisa: 2 m algodão, 1 m seda
* Calça: 1 m algodão, 1 m seda, 2 m lã

Função objetivo (maximizar lucro):

$$
\max\; Z = 50x + 70y
$$

Restrições:

$$
\begin{cases}
2x + 1y \le 16 & (\text{algodão})\\[4pt]
1x + 1y \le 11 & (\text{seda})\\[4pt]
2y \le 15 & (\text{lã})\\[4pt]
x\ge0,\; y\ge0
\end{cases}
$$

Resolver por vértices (examinar interseções):

* Intersecção algodão–seda: $2x+y=16$ e $x+y=11$ → $x=5,\; y=6$. $Z=50·5+70·6=670$.
* Intersecção algodão–lã (usar $y=7.5$ da lã): com $y=7.5$ então $2x+7.5=16\Rightarrow x=4.25$. $Z=50·4.25+70·7.5=737.5$.
* Intersecção seda–lã: $x+y=11$ e $y=7.5\Rightarrow x=3.5$. $Z=700$.
* Eixos: (8,0) → $Z=400$; (0,7.5) → $Z=525$.

**Ótimo contínuo:** $x = 4{,}25$ camisas e $y = 7{,}5$ calças, com **lucro máximo = R\$ 737{,}50**.
Observação: a restrição de lã (y ≤ 7,5) é ativa; seda e algodão estão próximas de limitar também.

Comentário prático: se for necessário produzir números inteiros, avalie as combinações inteiras próximas (por exemplo (4,7) ou (5,7)) e compare lucros — o ótimo inteiro pode ser (4,7) ou (5,7) dependendo de qual combinação respeite todas as restrições.

---

# **Exercício 3 — Produção de Bolos (simples e recheado)**

Variáveis
$s$ = número de bolos simples
$r$ = número de bolos recheados

Dados e requisitos:

* Bolo simples: farinha 1 kg, açúcar 0{,}5 kg, ovos 2 unidades; lucro R\$ 10.
* Bolo recheado: farinha 1{,}5 kg, açúcar 0{,}8 kg, ovos 3 unidades, chocolate 0{,}2 kg; lucro R\$ 18.
* Estoque: farinha 150 kg; açúcar 70 kg; ovos 100 dúzias = $100\times12=1200$ ovos.
* Nota: não foi informado estoque de chocolate — assumirei **chocolate suficiente** (não-limitante). Se houver limite, incluir mais uma restrição.

Formulação:

$$
\max\; Z = 10s + 18r
$$

sujeito a

$$
\begin{cases}
1.0\,s + 1.5\,r \le 150 & (\text{farinha, kg})\\[4pt]
0.5\,s + 0.8\,r \le 70 & (\text{açúcar, kg})\\[4pt]
2\,s + 3\,r \le 1200 & (\text{ovos, unidades})\\[4pt]
s\ge0,\; r\ge0
\end{cases}
$$

Resolver (vértices): as duas primeiras restrições não se intersectam em ponto com ambas coordenadas não-negativas factíveis (uma interseção dá r negativo), e a restrição de açúcar é a mais restritiva para $r$. Os vértices relevantes são:

* $(0,0)$,
* $(140,0)$ — max s com os recursos (respeita açúcar e ovos),
* $(0,87.5)$ — max r limitado pelo açúcar: $r \le 70/0.8 = 87.5$.

Lucros:

* (140,0) → $Z=10·140=1400$
* (0,87.5) → $Z=18·87.5=1575$

**Ótimo contínuo:** produzir **0 bolos simples** e **87{,}5 bolos recheados** (lucro R\$ 1.575).
Interpretação: o recurso limitante é **açúcar**; produzir só recheados usa melhor a disponibilidade de insumos para maximizar lucro (o recheado é mais lucrativo por “unidade de açúcar”).

Comentário prático: como número de bolos deve ser inteiro, avalie 87 ou 88 recheados e verifique consumo de recursos e lucro; provavelmente 87 recheados é a opção inteira factível com menor desperdício.

---

# **Exercício 4 — Distribuição de Notícias (horas de Programas A e B)**

Vou formular o modelo de forma **geral** (com parâmetros) e também apresentar uma solução numérica **sob uma suposição explícita** porque os dados dados no enunciado estão em percentuais (20%, 30% etc.) — precisamos transformar porcentagens em **números absolutos de espectadores por hora** para resolver numericamente. Sem essa escala (tamanho da audiência-pool por hora), temos apenas o modelo.

### Formulação genérica

Variáveis
$x$ = horas do Programa A
$y$ = horas do Programa B

Seja $P_{Y}$ = “população base jovem” atingível por unidade de percentagem (ou seja, 1% corresponde a $P_{Y}$ espectadores). Analogamente $P_{A}$ = população base adulta por 1%.

Dados percentuais:

* Programa A: 20% jovens, 30% adultos → por hora gera $0{,}20\cdot P_{Y}$ jovens e $0{,}30\cdot P_{A}$ adultos.
* Programa B: 15% jovens, 40% adultos → por hora gera $0{,}15\cdot P_{Y}$ jovens e $0{,}40\cdot P_{A}$ adultos.

Metas absolutas: 2.000.000 jovens e 3.000.000 adultos.

Problema (minimizar tempo total):

$$
\min\; x + y
$$

sujeito a

$$
\begin{cases}
0.20\,P_{Y}\,x + 0.15\,P_{Y}\,y \;\ge\; 2\,000\,000 \\[4pt]
0.30\,P_{A}\,x + 0.40\,P_{A}\,y \;\ge\; 3\,000\,000 \\[4pt]
x\ge0,\; y\ge0
\end{cases}
$$

Dividindo cada desigualdade por $P_{Y}$ e $P_{A}$, respectivamente:

$$
\begin{cases}
0.20\,x + 0.15\,y \;\ge\; \dfrac{2{,}000{,}000}{P_{Y}}\\[6pt]
0.30\,x + 0.40\,y \;\ge\; \dfrac{3{,}000{,}000}{P_{A}}
\end{cases}
$$

Assim, para resolver numericamente precisamos especificar $P_Y$ e $P_A$ (quantos espectadores correspondem a 1 ponto percentual na escala que o enunciado usa).

---

### Solução numérica com uma suposição plausível

Para dar um número concreto, suponhamos que **1%** equivale a **1.000.000 de espectadores** (apenas uma hipótese para exemplo). Então:

* 20% → 200.000 espectadores por hora (Programa A, jovens)
* 15% → 150.000 por hora (Programa B, jovens)
* 30% → 300.000 por hora (A, adultos)
* 40% → 400.000 por hora (B, adultos)

As desigualdades ficam (números em espectadores):

$$
\begin{cases}
200{,}000\,x + 150{,}000\,y \;\ge\; 2{,}000{,}000\\
300{,}000\,x + 400{,}000\,y \;\ge\; 3{,}000{,}000
\end{cases}
$$

Dividindo por 1{,}000 (ou reescrevendo em milhares) facilita; resolvendo o sistema igualando as restrições (buscando interseção), obtemos

$$
x = 10,\; y\approx 0.
$$

Isto é: **exibir 10 horas do Programa A** (e 0 do B) já satisfaz ambas as metas sob essa suposição numérica — e minimiza $x+y$ (total de horas = 10).

**Observação:** a conclusão numérica depende fortemente da escala usada para transformar percentuais em espectadores absolutos. Se 1% representar outro valor, a solução muda. O modelo genérico acima é o correto; para obter uma solução numérica exata você deve informar **a que quantidade absoluta de espectadores corresponde “1%” (ou fornecer os números absolutos de audiência por hora de cada programa)**.

---

## Resumo rápido e recomendações

* Ex.1: **40 carros** e **30 bonecas** → lucro \$500 (ótimo).
* Ex.2: modelo pronto; ótimo contínuo: **4,25 camisas** e **7,5 calças** → R\$737,50 (se precisar inteiro, testar arredondamentos próximos).
* Ex.3: com os estoques dados e sem limite de chocolate → produzir **87,5 bolos recheados** (óptimo contínuo); açúcar é limitante.
* Ex.4: formulei o modelo geral. Com a suposição de que 1% = 1.000.000 espectadores/hora, a solução é **10 horas do Programa A**. Se quiser, eu resolvo com a escala que você me der (por exemplo: 1% = 10.000 espectadores, ou fornecer espectadores por hora absolutos para A e B).

Quer que eu:

* Rode códigos (Python / `numpy`) que mostrem as soluções numericamente e imprimam as tabelas de vértices e lucros?
* Converta as soluções para números inteiros viáveis (quando apropriado) e compare lucros?
* Para o Exercício 4: você me fornece a interpretação/exata escala dos percentuais (ou espectadores por hora) e eu já resolvo numericamente?
