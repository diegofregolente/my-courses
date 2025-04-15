algoritmo "SoComC"
var
   nome: caractere
   soComC: vetor [1..10] de caractere:
   c, totC: inteiro
inicio
      totC <- 0
      para c <- 1 ate 10 passo 1 faca
           escreva("Digite seu nome: ")
           leia(nome)
           se (copia(maiusc(nome), 1, 1) = "C") entao
              totC <- totC + 1
              soComC[totC] <- nome
           FimSe
      fimpara
      limpatela
      para c <- 1 ate totC passo 1 faca
           escrevaL(soComC[c])
      fimpara
      escreva("Total de pessoas com a inicial C: ", totC)
fimalgoritmo