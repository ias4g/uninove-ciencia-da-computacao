# ATIVIDADE | AMOSTRAGEM

### AMOSTRAGEM ESTRATIFICADA

|   ALUNO       |   IZAEL ALVES DA SILVA   |
|:---------------|:--------------------------|
|   PROFESSOR    |   DEBORA VIRGÍLIA CANNE          |
|   DISCIPLINA  |   ANÁLISE DE DADOS |

---

<br>

#### 1. Seleção de Usuários para Testes de Software
> Uma empresa de software está desenvolvendo um novo aplicativo e deseja realizar testes beta antes do lançamento. A empresa possui 10.000 usuários cadastrados, distribuídos em três categorias:

- Iniciantes: 5.000 usuários
- Intermediários: 3.000 usuários
- Avançados: 2.000 usuários

A equipe de desenvolvimento decidiu selecionar uma amostra de 500 usuários para os testes, utilizando amostragem estratificada proporcional.

Questões:

<ol type="I">
  <li><b>Quantos usuários de cada categoria devem ser selecionados para manter a proporcionalidade?</b></li>

###### Amostra ${n}={500}$
###### População ${N}:{5{.}000}+{3{.}000}+{2{.}000}={10{.}000}$

_Passo 1 (fração de amostragem):_
$\dfrac{n}{N} = \dfrac{500}{10{.}000} = 0{,}05$

_Aplicando a fração a cada estrato:_

* $0{,}05 \times 5{.}000 = 250$ (Iniciantes)
* $0{,}05 \times 3{.}000 = 150$ (Intermediários)
* $0{,}05 \times 2{.}000 = 100$ (Avançados)

_Cheque: 250 + 150 + 100 = **500** ✅_

  <li><b>Se a empresa decidir aumentar a amostra para 800 usuários, como ficaria a distribuição proporcional?</b></li>

###### Amostra ${n}={800}$
###### População ${N}:{5{.}000}+{3{.}000}+{2{.}000}={10{.}000}$

_Passo 1 (fração de amostragem):_
$\dfrac{n}{N} = \dfrac{800}{10{.}000} = 0{,}08$

_Aplicando a fração a cada estrato:_

* $0{,}08 \times 5{.}000 = 400$ (Iniciantes)
* $0{,}08 \times 3{.}000 = 240$ (Intermediários)
* $0{,}08 \times 2{.}000 = 160$ (Avançados)

_Cheque: 400 + 240 + 160 = **800** ✅_
</ol>

---

#### 2. Análise de Tráfego em um Servidor
> Uma empresa de hospedagem de sites deseja analisar o tráfego de dados em seus servidores. Para isso, eles dividem os clientes em três categorias, de acordo com o volume mensal de acessos ao site:

- Pequeno porte: 600 clientes
- Médio porte: 300 clientes
- Grande porte: 100 clientes

A empresa deseja realizar um estudo com uma amostra de 200 clientes para avaliar padrões de consumo de largura de banda.

Questões:

<ol type="I">
    <li><b>Como deve ser a distribuição proporcional da amostra entre os três grupos?</b></li>

###### Amostra ${n}={200}$
###### População ${N}:{600}+{300}+{100}={1{.}000}$

_Passo 1 (fração de amostragem):_
$\dfrac{n}{N} = \dfrac{200}{1{.}000} = 0{,}2$

_Aplicando a fração a cada estrato:_

* $0{,}2 \times 600 = 120$ (Pequeno Porte)
* $0{,}2 \times 300 = 60$ (Médio Porte)
* $0{,}2 \times 100 = 20$ (Grande Porte)

_Cheque: 120 + 60 + 20 = **200** ✅_
    <li><b>Se a empresa decidir coletar dados de 400 clientes em vez de 200, qual será a nova distribuição proporcional?</b></li>

###### Amostra ${n}={400}$
###### População ${N}:{600}+{300}+{100}={1{.}000}$

_Passo 1 (fração de amostragem):_
$\dfrac{n}{N} = \dfrac{400}{1{.}000} = 0{,}4$

_Aplicando a fração a cada estrato:_

* $0{,}4 \times 600 = 240$ (Pequenos Porte)
* $0{,}4 \times 300 = 120$ (Médio Porte)
* $0{,}4 \times 100 = 40$ (Grande Porte)

_Cheque: 240 + 120 + 40 = **400** ✅_
</ol>

---

#### 3. Segurança Cibernética em Diferentes Setores
> Uma empresa de segurança cibernética está conduzindo uma pesquisa sobre ataques de phishing em diferentes setores do mercado. Eles possuem uma base de 5.000 empresas divididas em três categorias:

- Pequenas empresas: 2.500 empresas
- Médias empresas: 1.500 empresas
- Grandes empresas: 1.000 empresas

Para a análise, será selecionada uma amostra de 400 empresas, mantendo a proporção dos estratos.

Questões:

<ol type="I">
<li><b>Quantas empresas de cada categoria devem ser selecionadas?</b></li>

###### Amostra ${n}={400}$
###### População ${N}:{2{.}500}+{1{.}500}+{1{.}000}={5{.}000}$

_Passo 1 (fração de amostragem):_
$\dfrac{n}{N} = \dfrac{400}{5{.}000} = 0{,}08$

_Aplicando a fração a cada estrato:_

* $0{,}08 \times {2{.}500} = 200$ (Pequenas Empresas)
* $0{,}08 \times {1{.}500} = 120$ (Médias Empresas)
* $0{,}08 \times {1{.}000} = 80$ (Grandes Empresas)

_Cheque: 200 + 120 + 80 = **400** ✅_

<li><b>Se a empresa decidir ampliar a pesquisa para 600 empresas, qual será a nova distribuição da amostra?</b></li>

###### Amostra ${n}={600}$
###### População ${N}:{2{.}500}+{1{.}500}+{1{.}000}={5{.}000}$

_Passo 1 (fração de amostragem):_
$\dfrac{n}{N} = \dfrac{600}{5{.}000} = 0{,}12$

_Aplicando a fração a cada estrato:_

* $0{,}12 \times {2{.}500} = 300$ (Pequenas Empresas)
* $0{,}12 \times {1{.}500} = 180$ (Médias Empresas)
* $0{,}12 \times {1{.}000} = 120$ (Grandes Empresas)

_Cheque: 300 + 180 + 120 = **600** ✅_
</ol>

---

#### 4. Eficiência de Algoritmos em Diferentes Tipos de Hardware
> Uma equipe de cientistas da computação está avaliando a eficiência de um novo algoritmo de compressão de dados em diferentes tipos de hardware. Eles possuem um conjunto de 3.000 dispositivos classificados da seguinte forma:

- Computadores pessoais: 1.800 dispositivos
- Servidores empresariais: 900 dispositivos
- Supercomputadores: 300 dispositivos

Para o estudo, será utilizada uma amostra de 300 dispositivos, mantendo a proporcionalidade dos estratos.

Questões:

<ol type="I">
    <li><b>a) Como deve ser a distribuição proporcional da amostra?</b></li>

###### Amostra ${n}={300}$
###### População ${N}:{1{.}800}+{900}+{300}={3{.}000}$

_Passo 1 (fração de amostragem):_
$\dfrac{n}{N} = \dfrac{300}{3{.}000} = 0{,}1$

_Aplicando a fração a cada estrato:_

* $0{,}1 \times {1{.}800} = 180$ (Computadores Pessoais)
* $0{,}1 \times {900} = 90$ (Servidores Empresariais)
* $0{,}1 \times {300} = 30$ (Supercomputadores)

_Cheque: 180 + 90 + 30 = **300** ✅_
    <li><b>b) Se a equipe ampliar a pesquisa para 500 dispositivos, quantos devem ser escolhidos de cada categoria?</b></li>

###### Amostra ${n}={500}$
###### População ${N}:{1{.}800}+{900}+{300}={3{.}000}$

_Passo 1 (fração de amostragem):_
$\dfrac{n}{N} = \dfrac{500}{3{.}000} = 0{,}16666666666667$

_Aplicando a fração a cada estrato:_

* $0{,}16666666666667 \times {1{.}800} = 300$ (Computadores Pessoais)
* $0{,}16666666666667 \times {900} = 150$ (Servidores Empresariais)
* $0{,}16666666666667 \times {300} = 50$ (Supercomputadores)

_Cheque: 300 + 150 + 50 = **500** ✅_
</ol>