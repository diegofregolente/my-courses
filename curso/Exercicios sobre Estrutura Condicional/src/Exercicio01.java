import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num;
        System.out.println("Digite um numero:");
        num = sc.nextInt();

        if (num >= 0) {
            System.out.printf("O número %d é positivo %n", num);
        }
        else {
            System.out.printf("O número %d é negativo %n", num);
        }

        sc.close();
    }
}
