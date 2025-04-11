package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought: ");
        double convert = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", Calculator.accuracyConverter(dolar, convert));
    }
}
