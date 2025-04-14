package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media;

        System.out.println("Quantos alunos tem na sala: ");
        n = sc.nextInt();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i=0; i < n; i++) {
            System.out.printf("Nome do aluno %d: ", i+1);
            nome[i] = sc.next();
            System.out.println("Nota 1: ");
            nota1[i] = sc.nextDouble();
            System.out.println("Nota 2: ");
            nota2[i] = sc.nextDouble();
        }

        System.out.println("ALUNO APROVADO: ");

        for (int i=0; i < n; i++){
            media = (nota1[i] + nota2[i]) / 2.0;
            if (media > 6) {
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
