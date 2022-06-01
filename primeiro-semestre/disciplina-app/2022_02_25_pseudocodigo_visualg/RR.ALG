Algoritmo "question_1"
// Disciplina   : Algoritmos e Pr�ticas de Programa��o

// Professor   : Debora Virgilia Canne

// Descri��o   : Escrever um algoritmo que leia um valor inteiro e mostre
//               na tela se � par ou impar.

// Autor(a)    : Izael Silva (https://github.com/Ias4g)
// Data atual  : 01/06/2022
// ###################################################################################


Var
   numero: inteiro

Inicio
   escreva("Digite um n�mero: ")
   leia(numero)
   
   escreval("")
   escreva("++++++++++++++++++++++++++++++")
   escreval("")
   
   se(numero mod 2 = 0) entao
    escreva("O n�mero", numero, " � par!")
   senao
    escreva("O n�mero", numero, " � impar!")
   fimse
   
   escreval("")
   escreva("++++++++++++++++++++++++++++++")
   escreval("")

Fimalgoritmo