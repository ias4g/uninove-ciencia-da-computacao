Algoritmo "question_5"
// Disciplina   : Algoritmos e Pr�ticas de Programa��o

// Professor   : Debora Virgilia Canne

// Descri��o   : Escreva um algoritmo que leia o c�digo de um determinado
//               produto e mostre a sua classifica��o utilize a seguinte tabela
//               como refer�ncia. (escolha... caso)
//               Codigo Classifica��o
//               1 Alimento n�o � perec�vel
//               2,3 ou 4 Alimento perec�vel
//               5 ou 6 Vestu�rio
//                7 Higiene pessoal
//               8 at� 15 Limpeza e utens�lios dom�sticos
//               Qualquer outro c�digo inv�lido

// Autor(a)    : Izael Silva (https://github.com/Ias4g)
// Data atual  : 01/06/2022
// ###################################################################################


Var
   cod: inteiro

Inicio
      escreva("Digite um codigo de produto de 1 a 15: ")
      leia(cod)
      
      escreval("-------------------------------------------")
      escreval("")
      escreva("")
      
      escolha cod
        caso 1
          escreval("C�digo:", cod)
          escreva( "Categoria: Alimentos n�o pereciveis.")
          
        caso 2, 3, 4
          escreval("C�digo:", cod)
          escreva("Categoria: Alimentos pereciveis")
          
        caso 5, 6
          escreval("C�digo:", cod)
          escreva("Categoria: Vestuario")
          
        caso 7
          escreval("C�digo:", cod)
          escreva("Categoria: Higiene pessoal")
          
        caso 8, 9, 10, 11, 12, 13, 14, 15
          escreval("C�digo:", cod)
          escreva("Categoria: Limpeza e utensilios domesticos")
          
        outrocaso
          escreva("Codigo de produto invalido.")
      fimescolha
      
      escreval("")
      escreval("")

Fimalgoritmo