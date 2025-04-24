package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos linhas e colunas: ");
        int n = scanner.nextInt();
        int [][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Digite o valor da coluna %d linha %d: ", i+1, j+1);
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        int negativesNumber = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) negativesNumber++;
            }
        System.out.println("How much negatives numbers are in Matrix: " + negativesNumber);
        System.out.println(mat.length); // qtd row
        System.out.println(mat[1].length); // qtd column
        scanner.close();
    }
}
