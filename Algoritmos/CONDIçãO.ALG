algoritmo "condição"
var
   resposta : caractere
inicio
      escreval("Posso andar? [S/N]:")
      leia(resposta)
      se (resposta = "S") ou (resposta = "s") entao
         escreval("Pode andar.")
      senao
         se (resposta = "N") ou (resposta = "n") entao
            escreval("Não pode andar.")
         senao
            escreval("Não consegui entender sua resposta.")
         fimse  // Fecha o segundo "se"
      fimse  // Fecha o primeiro "se"
fimalgoritmo