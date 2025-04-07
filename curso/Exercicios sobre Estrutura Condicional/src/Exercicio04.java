import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int horaI, horaF;
        System.out.print("Que horas o jogo começou: ");
        horaI = sc.nextInt();
        System.out.print("Digite a hora que acabou o jogo: ");
        horaF = sc.nextInt();

        int jogo;
        if (horaI < horaF) {
            jogo = horaF - horaI;
        }
        else {
            jogo = 24 - horaI + horaF;
        }
        System.out.printf("O jogo durou %d horas", jogo);
        sc.close();

    }
}
