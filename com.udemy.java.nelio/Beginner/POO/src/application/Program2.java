package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product prod = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        prod.name = sc.nextLine();
        System.out.print("Price: ");
        prod.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        prod.quantity = sc.nextInt();

        double total = prod.TotalValueInStock();

        System.out.println(prod);

        System.out.print("Enter the number of products to be added in stock: ");
        int add = sc.nextInt();
        prod.AddProducts(add);
        System.out.println(prod);

        System.out.print("Enter the number of products to be removed in stock: ");
        int remove = sc.nextInt();
        prod.RemoveProduct(remove);
        System.out.println(prod);

        sc.close();
    }
}
