algoritmo "MelhorAluno"
var
   turma, c:inteiro
   melhorNota, nota: real
   melhorAluno, Aluno: caractere
inicio
   Escreval("-----------------------")
   Escreval("ESCOLA DE GUARULHOS")
   Escreval("-----------------------")
   Escreva("Quantos alunos a turma tem?")
   leia(turma)
   Escreval("-----------------------")
   c <- 1
   melhorNota <- 0
   Enquanto (c <= turma) faça
      Escreval("ALUNO", c)
      Escreval("Nome do aluno: ")
      leia (aluno)
      Escreval("Nota do Aluno: ")
      leia (nota)
      Se (melhorNota < nota) entao
         melhorNota <- nota
         melhorAluno <- aluno
      FimSe
      c <- c + 1
   FimEnquanto
   Escreval("Melhor aluno foi: ", MelhorAluno)
   Escreval("
fimalgoritmo