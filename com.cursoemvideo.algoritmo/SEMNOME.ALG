algoritmo "semnome"
var
   g1, g2, saldo: inteiro
inicio
   Escreva("Quantos gols do Santos: ")
   Leia(g1)
   Escreva("Quantos gold do Corinthians: ")
   Leia(g2)
   saldo <- abs(g1 - g2)
   Escreval("Diferença: ", saldo)
   Escolha(saldo)
   Caso 0
        Escreval("STATUS: EMPATE")
   Caso 1, 2, 3
        Escreval("STATUS: PARTIDA NORMAL")
   OutroCaso
        Escreval("STATUS: GOLEADA")
   FimEscolha
fimalgoritmo