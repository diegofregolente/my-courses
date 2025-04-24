package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Inform lines: ");
        int lines = scanner.nextInt();

        System.out.println("Inform columns");
        int columns = scanner.nextInt();

        int[][] mat = new int[lines][columns];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Inform value: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("What number should i localize: ");
        int localize = scanner.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == localize) {
                    System.out.println("Position " + i + ", " + j + ": ");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
            scanner.close();
        }
    }
}
