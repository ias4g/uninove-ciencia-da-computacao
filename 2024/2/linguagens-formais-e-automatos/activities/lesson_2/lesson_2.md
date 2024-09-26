# ATIVIDADE

### 2 - Atividade - Linguagem de Nível 5 - Prolog

| DISCIPLINA  | LINGUAGENS FORMAIS E AUTOMATOS - TURMA 30 - MM  |
|-------------|-------------------------------------------------|
| PROFESSOR   | ROLFI CINTAS GOMES LUZ                          |
| ALUNO       | IZAEL ALVES DA SILVA                            |

<br>

---

<br>

### Faça uma base de dados com 5 objetos em Prolog com os dados de estudante(nome, idade, ra, curso).

- Considere a base abaixo.

```prolog
  estudante(alex,23,123, ccom).
  estudante(bruno,33,456,ads).
  estudante(caio, 43,789, redes).
  estudante(debora,53,012,tgti).
  estudante(eliana,43,345, sis).


  cursa(alex, bda, alg).
  cursa(bruno, front, provi).
  cursa(caio, recon, switch).
  cursa(debora, ia, iot).
  cursa(eliana, bda, est).
```

- A partir da entidade cursa retorne os estudantes.

Resposta:

```prolog
estudante(N, I, R, C).
estudante(alex, I, R, C).
cursa(N, bda, M) , estudante(N, I, R, C)
```