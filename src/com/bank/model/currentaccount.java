package src.com.bank.model;

public class currentaccount extends account {
    private double limit = 2000;

    public currentaccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    public void withdraw(double amount) {
        if (amount > balance + limit) {
            System.out.println("Overdraft exceeded!");
        } else {
            balance -= amount;
            System.out.println("Withdraw: ₹" + amount);
        }
    }
}