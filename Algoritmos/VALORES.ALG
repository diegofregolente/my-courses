algoritmo "VALORES"
var
   C, N: inteiro
   SOMA, MEDIA, NULO, CINCO, SOMAPAR: Real
inicio
SOMA <- 0
MEDIA <- 0
NULO <- 0
CINCO <- 0
SOMAPAR <- 0

      para c <- 1 ate 5 faca
           escreva("Digite o valor",c,"o. Valor: ")
           leia(n)
           SOMA <- (SOMA + N)
           MEDIA <- (SOMA / 5)
           Se (N % 5 = 0) entao
              CINCO <- CINCO + 1
           FimSe
           Se (N = 0) entao
              NULO <- NULO + 1
           FimSe
           Se (n % 2 = 0) entao
              SOMAPAR <- SOMAPAR + N)
           FimSe
      Fimpara
      
      escreval("A soma dos números é:",SOMA)
      escreval("A media dos números é:",MEDIA)
      escreval("Temos ",CINCO, " diviseis por 5")
      escreval("Temos ",NULO, " nulos")
      escreval("A soma dos pares é:",SOMAPAR)
      
fimalgoritmo