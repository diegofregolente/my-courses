import java.util.Locale;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.printf("Você digitou: %s %n", nome);

        int x;
        System.out.print("Digite um número inteiro: ");
        x = sc.nextInt();
        System.out.printf("Você digitou: %d %n", x);

        double y;
        System.out.print("Digite um numero real: ");
        y = sc.nextDouble();
        System.out.printf("Você digitou: %.1f %n", y);

        char sexo;
        System.out.print("Digite seu sexo: ");
        sexo = sc.next().charAt(0);
        System.out.printf("Seu sexo é: %c %n", sexo);

        String frase;
        int numero;
        double numDecimal;

        frase = sc.next();
        numero = sc.nextInt();
        numDecimal = sc.nextDouble();

        System.out.printf("Dados inseridos: %s %d %.2f", frase, numero, numDecimal);

        int numeroX;
        String s1;
        String s2;
        String s3;
        numeroX = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.printf("%d %s %s %s", numeroX, s1, s2, s3);
        sc.close();

    }
}
