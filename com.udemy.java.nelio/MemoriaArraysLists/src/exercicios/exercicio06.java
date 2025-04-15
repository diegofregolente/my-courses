package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos valores vai ter cada vetor: ");
        n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores de vetor A: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("\nDigite o valor de posicao %d: ",i);
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores de vetor B: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o valor de posicao %d: ", i);
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("VETOR SOMADO A + B:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d \n", c[i]);
        }

        sc.close();

    }
}
