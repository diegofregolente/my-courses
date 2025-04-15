package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posMaior = 0;
        double maior;

        System.out.print("Quantos numeros vai digitar: ");
        n = sc.nextInt();

        double[] posicoes = new double[n];

        for (int i=0; i < n; i++) {
            System.out.print("Digite um numero: ");
            posicoes[i] = sc.nextDouble();
        }

        maior = posicoes[0];

        for (int i = 0; i < n; i++) {
            if (posicoes[i] > maior) {
                maior = posicoes[i];
                posMaior = i;
            }
        }

        System.out.printf("Maior valor = %.1f \n", maior);
        System.out.printf("A posição do maior valor é: %d \n", posMaior);

        sc.close();

    }
}
