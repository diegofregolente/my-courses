algoritmo "praticaVetor1"
var
   v: vetor[1..7] de Inteiro:
   i: inteiro
   pares: inteiro
inicio
      pares <- 0
      para i <- 1 ate 7 passo 1 faca
             escreva("Fala um número :" )
             leia(v[i])
             Se (v[i] % 2 = 0) entao
                pares <- pares + 1
             FimSe
      fimpara
      escreva("Pares: ", pares)
fimalgoritmo