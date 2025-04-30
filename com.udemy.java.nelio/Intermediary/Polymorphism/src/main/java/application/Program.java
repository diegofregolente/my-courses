package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1001, "Diego", 1000D);
        Account y = new SavingsAccount (1002, "Amanda", 1000D, 0.03);

        x.withDraw(50.0);
        y.withDraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
