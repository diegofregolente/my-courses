algoritmo "ParImpar"
var
  numero, parimpar: real
inicio
      Escreval("Digite um n�mero: ")
      Leia(numero)
      parimpar <- (numero % 2) // poderia ter feito Se (numero % 2 = 0)
      Se (parimpar = 0) entao
         Escreval("O n�mero", numero, " � par")
      SeNao
           Escreval("O numero", numero, " � impar")
      FimSe
fimalgoritmo