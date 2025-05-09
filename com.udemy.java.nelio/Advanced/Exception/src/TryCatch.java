import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        method2();

        System.out.println("End of Program");
    }

    public static void method1() {
        System.out.println("Method 1 Start");
        method2();
        System.out.println("Method 1 End");
    }

    public static void method2() {

        System.out.println("Method 2 start");

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();
        }
        catch (InputMismatchException m) {
            System.out.println("Invalid Input");
        }
        sc.close();

    }
}
