import java.util.Locale;
import java.util.Scanner;

public class For {
    public static void main(String[] arg) {
        // set imports
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //pratica
        System.out.print("Quantas vezes quer somar?: ");
        int num = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Informe o " + i + " valor: ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("A soma de todos os valores foi: " + soma);

        //fecha import
        sc.close();
    }
}
