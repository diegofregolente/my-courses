algoritmo "IMPOSTOALFANDEGA"
var
   compras, imposto : real
inicio
      escreval("Qual foi o total das compras realizadas no exterior? ")
      leia(compras)
      imposto <- (compras * 60) / 100
      escreval("O total a ser pago de imposto é ", imposto:4:2, " R$")
fimalgoritmo


//      (VALOR * 60) / 100