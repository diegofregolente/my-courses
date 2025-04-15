import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Leia o salario do colaborador: ");
        double salario = sc.nextDouble();
        double imposto;
        if (salario > 0.00 && salario <= 2000.00) {
            imposto = salario * 0;
            System.out.printf("O salario de %.2f é isento de imposto %n", salario);
        }
        else if (salario <= 3000.00 ) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("O salario de %.2f deverá pagar %.2f de imposto %n", salario, imposto);
        }
        else if (salario <= 4500.00 ) {
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("O salario de %.2f deverá pagar %.2f de imposto %n", salario, imposto);
        }
        else if (salario > 4500.00 ) {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("O salario de %.2f deverá pagar %.2f de imposto %n", salario, imposto);
        }

        sc.close();
    }
}
