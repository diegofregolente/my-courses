import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha correta: ");
        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Senha inválida");
            System.out.print("Digite a senha correta: ");
            password = sc.nextInt();
        }

        System.out.print("Acesso permitido");

        sc.close();
    }
}
