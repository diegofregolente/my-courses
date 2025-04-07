import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num1, num2;

        System.out.print("Digite o primerio numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
        sc.close();

    }
}
