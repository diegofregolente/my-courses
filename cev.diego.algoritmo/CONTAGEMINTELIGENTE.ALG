algoritmo "CONTAGEMINTELIGENTE"
var
   C, N1, N2: Inteiro
inicio
   Escreval("---------------------")
   Escreval("CONTAGEM INTELIGENTE")
   Escreval("---------------------")
   Escreva("INICIO: ")
   leia(n1)
   Escreva("FIM: ")
   leia(n2)
   Escreval("---------------------")
   Escreval(" CONTANDO")
   Escreval("---------------------")
   c <- n1
   Se (n1 < n2) entao
      Enquanto (c <= n2) faca

         Escreva(c, "...")
         c <- c + 1
      FimEnquanto
   SeNao
      Enquanto (c >= n2) faca

         Escreva(c, "...")
         c <- c - 1
      FimEnquanto
   FimSe
fimalgoritmo