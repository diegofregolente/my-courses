algoritmo "ExemploCaso"
var
doacao : inteiro
valor : real
inicio
      Escreval("Escolha uma op��o abaixo, obrigado por ajudar.")
      Escreval(" [1] para doar R$ 10")
      Escreval(" [2] para doar R$ 25")
      Escreval(" [3] para doar R$ 35")
      Escreval(" [4] para doar algum valor especifico")
      Escreval(" [5] para CANCELAR ")
      Escreva("Digite a op��o desejada em n�meros: ")
      leia(doacao)
      Escolha (doacao)
              Caso 1
                   valor <- 10
                   Escreval("Obrigado pela doa��o!")
              Caso 2
                   valor <- 25
                   Escreval("Obrigado pela doa��o!")
              Caso 3
                   valor <- 35
                   Escreval("Obrigado pela doa��o!")
              Caso 4
                   Escreval("Digite o valor: ")
                   leia(valor)
                   Escreval("Obrigado pela doa��o!")
              Caso 5
                   Escreval("Obrigado pela liga��o, fica para pr�xima.")
                   valor <- 0
              OutroCaso
                   Escreval("N�o foi poss�vel entender a solicita��o, liga��o encerrada.")
                   valor <- 0
      FimEscolha
      Escreval ("Sua doa��o foi de ", valor ,"R$")
fimalgoritmo