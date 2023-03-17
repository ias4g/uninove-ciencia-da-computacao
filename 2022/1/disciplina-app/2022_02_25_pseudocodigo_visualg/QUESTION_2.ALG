Algoritmo "question_2"
// Disciplina   : Algoritmos e Pr�ticas de Programa��o

// Professor   : Debora Virgilia Canne

// Descri��o   : Escreva um algoritmo que leia tr�s valores inteiros e
//               mostre em ordem decrescente.

// Autor(a)    : Izael Silva (https://github.com/Ias4g)
// Data atual  : 01/06/2022
// ###################################################################################


Var
   x: inteiro
   y: inteiro
   z: inteiro

Inicio
      escreva("Digite o primeiro n�mero: ")
      leia(x)
      
      escreva("Digite o segundo n�mero: ")
      leia(y)
      
      escreva("Digite o terceiro n�mero: ")
      leia(z)
      
      se(x > y) entao
           se(x > z) entao
                se(y > z) entao
                     escreva("A ordem �: ", x, y, z)
                senao
                     escreva("A ordem �: ", x, z, y)
                fimse
           fimse
      fimse
      
      se(x < y) entao
           se(y > z) entao
                se(x > z) entao
                     escreva("A ordem �: ", y, x, z)
                senao
                     escreva("A ordem �: ", y, z, x)
                fimse
           fimse
      fimse
      
      se(x < y) entao
           se(y < z) entao
                escreva("A ordem �: ", z, y, x)
           fimse
      fimse
      
      se(x > y) entao
           se(y < z) entao
                escreva("A ordem �: ", z, x, y)
           fimse
      fimse


Fimalgoritmo