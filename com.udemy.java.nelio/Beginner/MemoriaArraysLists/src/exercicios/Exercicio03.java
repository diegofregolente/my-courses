package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, menores = 0;
        double alturaTotal = 0, alturaMedia, percentalMenores;

        System.out.print("Quantas pessoas serao digitadas: ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %d° pessoa:\n", i);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        /* soma menores e total de alturas */
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                menores++;
            }
            alturaTotal += altura[i];
        }

        /* media de altura e percental de menores */
        alturaMedia = alturaTotal / n;
        percentalMenores = ((double) menores / n) * 100;

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f %% \n", percentalMenores);

        /* se idade menor que 16 mostra nome */
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
