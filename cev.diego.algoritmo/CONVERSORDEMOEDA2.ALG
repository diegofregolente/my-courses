algoritmo "conversorDeMoeda2"
var
    R, D : Real
    C, conversao: inteiro
inicio
      c <- 1
      Escreva("Quantas conversões deseja? ")
      leia(conversao)
      Enquanto (c <= conversao) faca
         Escreval("Qual o valor em R$? ")
         Leia(R)
         D <- R/2.20
         Escreval("O valor convertido em US$", D:5:2)
         c <- c + 1
      FimEnquanto
fimalgoritmo