algoritmo "MATRIZ4"
var
   mat: vetor[1..4, 1..4] de inteiro
   l,c, sDP,  p2L, mai3c: inteiro
inicio
      sDP <- 0
      p2L <- 1
      mai3c <- 0
   para l <- 1 ate 4 faca
      para c <- 1 ate 4 faca
         escreva("digite o valor da pos [", l, c, "] ")
         leia(mat[l,c])
         se (l = c) entao
            sDP <- sDP + mat[l,c]
         fimse
      fimpara
   fimpara
   
   para l <- 1 ate 4 faca
        para c <- 1 ate 4 faca
             escreva(mat[l, c]:5)
        fimpara
        escreval()
   fimpara
   
   para c <- 1 ate 4 faca
        p2L <- p2L * mat[2, c]
   fimpara
   
   para l <- 1 ate 4 faca
        Se (mat[l, 3] > mai3c) entao
           mai3c <- mat[l, 3]
        fimse
   fimpara
   
   escreval("A soma dos principal diagonal é ", sDP)
   escreval("O produto dos valores da Segunda linha é ", p2L )
   escreval("O maior valor da terceira coluna é ", mai3c)
fimalgoritmo