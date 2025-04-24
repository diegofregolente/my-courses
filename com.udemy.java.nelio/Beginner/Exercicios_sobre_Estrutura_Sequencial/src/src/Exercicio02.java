package src;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, pi, area;
        pi = 3.14159;
        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.printf("A area do raio é: %.4f %n", area);

        sc.close();
    }
}
