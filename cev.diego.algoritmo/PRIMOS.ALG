algoritmo "Primos"
var
   cont, num, ContDiv: inteiro
inicio
      cont <- 1
      Escreva("Digite um numero: ")
      leia(num)
      repita
            Escreval(cont)
            Se (Num % Cont = 0) entao
               ContDiv <- ContDiv + 1
            FimSe
            cont <- cont + 1
      ate(cont > num)
      Se (ContDiv > 2) entao
         EscrevaL("O valor ", num, " não é primo")
      SeNao Se(ContDiv = 2) entao
                 EscrevaL("O valor", num, " é primo")
      FimSe

fimalgoritmo