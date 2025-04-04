public class Bhaskara {
    public static void main(String[] args) {

        int a, b, c;
        double delta, x1, x2;

        a = 1;
        b = 5;
        c = 2;

        delta = Math.pow(b, 2.0) - 4 * a * c;
        x1 = (-b +Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b -Math.sqrt(delta)) / (2.0 * a);

        System.out.printf("Delta = %f, x1 = %.2f, x2 = %.2f %n", delta, x1, x2);
        System.out.println(x1);
        System.out.println(x2);
    }
}
