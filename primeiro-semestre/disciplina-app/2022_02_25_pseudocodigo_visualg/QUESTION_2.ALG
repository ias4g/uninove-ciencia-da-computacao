Algoritmo "question_2"
// Disciplina   : Algoritmos e Práticas de Programação

// Professor   : Debora Virgilia Canne

// Descrição   : Escreva um algoritmo que leia três valores inteiros e
//               mostre em ordem decrescente.

// Autor(a)    : Izael Silva (https://github.com/Ias4g)
// Data atual  : 01/06/2022

Var
   x: inteiro
   y: inteiro
   z: inteiro

Inicio
      escreva("Digite o primeiro número: ")
      leia(x)
      
      escreva("Digite o segundo número: ")
      leia(y)
      
      escreva("Digite o terceiro número: ")
      leia(z)
      
      se(x > y) entao
           se(x > z) entao
                se(y > z) entao
                     escreva("A ordem é: ", x, y, z)
                senao
                     escreva("A ordem é: ", x, z, y)
                fimse
           fimse
      fimse
      
      se(x < y) entao
           se(y > z) entao
                se(x > z) entao
                     escreva("A ordem é: ", y, x, z)
                senao
                     escreva("A ordem é: ", y, z, x)
                fimse
           fimse
      fimse
      
      se(x < y) entao
           se(y < z) entao
                escreva("A ordem é: ", z, y, x)
           fimse
      fimse
      
      se(x > y) entao
           se(y < z) entao
                escreva("A ordem é: ", z, x, y)
           fimse
      fimse


Fimalgoritmo