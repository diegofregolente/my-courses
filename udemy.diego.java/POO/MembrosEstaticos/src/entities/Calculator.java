package entities;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3;
    }

    public static double accuracyConverter(double dolar, double convert) {
        double tax = (dolar * convert) * 0.06;
        return dolar * convert + tax;
    }
}
