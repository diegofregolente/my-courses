package application;

import entities.Employee;
import entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much employees will be registered? ");
        int numberOfEmployees = scanner.nextInt();

        ArrayList <Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter information of #" + (i+1) + " employee: ");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Hours of Work: ");
            Integer hours = scanner.nextInt();
            System.out.print("Value Per Hour: ");
            Double valuePerHour = scanner.nextDouble();
            System.out.print("Is Outsourced Employee? [S/N]: ");
            char isOutsorced = scanner.next().charAt(0);
            if (isOutsorced == 'S') {
                System.out.print("Additional charge: ");
                Double addCharge = scanner.nextDouble();
                OutsorcedEmployee outsorcedEmployee = new OutsorcedEmployee(name, hours, valuePerHour, addCharge);
                employees.add(outsorcedEmployee);
            }
            else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        scanner.close();

    }
}
