algoritmo "IMC"
var
P, A, IMC: real
inicio
      Escreval("Peso (KG): ") // KG 92.34G
      Leia(P)
      Escreval("Altura (M): ") // 1.88M
      Leia(A)
      IMC <- P / (A ^ 2)
      Escreval("IMC:", imc:3:1)
      Se (IMC >= 18.5) E (IMC <= 25) entao
         Escreval("Você está na faixa peso ideal.")
      FimSe
      Se (IMC < 17) entao
         Escreval("Muito abaixo do peso.")
      FimSe
      Se (IMC >= 17) E (IMC <= 18.5) entao
         Escreval("Abaixo do Peso.")
      FimSe
      Se (IMC > 25) E (IMC <= 30) entao
         Escreval("Sobrepeso.")
      FimSe
      Se (IMC > 30) E (IMC <= 35) entao
         Escreval("Obesidade.")
      FimSe
      Se (IMC > 35) E (IMC <= 40) entao
         Escreval("Obseidade Severa.")
      FimSe
      Se (IMC > 40) entao
         Escreval("Obseidade Mórbida.")
      FimSe
      

fimalgoritmo

// IMC = MASSA/(ALTURA^2)
// PESOA IDEAL IMC ENTRE 18,5 E 25