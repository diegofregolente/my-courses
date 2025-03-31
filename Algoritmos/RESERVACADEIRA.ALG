algoritmo "ReservaCadeira"
var
fileira: vetor[1..10] de caractere
c: inteiro
resp: caractere
inicio
      fileira[1] <- "B 1"
      fileira[2] <- "B 2"
      fileira[3] <- "B 3"
      fileira[4] <- "B 4"
      fileira[5] <- "B 5"
      fileira[6] <- "B 6"
      fileira[7] <- "B 7"
      fileira[8] <- "B 8"
      fileira[9] <- "B 9"
      fileira[10] <- "B 10"
      Para c <- 1 ate 10 faca
           escreva("[ ",fileira[c], " ]")
      FimPara
      Repita
      escreva("Deseja continuar [S/N]? ")
      leia(resp)
      Ate ((maiusc(resp) = "N"))
fimalgoritmo