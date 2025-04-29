package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account (1001, "Diego", 0.0);

        BusinessAccount bAcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bAcc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount bAcc1 = (BusinessAccount) acc2;
        bAcc1.loan(100);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount bAcc5 = (BusinessAccount) acc3;
            bAcc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount bAcc5 = (SavingsAccount) acc3;
            bAcc5.updateBalance();
            System.out.println("Update!");
        }

    }
}
