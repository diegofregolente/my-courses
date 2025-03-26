algoritmo "CONVERSÃOTEMPERATURA"
var
   celsius, fahrenheit : real
inicio
      escreval("Qual a temperatura aqui nos estados unidos? ")
      leia(fahrenheit)
      celsius <- (fahrenheit - 32) / 1.8
      escreval("No Brasil então é ", celsius:4:1, "° C")
fimalgoritmo