import java.util.Locale;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = sc.nextInt();
        int c = 1;

        while (c <= 10) {
            System.out.print(c + " ");
            c += 1;
        }
    }
}
