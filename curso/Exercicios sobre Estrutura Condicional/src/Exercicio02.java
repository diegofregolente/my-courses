import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Digite um numero: ");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.printf("O %d é PAR", a);
        }
        else if (a % 2 == 1) {
            System.out.printf("O %d é IMPAR", a);
        }
        sc.close();

    }
}
