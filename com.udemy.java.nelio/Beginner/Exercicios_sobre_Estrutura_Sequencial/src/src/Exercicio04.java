package src;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String code;
        double workHour, workedHours, salary;

        System.out.print("Digite o codigo do funcionario:");
        code = sc.next();
        System.out.print("Digite quanto recebe pela hora de trabalho:");
        workHour = sc.nextDouble();
        System.out.print("Digite quantos horas o funcionario trabalhou:");
        workedHours = sc.nextDouble();

        salary = workHour * workedHours;

        System.out.printf("O salario do funcionario é U$: %.2f", salary);

        sc.close();
    }
}
