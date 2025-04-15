algoritmo "ExemploEnquanto"
var
   valor, contador, salto: inteiro
inicio
      Escreva("Quer contar ate quanto?")
      leia(valor)
      Escreva("Qual sera o salto?")
      leia(salto)
      contador <- 0
      Enquanto (contador <= valor) faca
               escreval(contador)
               contador <- contador + salto
      FimEnquanto
fimalgoritmo