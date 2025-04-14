package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos elementos vai ter o vetor: ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Digite o valor de %d posicao: ", i);
            vetor[i] = sc.nextDouble();
        }
        soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        System.out.println("MEDIA DO VETOR: " + media);

        for (int i = 0; i < n; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
