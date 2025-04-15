algoritmo "Contador"
var
valor, total, contador:inteiro
inicio
      Escreva("Qual o valor?")
      leia(valor)
      contador <- 0
      total <- 0
      enquanto (contador <= valor) faca
               escreval(contador)
               contador <- contador + 1
               total <- total + contador
      FimEnquanto
      Escreva("O total da soma dos numeros listados é ", total)
fimalgoritmo