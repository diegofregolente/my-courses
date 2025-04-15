import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos valores serão inseridos: ");
        int n = sc.nextInt();
        int x = 0, totIn = 0, totOut = 0;


        for (int i = 0; i < n; i++ ) {
            System.out.print("Digite um valor: ");
            x = sc.nextInt();
            if (x>=10 && x <= 20) {
                totIn += 1;
            }
            else totOut += 1;
        }
        System.out.println(totIn + " in");
        System.out.println(totOut + " out");
        sc.close();
    }
}
