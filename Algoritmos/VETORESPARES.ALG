algoritmo "VetoresPares"
var
v: vetor[1..7] de inteiro
c: inteiro
par: inteiro
inicio
      par <- 0
      para c <- 1 ate 7 passo 1 faca
           escreva("Digite um valor: ")
           leia(v[c])
      fimpara
      para c <- 1 ate 7 passo 1 faca
           Se (v[c] % 2 = 0) entao
                escreval("O número na posição:", c, " é par.")
                par <- par + 1
           fimse
      fimpara
      escreva("O total de números pares foi de :", par)
fimalgoritmo