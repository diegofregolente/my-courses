algoritmo "PROCEDIMENTO3"
var
   n: inteiro
procedimento parImpar(a:inteiro)
inicio
      Se (A % 2 = 0) entao
         escreval("O n�mero ", A, " � par.")
      SeNao
           escreval("O n�mero ", A, " � impar.")
      FimSe
fimprocedimento
inicio
      escreva("Digite um valor: ")
      leia(n)
      parImpar(n)
fimalgoritmo