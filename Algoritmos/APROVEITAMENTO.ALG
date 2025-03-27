algoritmo "Aproveitamento"
var
n1, n2, m: real

inicio
      Escreval("ESCOLA DE GUARULHOS")
      Escreva("Nota 1: ")
      leia(n1)
      Escreva("Nota 2: ")
      leia(n2)
      m <- (n1 + n2) / 2
      Escreval("Média: ", m:2:1)
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
fimalgoritmo