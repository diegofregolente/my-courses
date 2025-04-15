algoritmo "EMPRESTIMO"
var
   emprestimo : real
   parcelas: inteiro
   valor_parcelas: real
inicio
    escreval("Qual valor do imprestimo? ")
    leia(emprestimo)
    escreval("Quantas parcelas foram realizadas? ")
    leia (parcelas)
    valor_parcelas <-  ((emprestimo * 0.2) + emprestimo) / parcelas
    escreval("Deverá ser pago ", parcelas, " parcelas de R$", valor_parcelas)
    
fimalgoritmo