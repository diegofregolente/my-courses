import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;
        int resp = 0;

        System.out.println("-------------------------");
        System.out.println("POSTO  GASOLINA  DEV");
        System.out.println("-------------------------");
        System.out.println("1 ALCOOL");
        System.out.println("2 GASOLINA");
        System.out.println("3 DIESEL");
        System.out.println("4 SAIR");
        while (resp != 4) {
            if (resp == 1) {
                alcool += 1;
            }
            else if (resp == 2) {
                gasolina += 1;
            }
            else if (resp == 3) {
                diesel += 1;
            }
            System.out.print("Qual combustivel você deseja? ");
            resp = sc.nextInt();
        }
        System.out.printf("ALCOOL: %d %n", alcool);
        System.out.printf("GASOLINA: %d %n", gasolina);
        System.out.printf("DIESEL: %d %n", diesel);

        sc.close();
    }
}
