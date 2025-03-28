algoritmo "PROCEDIMENTO3"
var
   n: inteiro
procedimento parImpar(a:inteiro)
inicio
      Se (A % 2 = 0) entao
         escreval("O número ", A, " é par.")
      SeNao
           escreval("O número ", A, " é impar.")
      FimSe
fimprocedimento
inicio
      escreva("Digite um valor: ")
      leia(n)
      parImpar(n)
fimalgoritmo