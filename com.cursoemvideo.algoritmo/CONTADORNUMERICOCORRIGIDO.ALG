algoritmo "contadorNumericoCorrigido"
var
   C, S, N, maior, menor: inteiro
inicio
   c <- 1
   s <- 0

   Escreva ("Digite o 1� valor: ")
   leia (n)

   maior <- n
   menor <- n
   s <- s + n

   Enquanto (c < 5) faca
      c <- c + 1
      Escreva ("Digite o ", c, "� valor: ")
      leia (n)

      Se (N > maior) entao
         maior <- n
      FimSe

      Se (N < menor) entao
         menor <- n
      FimSe

      s <- s + n
   FimEnquanto

   Escreval("A soma dos valores �: ", s)
   Escreval("O maior valor �: ", maior)
   Escreval("O menor valor �: ", menor)
fimalgoritmo