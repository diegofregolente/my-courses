package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario;
        funcionario = new Employee();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println("Employee: " + funcionario.name + ", $ " + funcionario.NetSalary());

        System.out.println("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        System.out.println("Update data: " + funcionario.name + ", $ " + funcionario.IncreaseSalary(percentage));

        sc.close();

    }
}
