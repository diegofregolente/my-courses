algoritmo "Fatorial"
var
   n, fat: Inteiro


Funcao Fatorial(numero:inteiro):inteiro
var   c, f :inteiro
inicio
         C <- numero
         F <- 1
         para c de numero ate 1 passo -1 faca
               F <- F * C
         fimpara
         retorne F
FimFuncao
   
inicio

         Escreva("Qual número quer ver o fatorial?")
         leia(n)
         fat <- Fatorial(n)
         escreva(fat)
fimalgoritmo