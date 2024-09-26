# ATIVIDADE

### 1 - Atividade 1 - Linguagem Mnemônica - Assembler

| DISCIPLINA  | LINGUAGENS FORMAIS E AUTOMATOS - TURMA 30 - MM  |
|-------------|-------------------------------------------------|
| PROFESSOR   | ROLFI CINTAS GOMES LUZ                          |
| ALUNO       | IZAEL ALVES DA SILVA                            |

<br>

---

<br>

### O primeiro automato.
#### Exemplo I : Código Assembly for Debug em FreeDOS.

```assembly
  ; Início do código na posição 100h
  A 100

      MOV AH, 09      ; Carrega a função 09h no registro AH (exibir string)
      MOV DX, 109     ; Define o endereço da string em DX (memória no endereço 109h)
      INT 21          ; Chama a interrupção 21h para exibir a string
      INT 20          ; Chama a interrupção 20h para encerrar o programa

      ; Definição da string a ser exibida (terminada com '$')
      DB 'OLA SEU NOME E RA $'

  ; Ajustar o tamanho do programa:
  ; Defina o tamanho (em hexadecimal: 24 bytes ou 18h)
  -R CX
  CX 0000
  :0018

  ; Nomeie e salve o programa como OLAMUNDO.COM
  N OLAMUNDO.COM

  ; Gravar o programa na memória
  W

  ; Sair do DEBUG
  Q
```