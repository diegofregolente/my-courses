algoritmo "Fibonnaci"
var
   fn, f1, f2, c: inteiro
inicio
      f1 <- 1
      f2 <- 0
      para c <- 1 ate 10 faca
           fn <- f1 + f2
           f2 <- f1
           f1 <- fn
           escreva(f1)
      fimpara
fimalgoritmo