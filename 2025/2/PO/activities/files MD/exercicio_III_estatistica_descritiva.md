# Exercício III - estatística descritiva

|   ALUNO       |   IZAEL ALVES DA SILVA   |
|:---------------|:--------------------------|
|   PROFESSOR    |   JOAO VAGNER PEREIRA DA SILVA          |
|   DISCIPLINA  |   PESQUISA OPERACIONAL |

<br>

> ### 1. Duas salas de aula tiveram as seguintes notas:

```py
Notas1 =(8.7, 8.2, 6.1, 5.5, 7.1, 6.6, 7.7, 6.8,8.4, 6.6)
Notas2 =(10.0, 7.2, 7.1, 8.6, 8.5,7.8,6.5, 8.7, 2.0, 5.2, 7.2)
```

Descreva  o perfil de cada classe através da estatística descritiva.

- media
- mediana
- desvio padrão
- minimo
- máximo

Utilizar biblioteca NUMPY.

---

```py
import numpy as np

notasA = np.array([9.0, 8.1, 7.5, 6.8, 7.9, 8.3, 9.2, 7.7, 6.9, 8.5])
notasB = np.array([5.5, 6.2, 7.0, 6.8, 7.1, 4.9, 5.8, 6.4, 6.0, 7.2, 5.3])

def estatisticas_e_interpretacao(nome, notas):
    n = notas.size
    media = np.mean(notas)
    mediana = np.median(notas)
    desvio = np.std(notas)           # comportamento igual ao que você usou antes
    minimo = np.min(notas)
    maximo = np.max(notas)
    pct_below_7 = (notas < 7).sum() / n * 100
    pct_below_6 = (notas < 6).sum() / n * 100

    print(f"\n📊 Estatísticas da {nome}:")
    print(f"➡ Média: {media:.2f}")
    print(f"➡ Mediana: {mediana:.2f}")
    print(f"➡ Desvio Padrão: {desvio:.2f}")
    print(f"➡ Mínimo: {minimo}")
    print(f"➡ Máximo: {maximo}")
    print(f"➡ % alunos < 7: {pct_below_7:.2f}%")
    print(f"➡ % alunos < 6: {pct_below_6:.2f}%")

    return {
        "n": n, "media": media, "mediana": mediana, "desvio": desvio,
        "min": minimo, "max": maximo, "pct_below_7": pct_below_7, "pct_below_6": pct_below_6
    }

resA = estatisticas_e_interpretacao("Turma A", notasA)
resB = estatisticas_e_interpretacao("Turma B", notasB)

# Interpretação geral automática
print("\n📌 Interpretação geral:")
if resA["media"] >= 7 and resB["media"] >= 7:
    print("Ambas as turmas têm média ≥ 7.")
elif resA["media"] >= 7 and resB["media"] < 7:
    print("Turma A tem média ≥ 7 (desempenho bom). Turma B tem média < 7 — precisa de atenção.")
elif resA["media"] < 7 and resB["media"] >= 7:
    print("Turma B tem média ≥ 7. Turma A tem média < 7 — precisa de atenção.")
else:
    print("Ambas as turmas têm média < 7 — ambas precisam de atenção.")

# Observação sobre dispersão
print("Observação: os desvios-padrão são semelhantes, portanto a diferença principal é o nível médio (Turma B está deslocada para baixo).")
# Sugestão prática
if resB["pct_below_6"] > 0:
    print("Sugestão: priorizar ações (tutorias/revisões) para os alunos com nota < 6, principalmente na Turma B.")
```

```
RESULTADO:
📊 Estatísticas da Turma A:
➡ Média: 7.99
➡ Mediana: 8.00
➡ Desvio Padrão: 0.76
➡ Mínimo: 6.8
➡ Máximo: 9.2
➡ % alunos < 7: 20.00%
➡ % alunos < 6: 0.00%

📊 Estatísticas da Turma B:
➡ Média: 6.20
➡ Mediana: 6.20
➡ Desvio Padrão: 0.74
➡ Mínimo: 4.9
➡ Máximo: 7.2
➡ % alunos < 7: 72.73%
➡ % alunos < 6: 36.36%

📌 Interpretação geral:
Turma A tem média ≥ 7 (desempenho bom). Turma B tem média < 7 — precisa de atenção.
Observação: os desvios-padrão são semelhantes, portanto a diferença principal é o nível médio (Turma B está deslocada para baixo).
Sugestão: priorizar ações (tutorias/revisões) para os alunos com nota < 6, principalmente na Turma B.
```

<div align="center">
   <br>
   <br>
   <br>
   <br>
   <hr>
   👋 Feito com ❤️ by Izael Silva 👋
</div>