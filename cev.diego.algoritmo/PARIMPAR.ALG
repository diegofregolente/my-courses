algoritmo "ParImpar"
var
  numero, parimpar: real
inicio
      Escreval("Digite um número: ")
      Leia(numero)
      parimpar <- (numero % 2) // poderia ter feito Se (numero % 2 = 0)
      Se (parimpar = 0) entao
         Escreval("O número", numero, " é par")
      SeNao
           Escreval("O numero", numero, " é impar")
      FimSe
fimalgoritmo