public class BoletimEstudantil {
    public static void main(String[] args) {

        int medialFinal = 7;

        if (medialFinal < 6) {
            System.out.println("REPROVADO");
        }
        else if (medialFinal == 6) {
            System.out.println("RECUPERAÇÃO");
        }
        else {
            System.out.println("APROVADO");
        }

    }
}
