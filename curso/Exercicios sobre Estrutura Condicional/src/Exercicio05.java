import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double total;
        System.out.print("Digite o codigo do item do cardapio: ");
        int code = sc.nextInt();
        System.out.print("Digite a quantidade desse item desejada: ");
        int qtd = sc.nextInt();
        if (code == 1) {
            total = 4.00 * qtd;
            System.out.printf("Total: R$ %.2f", total);
        } else if (code == 2) {
            total = 4.50 * qtd;
            System.out.printf("Total: R$ %.2f",  total);
        }
        else if (code == 3) {
            total = 5.00 * qtd;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (code == 4) {
            total = 2.00 * qtd;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (code == 5) {
            total = 1.50 * qtd;
            System.out.printf("Total: R$ %.2f", total);
        }
        else
            System.out.println("Opção Inválida");
        sc.close();
    }
}
