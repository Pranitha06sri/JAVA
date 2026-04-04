package src.com.bank.main;

import src.com.bank.model.*;
import src.com.bank.service.bank;

public class Main {
    public static void main(String[] args) {

        bank bank = new bank();

        account a1 = new savingsaccount(1, "ab", 5000);
        account a2 = new currentaccount(2, "cd", 3000);

        bank.addAccount(a1);
        bank.addAccount(a2);

        bank.deposit(1, 2000);
        bank.withdraw(1, 3000);

        ((savingsaccount)a1).addInterest();

        a1.display();
        a2.display();
    }
}