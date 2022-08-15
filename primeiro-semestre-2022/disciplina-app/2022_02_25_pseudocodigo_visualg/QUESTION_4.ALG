Algoritmo "question_4"
// Disciplina   : Algoritmos e Pr�ticas de Programa��o

// Professor   : Debora Virgilia Canne

// Descri��o   : Fa�a um algoritmo que leia o ano de nascimento de uma
//               pessoa, calcule e mostre a sua idade e, tamb�m, verifique e
//               mostre se ela j� tem idade para votar (16 anos ou mais) e para
//               conseguir a carteira de habilita��o (18 anos ou mais).

// Autor(a)    : Izael Silva (https://github.com/Ias4g)
// Data atual  : 01/06/2022
// ###################################################################################


Var
   anonasc: inteiro
   idade: inteiro

Inicio
      escreva("Digite seu ano de nascimento: ")
      leia(anonasc)
      
      escreva("")
      escreva("-----------------------------------------")
      escreval("")
      escreval("")
      
      idade <- 2022 - anonasc

      se((idade >= 16) e (idade <= 18)) ent�o
        escreval("Vc j� tem idade suficiente para votar.")
      senao
        se(idade > 18) entao
          escreval("Vc j� tem idade suficiente para votar e tirar a CNH.")
        senao
          escreval("Idade insuficiente para votar e para obter a CNH.")
        fimse
      fimse
      
      escreval("Vc tem ", idade, " anos de idade")
      escreva("-----------------------------------------")
      escreval("")
      escreval("")


Fimalgoritmo