algoritmo "TorneioDeFutebol"
var
times: vetor[1..3] de Caracter
c,i : inteiro
inicio
      escreval("-------------------------------------")
      escreval("          CAMPEONATO FUTEBOL         ")
      escreval("-------------------------------------")
      para c <-1 ate 3 faca
           escreva("Nome do time: ")
           leia(times[c])
      fimpara
      LimpaTela
      
      para c <- 1 ate 3 faca
           para i <- 1 ate 3 faca
           Se (times[c] <> times[i]) entao
              escreval(times[c]:20, " [ ] X [ ] ", times[i])
           FimSe
           FimPara
      FimPara

fimalgoritmo