package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Account> contas = new ArrayList<>();

        contas.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        contas.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
        contas.add(new SavingsAccount(1003, "Bob", 300.00, 0.02));
        contas.add(new BusinessAccount(1004, "Ana", 500.00, 500.00));

        double sum  = 0;

        for (Account acc : contas) {
            sum += acc.getBalance();
        }

        System.out.println("Total das contas é: " + String.format("%.2f", sum));

        for (Account acc : contas) {
            acc.deposit(10.0);
        }

        for (Account acc : contas) {
            System.out.printf("Valor atualizado para contas %d: %.2f %n", acc.getNumber(), acc.getBalance());
        }
    }
}
