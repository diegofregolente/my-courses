algoritmo "SeletorDePessoas"
var
   sexo, resp: caractere
   idade, ContM, ContF, cabelo: inteiro
inicio
   ContM <- 0
   ContF <- 0
   Repita
      escreval("======================")
      escreval("  SELETOR DE PESSOAS  ")
      escreval("======================")
      escreva("Qual o Sexo? [M/F]: ")
      leia(sexo)
      escreva("Qual a idade: ")
      leia(idade)
      escreva("Qual a cor do cabelo? ")
      escreval("======================")
      escreval("[1] PRETO")
      escreval("[2] CASTANHO")
      escreval("[3] LOIRO")
      escreval("[4] RUIVO")
      leia(cabelo)
      Se (sexo = "M") ou (sexo = "m") entao
         Se (idade > 18) entao
            Se (cabelo = 2) entao
               ContM <- ContM + 1
            FimSe
         FimSe
      FimSe
      Se (sexo = "F") ou (sexo = "f") entao
         Se (idade >= 25) e (idade <= 30) entao
            Se (cabelo = 3) entao
               ContF <- ContF + 1
            FimSe
         FimSe
      FimSe
      escreva("Quer continuar? [S/N] ")
      leia(resp)
   Ate (resp = "N") ou (resp= "n")
   LimpaTela
   escreval("======================")
   escreval("  RESULTADO FINAL  ")
   escreval("======================")
   escreval("total de homens com mais de 18 e cabelos castanhos", ContM)
   escreval("total de mulheres entre 25 e 30 anos e cabelos loiros", ContF)
fimalgoritmo