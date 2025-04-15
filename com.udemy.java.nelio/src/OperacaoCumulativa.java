import java.util.Locale;
import java.util.Scanner;

public class OperacaoCumulativa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos minutos foram utilizados? ");
        int minutos = sc.nextInt();
        double conta = 50.00;

        if (minutos > 100.00) {
            conta += (minutos - 100) * 2.00;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }
}


// += a = a+b
// a