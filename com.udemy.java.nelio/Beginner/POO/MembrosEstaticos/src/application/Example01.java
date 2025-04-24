package application;

import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");

        double radius = sc.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("PI Value: %.5f %n", Calculator.PI);

        sc.close();

    }

}
