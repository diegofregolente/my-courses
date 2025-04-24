import java.util.Locale;
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int y = 32;
        double x = 10.35784;

        System.out.println("Olá Mundo!");
        System.out.println("Bom dia.");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.3f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.1f reais%n", nome, idade, renda);


    }

}