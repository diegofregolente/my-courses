import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor representando o dia da semana: ");
        int num = sc.nextInt();
        String dia;

        switch (num) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default: // Caso o número não esteja entre as opções acima ele sempre retorna o default. seria o senão
                dia = "Valor inválido, favor utilize 1 a 7.";
                break;
        }
        System.out.println("Dia da semana é " + dia);
        sc.close();
    }
}
