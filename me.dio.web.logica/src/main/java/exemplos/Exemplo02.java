package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b3 = true;
        boolean b4 = false;
        boolean b2 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b1 || b3 " + (b1 || b3));
        System.out.println("b1 || b4 " + (b1 || b4));
        System.out.println("b4 || b2 " + (b4 || b2));

        System.out.println("b1 ^ b2 " + (b1 ^ b2));
        System.out.println("b1 ^ b3 " + (b1 ^ b3));

        System.out.println(!b2);
        System.out.println(!b1);

        int i1 = 10, i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + 12) < (f2 - f1)) && true) " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("((i1 + 12) < (f2 - f1)) && true) " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 4000.00d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes > mediaDependentes;

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.println("Vai receber auxilio? " + recebeAuxilio);

    }
}
