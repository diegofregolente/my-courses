algoritmo "semnome"
var
   idade, ano, nasc: inteiro
inicio
      Escreval("Em que anos estamos?")
      Leia(ano)
      Escreval("Em que ano voc� nasceu?")
      Leia(nasc)
      idade <- ano - nasc
      Escreval("Em", ano, " voc� tera", idade, " anos")
      Se (idade >= 18) Entao
         Escreval("Voc� pode tirar carteira de motorista.")
      SeNao
           Escreval("Voc� n�o pode tirar carteira de motorista.")
      FimSe
fimalgoritmo