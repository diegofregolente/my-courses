algoritmo "contadorNumericoCorrigido"
var
   C, S, N, maior, menor: inteiro
inicio
   c <- 1
   s <- 0

   Escreva ("Digite o 1º valor: ")
   leia (n)

   maior <- n
   menor <- n
   s <- s + n

   Enquanto (c < 5) faca
      c <- c + 1
      Escreva ("Digite o ", c, "º valor: ")
      leia (n)

      Se (N > maior) entao
         maior <- n
      FimSe

      Se (N < menor) entao
         menor <- n
      FimSe

      s <- s + n
   FimEnquanto

   Escreval("A soma dos valores é: ", s)
   Escreval("O maior valor é: ", maior)
   Escreval("O menor valor é: ", menor)
fimalgoritmo