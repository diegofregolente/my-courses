algoritmo "SuperContador"
var
   resp, c: inteiro

inicio
Repita
   EscrevaL("| [1] de 1 a 10 |")
   EscrevaL("| [2] de 10 a 1 |")
   EscrevaL("| [3] SAIR |")
   Leia(resp)
   Escolha(resp)
      Caso 1
         c <- 1
         repita
            escreval(c,".. ")
            c <- c + 1
            ate (c > 10)
      Caso 2
         c <- 10
           repita
                 escreval(c,".. ")
                 c <- c - 1)
           ate(c < 0)
      Caso 3
           escreval("Você está saindo do sistema ")
   FimEscolha
Ate (resp = 3)
fimalgoritmo