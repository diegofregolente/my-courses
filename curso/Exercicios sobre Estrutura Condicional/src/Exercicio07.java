import java.util.Locale;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) { // ambos zero inicio/origem
            System.out.println("Origem");
        }
        else if (x == 0.0) { // se x = 0 e y != 0 (EIXO Y)
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) { // se y = 0 e x != 0 (EIXO X)
            System.out.println("Eixo X");
        }
        else if (x > 0.00 && y > 0.00) { // ambos maiores que zero Q1
            System.out.println("Q1");
        }
        else if (x < 0.00 && y < 0.00) { // ambos menores que zero Q3
            System.out.println("Q3");
        }
        else if (x < 0.00 && y > 0.00){ // se x menor que 0 e y maior que 0 Q2
            System.out.println("Q2");
        }
        else if (x > 0.00 && y < 0.00) { // se x maior que zero e y menor que zero Q4
            System.out.println("Q4");
        }
        sc.close();
     }
}
