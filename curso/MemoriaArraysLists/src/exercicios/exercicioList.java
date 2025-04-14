package exercicios;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicioList {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listOfEmployee = new ArrayList<>();

        System.out.println("How many employees will be registered: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d: \n", i + 1);
            System.out.println("ID: ");
            Integer id = sc.nextInt();
            System.out.println("NAME: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("SALARY: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            listOfEmployee.add(emp);
        }
/*
        System.out.println(listOfEmployee.get(0));
    }
}
*/
        System.out.println("Enter the employee id that will have salary increase:");
        int idSalary = sc.nextInt();
        Integer pos = position(listOfEmployee, idSalary);
        if (pos == null) {
            System.out.println("THIS ID DOES NOT EXIST!");
        } else {
            System.out.println("Enter the percentagem: ");
            double percent = sc.nextDouble();
            listOfEmployee.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of Employee:");
        for (Employee emp: listOfEmployee) {
            System.out.println(emp);
        }
        sc.close();

    }
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
