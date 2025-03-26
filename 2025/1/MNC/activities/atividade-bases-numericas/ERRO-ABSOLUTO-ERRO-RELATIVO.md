# ATIVIDADE: ERRO ABSOLUTO ERRO RELATIVO

| DISCIPLINA  | METODOS NUMERICOS COMPUTACIONAIS - TURMA 48 - MM  |
|-------------|-------------------------------------------------|
| PROFESSOR   | DEBORA VIRGILIA CANNE                          |
| ALUNO       | IZAEL ALVES DA SILVA                            |

<br>
<br>

### Exercício 01 | Análise de Desempenho de Algoritmo de Ordenação

Análise de Desempenho de Algoritmo de Ordenação
Considere dois algoritmos de ordenação, Algoritmo A e Algoritmo B, projetados para ordenar listas de números inteiros. Suponha que você tenha uma lista de 1000 elementos e aplique ambos os algoritmos para ordená-la. Os resultados obtidos são os seguintes:

Algoritmo A: [1, 2, 3, 4, ..., 999, 1000]

Algoritmo B: [1, 3, 2, 4, ..., 999, 1000]

Erro Absoluto (EA):

Calcule o erro absoluto entre os resultados obtidos pelos dois algoritmos. O erro absoluto (EA) é dado pela fórmula:

`EA = | RealValue - EstimatedValue |`

Onde **RealVAlue** é o resultado correto (ordenado) e **EstimatedVAlue** é o resultado obtido pelo algoritmo.

Erro Relativo (ER):

Calcule o erro relativo entre os resultados obtidos pelos dois algoritmos. O erro relativo (ER) é dado pela fórmula:

`ER = ( | RealValue - EstimatedValue | / | RealValue | ) * 100%`

Onde ***RealValue*** é o resultado correto (ordenado) e ***EstimatedValue*** é o resultado obtido pelo algoritmo.

Análise:

Com base nos resultados do erro absoluto e relativo, discuta qual algoritmo possui um desempenho melhor na ordenação da lista. Considere a eficiência dos algoritmos em termos de proximidade aos resultados corretos.

> Resolução:

```python
    # Definição das listas ordenadas pelos algoritmos
    algoritmo_a = list(range(1, 1001))  # Lista correta: [1, 2, 3, ..., 1000]
    algoritmo_b = [1, 3, 2] + list(range(4, 1001))  # Lista com erro: 2 e 3 trocados

    # Cálculo do Erro Absoluto (EA)
    erro_absoluto = [abs(a - b) for a, b in zip(algoritmo_a, algoritmo_b)]
    ea_total = sum(erro_absoluto)

    # Cálculo do Erro Relativo (ER)
    erro_relativo = [(abs(a - b) / a) * 100 for a, b in zip(algoritmo_a, algoritmo_b) if a != 0]
    er_medio = sum(erro_relativo) / len(erro_relativo)  # Média do erro relativo

    ea_total, er_medio

```
> Resultado: (2, 0.08333333333333333)

Analises:
- **Erro Absoluto Total (EA):** 2  
- **Erro Relativo Médio (ER):** 0,0833%  

Isso significa que o Algoritmo B cometeu um erro pequeno, trocando dois elementos (2 e 3), mas no geral, a lista está quase correta.

Conclusão:

O **Algoritmo A** é claramente melhor, pois ordenou corretamente. O **Algoritmo B** teve um pequeno erro, mas não impactou muito a ordenação geral. Como o erro relativo é muito baixo, o Algoritmo B ainda poderia ser considerado eficiente, mas precisa de ajustes.

---

<br>
<br>





### Exercício 2 : Dimensionamento de Disco Rígido

Considere que você é um engenheiro de hardware em uma empresa de tecnologia e está projetando um novo disco rígido (HD) para um sistema de armazenamento em nuvem. A área útil para armazenamento no disco rígido é um círculo, e é crucial otimizar essa área para obter a maior capacidade de armazenamento possível.  

**Dados:** Você precisa calcular a área do disco rígido, que tem um formato circular. O raio do disco rígido é de 8 centímetros.  

Calcule a área do disco rígido usando a fórmula da área de um círculo:  

`Área = pi * raio²`

Suponha que a área calculada representa a capacidade total de armazenamento do disco rígido.  

***Aplicação em TI/Engenharia:***

A capacidade de armazenamento de um disco rígido é um fator crítico na indústria de TI. Com base na área calculada, discuta como a capacidade de armazenamento pode ser maximizada alterando o raio do disco.  

Considere como essa otimização da área do disco rígido pode impactar diretamente o design de dispositivos de armazenamento, a eficiência de espaço em data centers e o desempenho geral do sistema.  

***Desafio adicional:***  
Se o custo de produção do disco rígido for proporcional à sua área, como você equilibraria a maximização da capacidade de armazenamento com a minimização dos custos de produção?  

Este exercício envolve o cálculo da área de um disco rígido, relacionando-o à capacidade de armazenamento em um contexto de engenharia de hardware, especialmente na área de dispositivos de armazenamento em TI. Além disso, estimula a reflexão sobre otimização de recursos e considerações econômicas no projeto de componentes de hardware.  

> Resolução:

A fórmula da área de um círculo é: `A = pi * r²`

Dado que o raio (r) do disco rígido é `8 cm`, substituímos na fórmula:

`A = pi * 8²`

Código em python para calcular area.

```python
    import math

    # Definição do raio do disco rígido
    raio = 8  # cm

    # Cálculo da área do disco rígido
    area = math.pi * (raio ** 2)

    area

```
> Resultado: 201.06192982974676

> A área do disco rígido é aproximadamente **201,06 cm²**.

A capacidade de armazenamento pode ser aumentada ao aumentar o raio do disco, pois a área cresce com o quadrado do raio. Se dobrarmos o raio para 16 cm, a área aumentaria para **804,25 cm²**, ou seja, quadruplicaria a capacidade. Isso mostra que pequenos aumentos no raio resultam em grandes aumentos na área.

**Eficiência em Data Centers:** Discos rígidos maiores podem armazenar mais dados, reduzindo a quantidade necessária de dispositivos físicos. 

**Desempenho do Sistema:** Um maior espaço pode permitir melhor organização dos dados e menos fragmentação. 

**Limitações Físicas:** Há um limite de tamanho físico para HDs em servidores e laptops.

**Desafio Adicional: Equilíbrio Entre Capacidade e Custo**

Se o custo for proporcional à área, então aumentar o raio aumenta diretamente o custo. A otimização envolveria encontrar um tamanho ideal que ofereça o máximo de armazenamento pelo menor custo possível. Alternativas incluem compactação de dados e tecnologias como SSDs, que oferecem maior densidade de armazenamento sem precisar aumentar o tamanho físico.

---

<br>
<br>





### Exercício 3: Desenvolvimento de Software e Métricas de Erro  

Imagine que você está trabalhando em um projeto de desenvolvimento de software e é responsável por implementar um algoritmo para calcular a raiz quadrada de um número. Após a implementação, você deseja avaliar a precisão do seu algoritmo em comparação com a função de raiz quadrada da biblioteca padrão.  

**Dados:**  
Seu algoritmo retorna a raiz quadrada de 10 como **3.16**. O valor real da raiz quadrada de 10, conforme a função da biblioteca padrão, é **3.162**.  

- Calcule o **Erro Absoluto (EA)** para a raiz quadrada de 10.  
- Calcule o **Erro Relativo (ER)** para a raiz quadrada de 10.  

### **Aplicação em Software/Engenharia de Software:**  
Discuta como métricas como **Erro Absoluto** e **Erro Relativo** podem ser úteis para avaliar a precisão de algoritmos em desenvolvimento de software.  

Considere como essas métricas podem ser aplicadas em cenários reais de desenvolvimento, como **validação de modelos em machine learning**, implementação de **algoritmos matemáticos**, ou em qualquer situação em que seja necessário comparar resultados estimados com valores reais.  

### **Desafio adicional:**  
Suponha que você precisa melhorar a precisão do seu algoritmo. Que ajustes você faria e como esses ajustes poderiam afetar os Erros Absoluto e Relativo?  

Este exercício destaca a aplicação de métricas de erro absoluto e relativo em um contexto de desenvolvimento de software, permitindo refletir sobre a precisão de algoritmos e considerar possíveis melhorias.  

> Resolução:

As fórmulas para os erros são:

**Erro Absoluto (EA)**: `EA = | RealValue - EstimatedReal |`

**Erro Relativo (ER)**: `ER = ( | RealValue - EstimatedValue | / | RealValue | ) * 100%`

Código em python para calcular os valores.

```python
    # Definição dos valores
    valor_real = 3.162
    valor_estimado = 3.16

    # Cálculo do Erro Absoluto
    erro_absoluto = abs(valor_real - valor_estimado)

    # Cálculo do Erro Relativo (em porcentagem)
    erro_relativo = (erro_absoluto / valor_real) * 100

    erro_absoluto, erro_relativo

```

> Resultado: (0.0019999999999997797, 0.0632511068943637)

**Resultado dos Cálculos:**

    Erro Absoluto (EA): 0.002

    Erro Relativo (ER): 0.063%  

O erro absoluto indica a diferença numérica direta entre o valor real e o estimado. O erro relativo mostra essa diferença em relação ao valor real, permitindo avaliar a precisão em termos percentuais. Como o erro relativo é muito pequeno (0.063%), o algoritmo tem uma boa precisão, mas pode ser refinado.

**Como Melhorar a Precisão do Algoritmo?**

**Ajuste da Implementação:** Verificar se a função usada para calcular a raiz quadrada pode ser otimizada, talvez utilizando métodos numéricos mais precisos como Newton-Raphson.

**Maior Precisão nos Cálculos:** Ajustar a precisão dos números utilizados (por exemplo, usar `float` de maior precisão ou `decimal` em Python).

**Bibliotecas Mais Confiáveis:** Utilizar bibliotecas matemáticas otimizadas, como a função `math.sqrt()` do Python.

---

<br>
<br>




### Opcional:

Faça o calculo da raiz quadrada em duas linguagens diferentes (C, Python,etc) ou Excel. Compare os resultados.

Calculo no excel: `=RAIZ(10) = 3.16227766`

Cálculo em Python: Usaremos a função math.sqrt(), que é altamente precisa.

```python
    import math

    valor_real = math.sqrt(10)
    print(valor_real)
```

Cálculo em C: O código em C usa a biblioteca math.h para calcular a raiz quadrada.

```c
    #include <stdio.h>
    #include <math.h>

    int main() {
        double valor_real = sqrt(10);
        printf("Raiz quadrada de 10: %.15f\n", valor_real);
        return 0;
    }
```

### **Comparação dos Resultados**
| **Linguagem/Ferramenta** | **Resultado** |
|-------------------------|--------------|
| Python (`math.sqrt(10)`) | 3.16227766016838 |
| C (`sqrt(10)`) | 3.16227766016838 |
| Excel (`=RAIZ(10)`) | 3.16227766 |

**Conclusão:**

Todos os métodos fornecem o mesmo resultado, mas com precisões ligeiramente diferentes dependendo do número de casas decimais exibidas.