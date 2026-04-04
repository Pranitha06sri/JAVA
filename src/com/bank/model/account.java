package src.com.bank.model;

public abstract class account {
    private int accountNumber;
    private String accountHolder;
    protected double balance;

    public account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit!");
            return;
        }
        balance += amount;
        System.out.println("Deposit: ₹" + amount);
    }

    public abstract void withdraw(double amount);

    public void display() {
        System.out.println(accountNumber + " - " + accountHolder + " - ₹" + balance);
    }
}