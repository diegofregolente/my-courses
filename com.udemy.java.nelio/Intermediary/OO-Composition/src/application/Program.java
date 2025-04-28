package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(scanner.next(), dtf);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());

        Order order = new Order(LocalDate.now(), status, client);

        System.out.println("How many items to this order? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data: \n", i+1);
            System.out.print("Product Name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product Price: ");
            Double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = scanner.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice, product);
            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);
    }
}
