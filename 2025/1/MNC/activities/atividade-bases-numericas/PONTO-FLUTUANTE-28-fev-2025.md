# ATIVIDADE: PONTO FLUTUANTE

| DISCIPLINA  | METODOS NUMERICOS COMPUTACIONAIS - TURMA 48 - MM  |
|-------------|-------------------------------------------------|
| PROFESSOR   | DEBORA VIRGILIA CANNE                          |
| ALUNO       | IZAEL ALVES DA SILVA                            |

<br>
<br>

### 1. Exercício 01

> Considere um sistema de ponto flutuante com as seguintes características:

Base (B) = 2

Precisão (p) = 3 dígitos

Expoente mínimo (E_min) = -2

Expoente máximo (E_max) = 2

Dado o número real: `0,1101x2³`

**Como a precisão é de 3 dígitos, a mantissa será truncada para 0,110x2³**

- Esse número pode ser representado corretamente no sistema de ponto flutuante descrito? Justifique sua resposta?
    - _Resposta: <u>O número não pode ser representado corretamente no sistema de ponto flutuante devido ao overflow de expoente.</u>_

- Caso não possa ser representado, indique se ocorreu overflow ou underflow.
    - _Resposta: <u>Como o expoente 3 está fora do intervalo [-2, 2], ocorre um overflow.</u>_

---

### 2. Exercício 02

> Dado o número na base decimal:

    0,3125 x 10^7

Considere um sistema de ponto flutuante definido pela função:

    F(10,3,-2,5)

Onde:

B=10 (base decimal)

P= 3 (3 dígitos significativos após o arredondamento)

Emin=−2

Emax=5

Questões:

**O sistema tem precisão de 3 dígitos, então a mantissa foi arredondada para 0,313.**

- O número pode ser representado corretamente nesse sistema?
    - _Resposta: <u>O número não pode ser representado corretamente no sistema de ponto flutuante devido ao overflow de expoente.</u>_
	
- Se não puder ser representado, ocorreu underflow ou overflow?
    - _Resposta: <u>O expoente (7) do número é maior que o expoente máximo permitido pelo sistema, que é (5). Portanto, ocorre um overflow de expoente.</u>_

---

### 3. Exercício 03

> Considere agora um sistema de ponto flutuante com os seguintes parâmetros:

Base (B) = 10

Precisão (p) = 4 dígitos

Expoente mínimo (E_min) = -3

Expoente máximo (E_max) = 3

Dado o número real:

    0,75321x10^-4

**O sistema tem precisão de 4 dígitos. A mantissa do número dado (0,75321) tem 5 dígitos. Portanto, a mantissa será arredondada para 0,7532.**

- Esse número pode ser representado corretamente no sistema de ponto flutuante descrito? Justifique sua resposta.
    - _Resposta: <u>O número não pode ser representado corretamente no sistema de ponto flutuante devido ao underflow de expoente.</u>_

- Caso não possa ser representado, indique se ocorreu overflow ou underflow.
    - _Resposta: <u>Ocorreu underflow de expoente._</u>

---

### 4. Exercício 04

> Dado o número na base decimal:

    0,875x3^4

Considere um sistema de ponto flutuante definido pela função:

    F(3, 2, -3, 3)

onde

B = 3 (base ternária)

P = 2 (2 digitos significativos após o arredondamento)

E min = -3

E max = 3

Questões:

- O número pode ser representado corretamente nesse sistema?
    - _Resposta: <u>O número não pode ser representado corretamente no sistema de ponto flutuante descrito.</u>_

- Se não puder ser representado, ocorreu underflow ou overflow?
    - _Resposta: <u>Ocorreu overflow de expoente.</u>_