import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de repetições: ");
        int r = sc.nextInt();

        for (int i=0; i < r; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a*2.0 + b*3.0 + c*5.0) / 10;

            System.out.printf("%.1f %n", media);
        }

        sc.close();
    }
}
