package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0, media = 0;

        System.out.print("Quantos números você vai digitar: ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        System.out.print("VALORES = ");

        for (int i = 0; i<n; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.1f", soma);
        System.out.printf("\nMEDIA = %.1f", media);



        sc.close();
    }
}
