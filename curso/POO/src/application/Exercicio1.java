package application;

import entities.Rectangle;

import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Rectangle rect = new Rectangle();

        rect.height = 4.00;
        rect.width = 3.00;

        System.out.println(rect.width);
        System.out.println(rect.height);

        System.out.println("AREA: " +  String.format("%.2f", rect.Area()));
        System.out.println("PERIMETRO: " + String.format("%.2f", rect.Perimetro()));
        System.out.println("DIAGONAL: " + String.format("%.2f", rect.Diagonal()));

    }
}
