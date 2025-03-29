algoritmo "pratica2Vetor"
var
   nome: vetor[1..4] de Caractere:
   n1: vetor[1..4] de Real:
   n2: vetor[1..4] de Real:
   media: vetor[1..4] de Real:
   c: inteiro
inicio
   para c <- 1 ate 4 passo 1 faca
        Escreval("ALUNO ", c)
        Escreva("Nome: ")
        leia(nome[c])
        Escreva("Nota 1: ")
        leia(n1[c])
        Escreva("Nota 2: ")
        leia(n2[c])
        media[c] <-  (n1[c] + n2[c]) / 2
   fimpara
   
   LimpaTela
   escreval("LISTAGEM DE ALUNOS")
   escreval("-------------------------")
   para c <- 1 ate 4 passo 1 faca
   
        escreval(nome[c]:15, media[c])
   fimpara
fimalgoritmo