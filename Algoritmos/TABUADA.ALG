algoritmo "Tabuada"
var
   Cont, N, R: Inteiro
inicio
      Cont <- 1
      Escreva("Quer a tabuada desejada até o 10? ")
      Leia(N)
      Repita
         R <- N * Cont
         Escreval(N, " x ", Cont, " = ", R)
         Cont <- Cont + 1
      Ate (Cont > 10)
fimalgoritmo