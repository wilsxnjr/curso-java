package entities;

public class Account {

    private String holder;
    private int number;
    private double balance;

    public Account(String holder, int number, double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public String toString() {
        return "Account: "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", balance);
    }

}