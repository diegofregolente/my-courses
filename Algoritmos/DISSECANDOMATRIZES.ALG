algoritmo "DissecandoMatrizes"
var
   mat: vetor[1..4, 1..4] de inteiro
   l, c: inteiro
   resposta: inteiro

procedimento perguntaUsuario()
inicio
   escreval()
   escreval("DISSECANDO MATRIZES")
   escreval("------------------------------------")
   escreval("Escolha uma das opções abaixo")
   escreval("[1] Mostrar Matriz")
   escreval("[2] Mostrar Diagonal Principal")
   escreval("[3] Mostrar Triangulo Superior")
   escreval("[4] Mostrar Triangulo Inferior")
   escreval("[5] Sair do sistema")
   escreval("------------------------------------")
   escreva("Digite uma das opções acima: ")
   leia(resposta)
fimprocedimento

inicio
      para l <- 1 ate 4 faca
           para c <- 1 ate 4 faca
                escreva("Digite um valor para a posicao [", l, c," ]:")
                leia(mat[l,c])
           fimpara
      fimpara
      limpatela

   repita
      perguntaUsuario()
      
      se (resposta = 1) entao
         limpatela
         para l <- 1 ate 4 faca
              para c <- 1 ate 4 faca
                   escreva(mat[l,c]:5)
              fimpara
              escreval()
         fimpara
      fimse
      
      se (resposta = 2) entao
         limpatela
         para l <- 1 ate 4 faca
              para c <- 1 ate 4 faca
                   se (l = c) entao
                      escreva(mat[l,c]:5)
                   senao
                        escreva("":5)
                   fimse
              fimpara
              escreval()
         fimpara
      fimse
      
      se (resposta = 3) entao
         limpatela
         para l <- 1 ate 4 faca
              para c <- 1 ate 4 faca
                   se (l < c) entao
                      escreva(mat[l, c]:5)
                   senao
                      escreva("":5)
                   fimse
                   
              fimpara
              escreval()
         fimpara
      fimse
      
      se (resposta = 4) entao
         limpatela
         para l <- 1 ate 4 faca
              para c <- 1 ate 4 faca
                   se (l > c) entao
                      escreva(mat[l, c]:5)
                   senao
                      escreva("":5)
                   fimse
              fimpara
              escreval()
         fimpara
      fimse
      
      se (resposta <= 0) ou (resposta > 5) entao
           escreval("ERROR! Opção inválida, tente novamente!")
           limpatela
      fimse
      
   ate (resposta = 5)
   
   escreval("Até a próxima!")
   
fimalgoritmo