algoritmo "ExemploCaso"
var
doacao : inteiro
valor : real
inicio
      Escreval("Escolha uma opção abaixo, obrigado por ajudar.")
      Escreval(" [1] para doar R$ 10")
      Escreval(" [2] para doar R$ 25")
      Escreval(" [3] para doar R$ 35")
      Escreval(" [4] para doar algum valor especifico")
      Escreval(" [5] para CANCELAR ")
      Escreva("Digite a opção desejada em números: ")
      leia(doacao)
      Escolha (doacao)
              Caso 1
                   valor <- 10
                   Escreval("Obrigado pela doação!")
              Caso 2
                   valor <- 25
                   Escreval("Obrigado pela doação!")
              Caso 3
                   valor <- 35
                   Escreval("Obrigado pela doação!")
              Caso 4
                   Escreval("Digite o valor: ")
                   leia(valor)
                   Escreval("Obrigado pela doação!")
              Caso 5
                   Escreval("Obrigado pela ligação, fica para próxima.")
                   valor <- 0
              OutroCaso
                   Escreval("Não foi possível entender a solicitação, ligação encerrada.")
                   valor <- 0
      FimEscolha
      Escreval ("Sua doação foi de ", valor ,"R$")
fimalgoritmo