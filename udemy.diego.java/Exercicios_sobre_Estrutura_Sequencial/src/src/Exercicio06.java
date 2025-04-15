package src;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

     double a, b, c;
     double trianguloR, circuloR, trapezioR, quadradoR, retanguloR;
     double pi = 3.14159;

     System.out.print("Digite o valor de A: ");
     a = sc.nextDouble();
     System.out.print("Digite o valor de B: ");
     b = sc.nextDouble();
     System.out.print("Digite o valor de C: ");
     c = sc.nextDouble();

     trianguloR = a * c / 2.0;
     circuloR = pi * Math.pow(c, 2);
     trapezioR = (a + b) / 2.0 * c;
     quadradoR = Math.pow(b, 2);
     retanguloR = a * b;

     System.out.printf("TRIANGULO: %.3f %n", trianguloR);
     System.out.printf("CIRCULO: %.3f %n", circuloR);
     System.out.printf("TRAPEZIO: %.3f %n", trapezioR);
     System.out.printf("QUADRADO: %.3f %n", quadradoR);
     System.out.printf("RETANGULO: %.3f %n", retanguloR);

     sc.close();

    }
}
