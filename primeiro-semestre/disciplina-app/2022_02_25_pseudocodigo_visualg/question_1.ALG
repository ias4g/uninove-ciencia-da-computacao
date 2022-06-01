Algoritmo "question_1"
// Disciplina   : Algoritmos e Práticas de Programação

// Professor   : Debora Virgilia Canne

// Descrição   : Escrever um algoritmo que leia um valor inteiro e mostre
//               na tela se é par ou impar.

// Autor(a)    : Izael Silva (https://github.com/Ias4g)
// Data atual  : 01/06/2022

Var
   numero: inteiro

Inicio
   escreva("Digite um número: ")
   leia(numero)
   
   escreval("")
   escreva("++++++++++++++++++++++++++++++")
   escreval("")
   
   se(numero mod 2 = 0) entao
    escreva("O número", numero, " é par!")
   senao
    escreva("O número", numero, " é impar!")
   fimse
   
   escreval("")
   escreva("++++++++++++++++++++++++++++++")
   escreval("")

Fimalgoritmo