algoritmo "DepartamentoDeTransito"
var
ANO_ATUAL, ANO_NASC, IDADE: inteiro
inicio
      Escreval("----------------------------------")
      Escreval("      DEPARTAMENTO DE TRANSITO    ")
      Escreval("----------------------------------")
      Escreva("Ano Atual (yyyy): ")
      leia(ano_atual)
      Escreva("Ano de Nascimento (yyyy): ")
      leia(ano_nasc)
      idade <- (ano_atual - ano_nasc)
      Escreval("-------- STATUS -----------")
      Escreval("     IDADE: ",idade," ANOS")
      Se (idade > 18) entao
         Escreval("     APTO A TIRAR CARTEIRA")
      Senao
           Escreval("    NÃO APTO A TIRAR CARTEIRA!!")
      FimSe
      Escreval("------------------------")
fimalgoritmo