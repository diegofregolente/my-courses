package exemplos;

/* o codigo abaixo é um exemplo de if modo flecha que é considerado incorreto.
Para o caso abaixo ó recomendado seria definir um switch pois sabemos que os meses vao de 1 ao 12.
 */

public class Exemplo03 {
    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    private static void ifFlecha() {
        int mes = 13;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("MAIO");
                        } else {
                            if (mes == 6) {
                                System.out.println("JUNHO");
                            } else {
                                if (mes == 7) {
                                    System.out.println("JULHO");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("AGOSTO");
                                    } else{
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("OUTUBRO");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("NOVEMBRO");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("DEZEMBRO");
                                                    } /* else {
                                                          System.out.println("");
                                                    } */
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
    private static void ifSemFlecha() {
        int mes = 13;
        if (mes == 1) {
            System.out.println("JANEIRO");
        } else if (mes == 2) {
            System.out.println("FEVEREIRO");
        } else if (mes == 3) {
            System.out.println("MARÇO");
        } else if (mes == 4) {
            System.out.println("ABRIL");
        } else if (mes == 5) {
            System.out.println("MAIO");
        } else if (mes == 6) {
            System.out.println("JUNHO");
        } else if (mes == 7) {
            System.out.println("JULHO");
        } else if (mes == 8) {
            System.out.println("AGOSTO");
        } else if (mes == 9) {
            System.out.println("SETEMBRO");
        } else if (mes == 10) {
            System.out.println("OUTUBRO");
        } else if (mes == 11) {
            System.out.println("NOVERMBRO");
        } else if (mes == 12) {
            System.out.println("DEZEMBRO");
        } // else  System.out.println("");
    }
    private static void ifMenor() {
        double salarioMensal = 10000.00;
        double salarioMinimo = 3000.00;

        int quantidadeDependentes = 3;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < salarioMinimo;
        boolean muitosDependetes = quantidadeDependentes > mediaDependentes;

        boolean receberAuxilio = (salarioBaixo) && (muitosDependetes);

        /* if (receberAuxilio) {
            System.out.println("Deve receber auxilio.");
        } else {
            System.out.println("Não recebe auxilio");
        } */
    }

    private static void switchFerias() {
        String mes = "junho";
        switch (mes) {
            case "junho", "dezembro", "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Trabalho");
        }
    }
    private static void switchSemana() {

        String dia = "Terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
    }
    private static void switchNumero() {

        int numero = 3;
        switch (numero) {
            case 1, 2, 3:
                System.out.println("CERTO");
                break;
            case 4, 5:
                System.out.println("ERRADO");
                break;
            case 6:
                System.out.println("TALVEZ");
                break;
            default:
                System.out.println("OPÇÃO INVALIDA");
                break;
        }

    }
}
