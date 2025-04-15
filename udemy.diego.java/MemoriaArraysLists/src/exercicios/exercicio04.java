package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdPares = 0;

        System.out.print("Quantos números você vai digitar: ");
        n = sc.nextInt();

        int[] pares = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite %d° valor: ", i);
            pares[i] = sc.nextInt();
        }

        System.out.println("Numeros Pares:");

        for (int i = 0; i < n; i++) {
            if (pares[i] % 2 == 0) {
                System.out.printf("%d ", pares[i]);
            }
            qtdPares++;
        }

        System.out.printf("\nQUANTIDADE DE PARES = %d\n", qtdPares);

        sc.close();

    }
}
