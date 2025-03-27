algoritmo "Fatorial"
var
   C, N, F: Inteiro
   Resp: caractere
inicio
      Repita
         Escreva("Qual número quer ver o fatorial?")
         leia(n)
         C <- n
         F <- 1
         Repita
               F <- F * C
               escreval(f) // teste
               C <- C - 1
         Ate (C < 1)
         Escreval("O valor do fatorial é: ", F)
         Escreval("Quer continuar? [S/N]: ")
         leia(Resp)
         LimpaTela
      Ate (Resp = "N") ou (Resp = "n")
fimalgoritmo