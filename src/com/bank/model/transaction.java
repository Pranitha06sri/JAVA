package src.com.bank.model;

public class transaction {
    String type;
    double amount;

    public transaction(String t, double a) {
        type = t;
        amount = a;
    }

    public void show() {
        System.out.println(type + " ₹" + amount);
    }
}