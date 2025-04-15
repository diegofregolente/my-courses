public class Operadores {

    public static void main(String[] args) {

        String test;

        test = "1" + 1 + 1 + 1;
        System.out.println(test);
        test = 1 + 1 + 1 + "1";
        System.out.println(test);
        test = "1" + (1 + 1 + 1);
        System.out.println(test);
        test = 1 + 1 + 1 + "1";
        System.out.println(test);

    }
}
