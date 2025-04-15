algoritmo "Turma"
var
   nome : vetor[1..4] de Caractere
   n1 : vetor[1..4] de Real
   n2 : vetor[1..4] de Real
   m : vetor[1..4] de Real
   c: Inteiro

inicio
      para c <- 1 ate 4 passo 1 faca
           EscrevaL("ALUNO ", c)
           Escreva("Nome: ")
           Leia(nome[c])
           Escreva("NOTA 1: ")
           Leia(n1[c])
           Escreva("NOTA 2: ")
           Leia(n2[c])
           m[c] <- (n1[c] + n2[c]) / 2
      fimpara
      
      LimpaTela
      EscrevaL("LISTAGEM DE ALUNOS")
      Escreval("--------------------------------")
      para c <- 1 ate 4 passo 1 faca
           escreva(nome[c]:15, m[c]:2:2)
           se (m[c] >= 6.00) entao
                escreval(" APROVAD")
           senao se (m[c] < 6.00) entao
                 escreval(" REPROVADO")
           fimse
      fimpara
      
fimalgoritmo