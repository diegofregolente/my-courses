algoritmo "matriz2"
var
   mat: vetor[1..3, 1..3] de inteiro
   l, c: inteiro
inicio
   para l <- 1 ate 3 faca
      para c <- 1 ate 3 faca
         escreva("Digite um valor: ")
         leia(mat[l,c])
      fimpara
   fimpara
   para l <- 1 ate 3 faca
      para c <- 1 ate 3 faca
         se(mat[l,c] % 2 = 0) entao
            escreva("[",mat[l,c],"]")
         senao
              escreva(mat[l,c])
         fimse
      fimpara
      escreval()
   fimpara

fimalgoritmo