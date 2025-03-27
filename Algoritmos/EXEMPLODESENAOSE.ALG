algoritmo "ExemploDeSenaoSe"
var
dinheiro : real
inicio
      Escreva("Quanto dinheiro eu tenho? R$:")
      leia(dinheiro)
      Se (dinheiro > 10000) entao
         Escreval("Eu vou pra disney!")
      SeNao
         Se (dinheiro > 2000) e (dinheiro < 10000) entao
               Escreval("Eu vou pra praia!!")
         SeNao entao
              Escreval("Não tenho dinheiro, vou ficar em casa.")
         FimSe
      FimSe
fimalgoritmo