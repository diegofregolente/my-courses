package view;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o departamento: ");
        String departament = scanner.next();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = scanner.next();
        System.out.print("Level: ");
        String workerLevel = scanner.next();
        System.out.print("Base Salary: ");
        double workerSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departament));

        System.out.print("How many contracts to this worker: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + (1+i) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            double contractValuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int contractDurations = scanner.nextInt();

            HourContract contract = new HourContract(contractDate, contractValuePerHour, contractDurations);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateToCalculate = scanner.next();
        int month = Integer.parseInt(dateToCalculate.substring(0, 2));
        int year = Integer.parseInt(dateToCalculate.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartment().getName());
        System.out.println("New Salary " + dateToCalculate + ": " + String.format("%.2f", worker.income(year, month)));

        scanner.close();
    }
}
