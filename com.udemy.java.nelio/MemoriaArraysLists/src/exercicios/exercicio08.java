package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, somaPares = 0, nPares = 0;
        double mediaPares;

        System.out.print("Quantos elementos vai ter o vetor: ");
        n = sc.nextInt();

        int[] pares = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            pares[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (pares[i] % 2 == 0) {
                somaPares += pares[i];
                nPares++;
            }
        }

        if (nPares == 0) {
            System.out.println("NENHUM PAR");
        }
        else {
            mediaPares = (double) somaPares / nPares;

            System.out.println("Media dos pares: " + mediaPares);
        }

        sc.close();
    }
}
