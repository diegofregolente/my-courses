import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Leia um valor: ");
        int n = sc.nextInt();
        int fatorial = n;
        for (int i = 1; i < n; i++) {
            fatorial *= (n-i);
        }
        if (n == 0) {
            fatorial = 1;
        }
        System.out.println("Fatorial: " + fatorial);
        sc.close();
    }
}
