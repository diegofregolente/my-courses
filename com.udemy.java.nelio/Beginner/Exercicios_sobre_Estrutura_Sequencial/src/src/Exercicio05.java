package src;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String codigo1, codigo2;
        int quantidade1, quantidade2;
        double valor1, valor2, total;

        System.out.print("Digite o codigo do primeiro produto:");
        codigo1 = sc.next();
        System.out.print("Digite a quantidade do primeiro produto:");
        quantidade1 = sc.nextInt();
        System.out.print("Digite o valor do primeiro produto:");
        valor1 = sc.nextDouble();

        System.out.print("Digite o codigo do segundo produto:");
        codigo2 = sc.next();
        System.out.print("Digite a quantidade do segundo produto:");
        quantidade2 = sc.nextInt();
        System.out.print("Digite o valor do segundo produto:");
        valor2 = sc.nextDouble();

        total = (valor1 * quantidade1) + (valor2 * quantidade2);

        System.out.printf("O total a pagar é: R$ %.2f", total);

        sc.close();
    }
}
