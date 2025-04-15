algoritmo "GabaritoProva"
var
   gabarito : vetor[1..4] de Caractere
   c, i : inteiro
   aluno: vetor[1..3] de Caractere
   respostas: vetor[1..4] de Caractere
   nota, media : real
   notas: vetor[1..3] de Real
inicio

   Escreval("PASSO 1: GABARITO")
   Escreval("--------------------------------")
   Para c <- 1 ate 4 faca
      escreva("Questão", c, ": ")
      leia(gabarito[c])
   FimPara
   LimpaTela
   
   Escreval("PASSO 2: RESPOSTA ALUNO")
   Escreval("--------------------------------")
   para c <- 1 ate 3 faca
      escreva("Aluno", c, ": ")
      leia(aluno[c])
      para i <- 1 ate 4 faca
           escreva("Questao", i,": ")
           leia(respostas[i])
           se respostas[i] = gabarito [i] entao
              nota <- nota + 2.5
           fimse
      fimpara
      notas[c] <- nota
      nota <- 0
   fimpara
   LimpaTela
   
   Escreval("PASSO 3: DADOS FINAIS")
   Escreval("--------------------------------")
   para c <- 1 ate 3 faca
        escreval(aluno[c]:15, notas[c]:2:2)
        media <- (media + notas[c] / 3)
   fimpara
   Escreval("--------------------------------")
   Escreval("Média da Turma: ", media:2:2)

fimalgoritmo