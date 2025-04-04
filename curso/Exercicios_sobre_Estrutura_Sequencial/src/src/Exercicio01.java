package src;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;
        System.out.println("Digite o numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Digite o numero 2: ");
        num2 = sc.nextInt();
        soma = num1 + num2;
        System.out.println("A soma dos valores é: " + soma );

        sc.close();
    }
}
