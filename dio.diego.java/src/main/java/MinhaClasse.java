public class MinhaClasse {

    public static void main(String[] args) {

        String nome = nomeCompleto("Diego", "Fregolente");
        System.out.println(nome);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome;

    }
}
