algoritmo "semnome"
var
   idade, ano, nasc: inteiro
inicio
      Escreval("Em que anos estamos?")
      Leia(ano)
      Escreval("Em que ano você nasceu?")
      Leia(nasc)
      idade <- ano - nasc
      Escreval("Em", ano, " você tera", idade, " anos")
      Se (idade >= 18) Entao
         Escreval("Você pode tirar carteira de motorista.")
      SeNao
           Escreval("Você não pode tirar carteira de motorista.")
      FimSe
fimalgoritmo