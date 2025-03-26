algoritmo "TRIANGULO"
var
 L1, L2, L3: Real
 EQ, ES, TRI:  Logico
inicio
     Escreval("Lado 1: ")
     leia(L1)
     Escreval("Lado 2: ")
     leia(L2)
     Escreval("Lado 3: ")
     leia(L3)
     TRI <- (L1 < L2 + L3) e (L2 < L1 + L3) e (L3 < L1+L2)
     se TRI entao
        escreval("É possível formar um triangulo com essas medidas")
        EQ <- (L1=L2) e (L2=L3)
        ES <- (L1<>L2) e (L2<>L3) e (L1<>L3)
        se EQ entao
           escreval("Seu triângulo é equilatero")
        fimse
        se ES entao
           escreval("Seu triângulo é escaleno")
        senao entao
           escreval("Seu triângulo não pode ser identificado no momento.")
        fimse
     senao entao
        escreval("Não é possível formar um triangulo com essas medidas")
     fimse
fimalgoritmo
