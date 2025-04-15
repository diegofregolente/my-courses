algoritmo "FUNCAO2"

var
n : inteiro
r : caractere

funcao ParOuImpar(num:inteiro):caractere
inicio
       Se (num % 2 = 0) entao
          retorne "par"
       SeNao
            retorne "impar"
       FimSe
fimfuncao

inicio
      escreva("Qual o valor a ser verificado: ")
      leia(n)
      r <- ParOuImpar(n)
      escreva(R)
fimalgoritmo