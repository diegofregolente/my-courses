algoritmo "condi��o"
var
   resposta : caractere
procedimento andar(r:caractere)
inicio
se (r = "S") ou (r = "s") entao
         escreval("Pode andar.")
      senao
         se (r = "N") ou (r = "n") entao
            escreval("N�o pode andar.")
         senao
            escreval("N�o consegui entender sua resposta.")
         fimse  // Fecha o segundo "se"
      fimse  // Fecha o primeiro "se"
fimprocedimento
inicio
      escreval("Posso andar? [S/N]:")
      leia(resposta)
      andar(resposta)
fimalgoritmo