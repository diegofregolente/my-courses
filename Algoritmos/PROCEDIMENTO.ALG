algoritmo "PROCEDIMENTO"
var
   I: inteiro
   N, Pesado: caractere
   P, Mai: Real

Procedimento Topo()
// definindo funcao
inicio
   LimpaTela
   EscrevaL("------------------------------------")
   EscrevaL(" D E T E C T O R  DE  P E S A D O ")
   EscrevaL(" Maior Peso ate agora: ", Mai, "KG")
   EscrevaL("------------------------------------")
fimprocedimento

// inicio do codigo
inicio
      Topo()

   Para I <- 1 ate 5 faca
      Escreva("Digite o nome: ")
      leia(N)
      Escreva("Digite o peso de ", N, ": ")
      Leia(P)
      Se (P>Mai) entao
         Mai <- P
         Pesado <- N
      FimSe
      
      Topo()
      
      FimPara
      
      Topo()
      
      EscrevaL("A pessoa mais pesada é ", Pesado, ", com ", Mai, " KG.")

fimalgoritmo