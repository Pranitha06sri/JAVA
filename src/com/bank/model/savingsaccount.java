package src.com.bank.model;

public class savingsaccount extends account {
    private double rate = 0.04;

    public savingsaccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdraw: ₹" + amount);
        }
    }

    public void addInterest() {
        balance += balance * rate;
        System.out.println("Interest added!");
    }
}