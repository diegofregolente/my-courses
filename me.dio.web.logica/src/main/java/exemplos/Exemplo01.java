package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {

        int i1 = 10, i2 = 20;
        float f1 = 4.5f, f2 = 3.5f;
        double d1 = 59.6;
        char c1 = 'x', c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Ciclano";
        String s3 =  "Siltrano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1 != i2: " + (i1 != i2));
        System.out.println("i1 > i2: " + (i1 > i2));
        System.out.println("i1 <= i2: " + (i1 <= i2));

        System.out.println();
        System.out.println("f1 == f2: " + (f1 == f2));
        System.out.println("f1 != f2: " + (f1 != f2));
        System.out.println("f1 > f2: " + (f1 > f2));
        System.out.println("f1 <= f2: " + (f1 <= f2));

        System.out.println();
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 != c2: " + (c1 != c2));
        System.out.println("c1 > c2: " + (c1 > c2));
        System.out.println("c1 <= c2: " + (c1 <= c2));

        System.out.println();
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s2: " + (s1 != s2));
        System.out.println("s1 == s3: " + (s1 == s3));

        System.out.println();
        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1 != b2: " + (b1 != b2));

        System.out.println();
        System.out.println("l1 == h1: " + (l1 == h1));
        System.out.println("l1 == h1: " + (l2 == y1));
        System.out.println("l1 == h1: " + (l2 != y1));
    }
}
