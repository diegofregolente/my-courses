package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1001, "Diego", 1000D);
        Account y = new SavingsAccount (1002, "Amanda", 1000D, 0.03);

    }
}
