algoritmo "Aproveitamento"
var
   n1, n2: real

procedimento Aproveitamento (a, b: real)
var m: real
inicio
   m <- (a + b) / 2
   Escreval("M?dia: ", m:2:1)
   Escolha(m)
   Caso 0, 1, 2, 3, 4
      Escreva("Aproveitamento: F")
   Caso 5
      Escreva("Aproveitamento: E")
   Caso 6
      Escreva("Aproveitamento: D")
   Caso 7
      Escreva("Aproveitamento: C")
   Caso 8
      Escreva("Aproveitamento: B")
   Caso 9, 10
      Escreva("Aproveitamento: A")
   FimEscolha
fimprocedimento

inicio
   Escreval("ESCOLA DE GUARULHOS")
   Escreva("Nota 1: ")
   leia(n1)
   Escreva("Nota 2: ")
   leia(n2)
   Aproveitamento(n1, n2)
fimalgoritmo