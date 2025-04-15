algoritmo "SalarioXDependentes"
var
   salario: real
   dependentes: inteiro
inicio
   Escreva("Qual é o salario do funcionário? ")
   Leia(salario)
   Escreva("Quantos dependentes esse funcionário tem? ")
   Leia (dependentes)
   Escolha (dependentes)
   Caso 1
      salario <- salario + (salario * 20 / 100)
      Escreval("O salario será reajustado para :", salario)
   Caso 2
      salario <- salario + (salario * 30 / 100)
      Escreval("O salario será reajustado para :", salario)
   Caso 3
      salario <- salario + (salario * 35 / 100)
      Escreval("O salario será reajustado para :", salario)
   OutroCaso
      salario <- salario + (salario * 40 / 100)
      Escreval("O salario será reajustado para :", salario)
   FimEscolha
fimalgoritmo