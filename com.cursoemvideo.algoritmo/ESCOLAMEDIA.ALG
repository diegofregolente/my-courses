algoritmo "EscolaMedia"
var
n1, n2, m : real
inicio
      Escreva("Nota 1: ")
      leia(n1)
      Escreva("Nota 2: ")
      leia(n2)
      m <- (n1 + n2) / 2
      Escreval("Média :", M:4:2)
      Se (m > 7) entao
         Escreval("Aprovado")
      SeNao
           Se (m >= 4) e (m < 7) entao
              Escreval("Recuperação")
           Senao
                Escreval("Reprovado")
           FimSe
      FimSe
fimalgoritmo