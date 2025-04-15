public class Ternaria {
    public static void main(String[] args) {

        double preco = 34.50;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        double price = 400.00;
        double discount = (price > 200) ? price * 0.2 : 0;

        System.out.println("O desconto é " + desconto);
        System.out.println(discount);
    }
}
