algoritmo "Matrizes"
var
   mat: vetor[1..3, 1..2] de inteiro
   linha, coluna: inteiro
inicio
      para linha <- 1 ate 3 faca
           para coluna <- 1 ate 2 faca
                escreva("O valor da linha",linha, " para coluna",coluna,": ")
                leia(mat[linha, coluna])
           fimpara
      fimpara
      
      para linha <- 1 ate 3 faca
           para coluna <- 1 ate 2 faca
                escreva(mat[linha,coluna]:5)
           fimpara
           escreval() // pular linha a cada troca de coluna
      fimpara
fimalgoritmo