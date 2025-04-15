import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();
        if (valor >= 0 && valor <= 25) {
            System.out.printf("O valor %.2f está entre o intervalo {0, 25}", valor);
        }
        else if (valor > 25 && valor <= 50) {
            System.out.printf("O valor %.2f está entre o intervalo {25, 50}", valor);
        }
        else if (valor > 50 && valor <= 75) {
            System.out.printf("O valor %.2f está entre o intervalo {50, 75}", valor);
        }
        else if (valor > 75 && valor <= 100) {
            System.out.printf("O valor %.2f está entre o intervalo {25, 50}", valor);
        }
        else System.out.printf("Fora de intervalo. Valor: %.2f", valor);

        sc.close();
    }
}
