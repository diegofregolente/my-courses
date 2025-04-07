import java.util.Locale;
import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int soma = 0;
        while (numero != 0) {
            soma += numero;
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        }
        System.out.println("A soma é " + soma);
        sc.close();
    }
}
