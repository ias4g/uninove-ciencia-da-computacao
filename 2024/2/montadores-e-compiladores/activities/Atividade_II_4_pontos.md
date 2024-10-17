## UNIVERSIDADE NOVE DE JULHO | CIÊNCIA DA COMPUTAÇÃO

#### MONTADORES E COMPILADORES

#### ATIVIDADES II | 4 PONTOS | ATIVIDADES EM GRUPO

|	RA	|	922114939	|
|:----------------|:-------------------|
|	NOME	|	IZAEL ALVES DA SILVA	|
|	CURSO	|	CIÊNCIA DA COMPUTAÇÃO	|
|	SÉRIE/TURMA	|	06/30	|
|	ANO	|	2024/02	|
|	CAMPUS	|	MEMORIAL AMÉRICA LATINA	|

--- 

<br>
<br>

### 1. Qual é a definição correta de um alfabeto em linguagens formais?

[] Um conjunto finito de caracteres utilizados para formar cadeias.

[] Um tipo de estrutura de dados usada para armazenar programas.

[] Um algoritmo que analisa o código fonte de um programa.

[] Uma representação gráfica das operações de um compilador.

---

<br>

### 2. Qual das seguintes opções é um exemplo de alfabeto?

[] {x, y, z, +, −, ∗, /}

[] Um diagrama que ilustra o fluxo de controle de um algoritmo.

[] ;int=10dae

[] int idade = 10;

---

<br>

### 3. Escolha abaixo a opção que contém o alfabeto válido

[] O alfabeto deve conter apenas letras maiúsculas.

[] O alfabeto deve incluir todos os caracteres especiais usados na sintaxe da linguagem.

[] O alfabeto é utilizado para definir a tabela de símbolos do compilador.

[] O alfabeto é uma representação gráfica dos tokens reconhecidos pelo compilador.

---

<br>

### 4. O que é uma cadeia em relação a um alfabeto?

[] Um conjunto de regras que define como os símbolos podem ser combinados.

[] Um algoritmo que gera combinações de caracteres.

[] Um tipo de dado que armazena informações em um programa.

[] Uma sequência de símbolos formada a partir dos caracteres do alfabeto.

---

<br>

### 5. O que acontece se um símbolo fora do alfabeto for encontrado durante a análise léxica de um código fonte?

[] O compilador ignora o símbolo e continua a análise.

[] O símbolo é automaticamente adicionado ao alfabeto.

[] O compilador gera um erro de sintaxe / lexical.

[] O símbolo é substituído por um espaço em branco.

---

<br>

### 6. Qual das seguintes afirmações sobre o alfabeto é verdadeira no contexto da análise léxica em compiladores?

[] O alfabeto determina a complexidade da linguagem de programação.

[] O alfabeto é irrelevante para a definição de gramáticas.

[] O alfabeto deve ser ilimitado para a gramática ser válida.

[] A gramática é criada a partir das combinações possíveis dos símbolos do alfabeto.

---

<br>

### 7. Em relação a linguagens formais, como o alfabeto influencia a construção de uma gramática?

[] O alfabeto define os símbolos terminais que podem ser usados nas regras de produção.

[] A gramática deve conter todas as combinações possíveis de símbolos do alfabeto.

[] A gramática é independente do alfabeto.

[] O alfabeto define os símbolos não-terminais da gramática.

---

<br>

### 8. Dado as opções abaixo, qual é o único parâmetro que NÃO faz parte da formulação de uma gramática? G(__, __, __, __)

[] Conjunto de símbolos não-terminais.

[] Conjunto de símbolos terminais.

[] Conjunto de regras de produção.

[] Conjunto de tokens léxicos.

---

<br>

### 9. Na disciplina de compiladores, o que significa criar uma gramática ambígua?

[] Quando a gramática permite mais de uma derivação para a mesma sentença.

[] Quando a gramática permite apenas uma derivação para a mesma sentença.

[] Quando a gramática gera exatamente duas sentenças e nada mais.

[] Quando a gramática permite gerar sentenças inválidas.

---

<br>

### 10. Considere a gramática livre-de-contexto G=(N,Σ,P,S). Qual das seguintes opções descreve corretamente o conjunto P de regras de produção?

[] O conjunto de regras que define como os símbolos não-terminais podem ser substituídos.

[] O conjunto de cadeias válidas da linguagem.

[] O conjunto de variáveis usadas para gerar terminais.

[] O conjunto de combinações possíveis de símbolos terminais.

---

<br>

### 11. Dado a gramática S-> 0S1 | Epsilon (vazio). Verifique qual sentença w é válida

[] w = 0000

[] w = 1100

[] w = 0101

[] w = 0011

[] w = 1230

---

<br>

### 12. Qual é o papel da gramática na análise sintática de um compilador?

[] A gramática é usada para definir as estruturas sintáticas que o código deve seguir.

[] A gramática define a tabela de símbolos que será usada durante a execução do programa.

[] A gramática é irrelevante para a análise sintática e só é usada na geração de código.

[] A gramática define as regras para gerar tokens na análise léxica.

---

<br>

### 13. Qual das seguintes opções descreve corretamente a relação entre gramática e árvore de derivação durante a análise sintática?

[] A árvore de derivação representa os erros de execução do programa.

[] A árvore de derivação é uma representação gráfica das regras de produção aplicadas para gerar uma sentença válida da gramática.

[] A árvore de derivação é construída diretamente a partir dos tokens gerados pelo analisador léxico, sem considerar a gramática.

[] A árvore de derivação é usada para otimizar o código de máquina gerado pelo compilador.

---

<br>

### 14. Selecionar a expressão válida abaixo de acordo com a gramática para expressões aritméticas:

[] id + *id

[] id * (id + id)

[] id + + id

[] (id * id) +

[] id + (id * idid)

---

<br>

### 15. Qual árvore de derivação corresponde à expressão id + ( id * id )?

[] A árvore tem E→E+T, onde E chega até id, e T chega até ( E ) e E chega até id * id.

[] A árvore tem E→T, onde E chega até id, e T chega até T e T chega até id * id.

[] A árvore de derivação tem E no topo, seguido de E + T e F no nível mais baixo.

[] A expressão não é válida.

---

<br>

### 16. Na disciplina de compiladores, o que é uma linguagem?

[] Linguagem é um conjunto de elementos (símbolos) e um conjunto de métodos (regras) para combinar tais elementos.

[] Linguagem é uma forma de realizar comunicação entre o computador e o ser humano.

[] Linguagem é uma forma de realizar comunicação entre o computador e o ser humano utilizando alfabetos.

[] Linguagem é um conjunto de elementos (símbolos) e um conjunto de métodos (regras) para montar uma frase com alfabetos latinos.

---

<br>

### 17. Considere o alfabeto A = {a,b}. Selecione abaixo qual linguagem aceita sentenças com a mesma quantidade de a e b.

[] L = {a^mb^m | n > 0}

[] L = {a^mb^m | m > 0}

[] L = {a^mb^n | m > 0, n > 0}

[] L = {a^mc^m | m > 0}

[] L = {(ac)^m}

---

<br>

### 18. Considere o alfabeto A = {a,b}. Selecione abaixo qual linguagem aceita sentenças que tenham exatamente um a na sentença, porém que permita ter b antes ou depois do a.

[] L = {ab^mab^n | n > 0, m > 0}

[] L = {ba^mb^n | m > 0, n > 0}

[] L = {bba^mbbbb^m | m > 0}

[] L = {b^mab^n | m >= 0, n >= 0}

[] L = {a(ab)^m | m = 0}

---

<br>

### 19. Dada a seguinte gramática G para a linguagem L:
P {
S→aSb
S→bSa
S→SS
S→ε (onde ε é a string vazia)
}
Descreva ou formule o que o padrão da linguagem L aceita como sentença. Dê um exemplo de sentença válida e uma sentença inválida.

