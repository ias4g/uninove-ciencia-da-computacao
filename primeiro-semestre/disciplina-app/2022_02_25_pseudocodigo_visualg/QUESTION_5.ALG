Algoritmo "question_5"
// Disciplina   : Algoritmos e Práticas de Programação

// Professor   : Debora Virgilia Canne

// Descrição   : Escreva um algoritmo que leia o código de um determinado
//               produto e mostre a sua classificação utilize a seguinte tabela
//               como referência. (escolha... caso)
//               Codigo Classificação
//               1 Alimento não – perecível
//               2,3 ou 4 Alimento perecível
//               5 ou 6 Vestuário
//                7 Higiene pessoal
//               8 até 15 Limpeza e utensílios domésticos
//               Qualquer outro código inválido

// Autor(a)    : Izael Silva (https://github.com/Ias4g)
// Data atual  : 01/06/2022
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
          escreval("Código:", cod)
          escreva( "Categoria: Alimentos não pereciveis.")
          
        caso 2, 3, 4
          escreval("Código:", cod)
          escreva("Categoria: Alimentos pereciveis")
          
        caso 5, 6
          escreval("Código:", cod)
          escreva("Categoria: Vestuario")
          
        caso 7
          escreval("Código:", cod)
          escreva("Categoria: Higiene pessoal")
          
        caso 8, 9, 10, 11, 12, 13, 14, 15
          escreval("Código:", cod)
          escreva("Categoria: Limpeza e utensilios domesticos")
          
        outrocaso
          escreva("Codigo de produto invalido.")
      fimescolha
      
      escreval("")
      escreval("")

Fimalgoritmo