# ATIVIDADE | MEDIDAS DE TENDENCIA CENTRAL

|   ALUNO        |   IZAEL ALVES DA SILVA    |
|:---------------|:--------------------------|
|   PROFESSOR    |   DEBORA VIRGILIA CANNE   |
|   DISCIPLINA   |   ANALISE DE DADOS        |

<br>

### Objetivo do exercício

Aplicar os conceitos de média, mediana e moda em um contexto real de TI.
Discutir como diferentes medidas de tendência central podem influenciar a interpretação de dados de performance.

---

### Situação problema

Uma empresa de serviços em nuvem monitora, diariamente, o tempo de resposta (em milissegundos) de um de seus principais servidores de aplicação. O setor de TI coletou os seguintes dados referentes ao tempo de resposta em 20 dias consecutivos:

`data = { 112, 108, 115, 120, 118, 112, 109, 118, 125, 118, 110, 112, 130, 118, 115, 109, 118, 115, 112, 118 }`

O gestor de infraestrutura solicitou à equipe de análise de dados que faça um diagnóstico da estabilidade do servidor, respondendo:

1. **Calcule a média, mediana e moda dos tempos de resposta.**
- _Média: soma de todos os valores dividida pelo número de observações._
  - **Média: 115.60**

- _Mediana: valor central da amostra ordenada. Se houver quantidade par de elementos, é a média dos dois centrais._
  - **Mediana: 115.0**

- _Moda: valor mais frequente._
  - **Moda: 118**
   
2. **Analise se os tempos de resposta estão concentrados em torno de um valor típico ou se há grande variação.**
- _Os valores giram em torno de 112 a 118, mas existem picos como 125 e 130, que são maiores que a maioria. Isso indica uma certa concentração próxima de 115, mas com alguns valores fora do padrão._
   
3. **Avalie se a média é um bom indicador representativo do comportamento do servidor ou se a mediana/moda descrevem melhor a tendência.**
- A média (115,05) e a mediana (115) estão muito próximas, mostrando equilíbrio.
- A moda (118) indica a resposta mais comum.
- Nesse caso, como não há uma dispersão muito forte (apenas 1 ou 2 valores destoantes), a média e mediana são bons representantes.
   
4. **Com base nos resultados, sugira se o servidor está operando de forma estável ou se é necessário investigar picos de lentidão.**
- _O servidor parece estável, já que os tempos estão próximos de 115 ms.
Entretanto, como há alguns picos (125 e 130), recomenda-se monitoramento para entender se esses aumentos são ocasionais ou se indicam início de lentidão._

---

### Sugestão de roteiro para a análise

1. Calcule as três medidas de tendência central (à mão ou com Excel e Python).
- **Resolvendo com google sheets.**
  
| - | TEMP_RESP | FX | RESULTADO |
|:--|:--|:--|:--|
| 1 | 112 | MÉDIA =MÉDIA(TEMP_RESP1:TEMP_RESP20) | 115.60
| 2 | 108 | MEDIANA =MED(TEMP_RESP1:TEMP_RESP20) | 115
| 3 | 115 | MODA =MODO(TEMP_RESP1:TEMP_RESP20)   | 118
| 4 | 120
| 5 | 118
| 6 | 112
| 7 | 109
| 8 | 118
| 9 | 125
| 10 | 118
| 11 | 110
| 12 | 112
| 13 | 130
| 14 | 118
| 15 | 115
| 16 | 109
| 17 | 118
| 18 | 115
| 19 | 112
| 20 | 118

<br>
<br>

- **Resolvendo com Python.**
```py
    Médias.

    import statistics as stats
    import matplotlib.pyplot as plt

    tempos = [112, 108, 115, 120, 118, 112, 109, 118, 125, 118, 110, 112, 130, 118, 115, 109, 118, 115, 112, 118]

    media = stats.mean(tempos)
    mediana = stats.median(tempos)
    moda = stats.mode(tempos)

    print(f"Média: {media:.2f}")
    print(f"Mediana: {mediana}")
    print(f"Moda: {moda}")


    Resultado:

    Média: 115.60
    Mediana: 115.0
    Moda: 118

```

```py
    Gráfico.

    plt.plot(range(1, len(tempos)+1), tempos, marker="o", linestyle="-")
    plt.title("Tempo de Resposta do Servidor ao Longo de 20 Dias")
    plt.xlabel("Dia")
    plt.ylabel("Tempo de Resposta (ms)")
    plt.axhline(y=sum(tempos)/len(tempos), color="red", linestyle="--", label=f"Média {sum(tempos)/len(tempos):.2f}")
    plt.axhline(y=118, color="blue", linestyle="--", label="Moda 118")
    plt.axhline(y=115, color="green", linestyle="--", label="Mediana 115")
    plt.legend()
    plt.grid(True)
    plt.show()

```

![Gráfico Python](../../_images/grafico_python.png)

2. **Compare os valores: se são próximos ou distantes.**
- A média (115,6), a mediana (115) e a moda (118) são bastante próximas entre si. Isso mostra que os dados estão relativamente concentrados em torno de um valor típico, sem grandes discrepâncias. Apenas alguns valores mais altos (125 e 130) se afastam do padrão, mas não comprometem a tendência central.

3. **Escreva uma breve conclusão (3 a 5 linhas) justificando qual medida melhor descreve a situação.**
- As medidas de tendência central confirmam que o tempo de resposta do servidor gira em torno de 115 ms. A média e a mediana representam bem o comportamento geral, pois não há dispersão significativa. Já a moda reforça o valor mais recorrente (118 ms). Portanto, o servidor pode ser considerado estável, e a média é um bom indicador para descrever seu desempenho, ainda que seja importante monitorar os picos ocasionais.


<br>
<br>
<br>
<br>

<hr>
<div align="center">
   👋 Feito com ❤️ by Izael Silva 👋
</div>