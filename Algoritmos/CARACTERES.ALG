algoritmo "Caracteres"
var
     site : caractere
     C : inteiro
inicio
      site <- "CursoEmVideo"
      escreval(Compr(Site))   // comprimento
      escreval(Copia(Site, 6, 2)) // le string, conta até X, copia Y letras
      escreval(Maiusc(Site)) // transforma string em maiusculo
      escreval(Minusc(Site)) // transforma string em minusculo
      escreval(Pos("ideo", site)) // procura string e fala a posição inicial
      escreval(Asc("V")) // codigo asc-ii
      escreval(Carac(86)) // tras em carac o codigo asc-ii (reverso de cima)
      
      // escrevendo nome ao contratio
      
      Para C <- Compr(site) ate 1 passo -1 faca
             escreva(copia(site, c, 1))
      FimPara
fimalgoritmo