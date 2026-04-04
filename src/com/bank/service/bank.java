package src.com.bank.service;

import src.com.bank.model.*;
import java.util.*;

public class bank {
    List<account> accounts = new ArrayList<>();

    public void addAccount(account a) {
        accounts.add(a);
    }

    public account find(int id) {
        for (account a : accounts) {
            if (a.getAccountNumber() == id) return a;
        }
        return null;
    }

    public void deposit(int id, double amt) {
        account a = find(id);
        if (a != null) a.deposit(amt);
    }

    public void withdraw(int id, double amt) {
        account a = find(id);
        if (a != null) a.withdraw(amt);
    }
}