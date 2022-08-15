Algoritmo "question_3"
// Disciplina   : Algoritmos e Pr�ticas de Programa��o

// Professor   : Debora Virgilia Canne

// Descri��o   : Tendo como dados de entrada a altura (h) e o sexo de
//               uma pessoa, construa um algoritmo que calcule seu
//               �peso�(p) ideal, utilizando as seguintes f�rmulas:
//               Homens: (72.7 * h) � 58
//               Mulher: (62.1 * h) � 44.7

// Autor(a)    : Izael Silva (https://github.com/Ias4g)
// Data atual  : 01/06/2022
// ###################################################################################


Var
   peso: real
   altura: real
   sexo: caracter

Inicio
      escreva("Digite o sexo [ Masculino ] [ Feminino ]: ")
      leia(sexo)
      
      escreva("Digite sua altura: ")
      leia(altura)

      se(sexo = "Masculino") entao
        peso <- (72.7 * altura)-58
        escreval("")
        escreval("-------------------------------------")
        escreva("Seu sexo �: ", sexo)
        escreval("")
        escreval("Peso ideal �:", peso)
        escreva("-------------------------------------")
        escreval("")
        
      senao
        se (sexo = "Feminino") entao
          peso <- (62.1 * altura)-44.7
          escreval("")
          escreval("-------------------------------------")
          escreva("Seu sexo �: ", sexo)
          escreval("")
          escreval("Peso ideal �:", peso)
          escreva("-------------------------------------")
          escreval("")
        
        senao
          escreval("")
          escreval("-------------------------------------")
          escreval("Op��o de sexo invalida! s� pode ser [masculino] ou [Feminino]")
          escreva("-------------------------------------")
          escreval("")
        fimse
      fimse

Fimalgoritmo