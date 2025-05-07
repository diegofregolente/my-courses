package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        for (int i = 1; i<=n; i++) {
            System.out.println("TAX PAYER #" + i + " DATA:");
            System.out.print("Individual or company (i/c): ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            Double anual = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Individual x = new Individual(name, anual, healthExpenditures);
                list.add(x);
            }
            else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployess = sc.nextInt();
                Company x = new Company(name, anual, numberOfEmployess);
                list.add(x);
            }
        }

        System.out.println();
        System.out.println("TAXES PAIDS: ");

        Double sum = 0.0;
        for (TaxPayer payer : list) {
            System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
            sum += payer.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));

        sc.close();
    }
}
