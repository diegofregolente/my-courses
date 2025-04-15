import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartTV smartTV = new SmartTV();

        System.out.println(smartTV.ligada);
        System.out.println(smartTV.canal);
        System.out.println(smartTV.volume);

        smartTV.ligar();

        System.out.println(smartTV.ligada);

        smartTV.desligar();

        System.out.println(smartTV.ligada);

        for (int i = 0; i < 20; i++) {
            smartTV.aumentarVolume();
        }

        System.out.println(smartTV.volume);

        System.out.println("Digite o canal desejado: ");
        int novoCanal = sc.nextInt();
        smartTV.mudarCanal(novoCanal);
        System.out.println(smartTV.canal);

    }
}
