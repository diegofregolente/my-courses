package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Order order = new Order(1, LocalDate.now(), OrderStatus.SHIPPED);
        System.out.println(order.toString());

        System.out.println("Enter Status: ");
        String status = scanner.next();
        OrderStatus os2 = OrderStatus.valueOf(status);
        System.out.println(os2);

    }
}
