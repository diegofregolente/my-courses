algoritmo "PROCEDIMENTO4"
var
   X, Y: Inteiro
procedimento Soma (var A, B: Inteiro)
inicio
      A <- A + 1
      B <- B + 2
      EscrevaL("Valor de A = ", A)
      EscrevaL("Valor de B = ", B)
      EscrevaL("A soma de A + B = ", A+B)
fimprocedimento
inicio
      X <- 4
      Y <- 8
      Soma(X, Y)
      EscrevaL("Valor de X e Y ", X, Y)
fimalgoritmo