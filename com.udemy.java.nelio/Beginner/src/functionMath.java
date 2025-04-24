import java.util.Locale;
import java.util.Scanner;

public class functionMath {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double numero, raiz, elevado, absoluto;
        System.out.print("Digite um número: ");
        numero = sc.nextDouble();
        raiz = Math.sqrt(numero);
        elevado = Math.pow(numero, 3);
        absoluto = Math.abs(numero);
        System.out.printf("Raiz quadradada de %.0f = %.2f %n", numero, raiz);
        System.out.printf("%.0f Elevado a tripla = %.2f %n", numero, elevado);
        System.out.printf("O valor absoluto de %.0f é: %.2f %n ", numero, absoluto);

    }
}
