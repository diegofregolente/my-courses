package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdHomens = 0, qtdMulheres = 0;
        double menorAltura = 0, maiorAltura = 0, alturaFemMedia = 0, alturaFemTotal = 0;

        System.out.println("Quantas pessoas vao ser inseridas: ");
        n = sc.nextInt();

        double[] altura = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %d° pessoa: ", i+1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %d° pessoa:", i+1);
            generos[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                    menorAltura = altura[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (generos[i] == 'M' || generos[i] == 'm') {
                qtdHomens++;
            }
            else if (generos[i] == 'F' || generos[i] == 'f') {
                qtdMulheres++;
                alturaFemTotal = alturaFemTotal + altura[i];
            }
        }

        alturaFemMedia = alturaFemTotal / qtdMulheres;

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media das alturas das mulhers: %.2f \n", alturaFemMedia);
        System.out.println("Numero de homens: " + qtdHomens);

        sc.close();
    }
}
