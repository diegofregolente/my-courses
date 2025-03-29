algoritmo "pratica3vetor"
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
   escreval("LISTAGEM DE APROVADOS")
   escreval("-------------------------")
   para c <- 1 ate 4 passo 1 faca
        Se (media[c] > 6) entao
           escreval(nome[c]:15, media[c])
        FimSe
   fimpara
fimalgoritmo