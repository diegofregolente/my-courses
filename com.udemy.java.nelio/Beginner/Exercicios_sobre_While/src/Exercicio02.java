import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 1, y = 1;


        while (x != 0 && y != 0) { // se fosse OU qualquer um que nao fosse zero iria continuar, temos que usar E para que se um dos dois for zero pare o looping
            System.out.print("Valor coordenada X: ");
            x = sc.nextInt();
            System.out.print("Valor coordenada Y: ");
            y = sc.nextInt();
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            }

        }

        sc.close();
    }
}
