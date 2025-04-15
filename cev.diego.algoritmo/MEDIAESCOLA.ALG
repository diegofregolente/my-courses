algoritmo "MediaEscola"
var
n1, n2, m: real
inicio
      Escreva("Primeira nota: ")
      leia(n1)
      Escreva("Segunda nota: ")
      leia(n2)
      m <- (n1 + n2) / 2
      Escreval("Media: ",m:2:1)
      Se (m > 6.0) entao
         Escreval("APROVADO")
      SeNao
           Escreval("REPROVADO")
      FimSe
fimalgoritmo