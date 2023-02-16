package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public void setHolder(String personName) {
        this.holder = personName;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "Account data{" +
                "Account=" + number +
                ", Holder='" + holder + '\'' +
                ", Balance=" + balance +
                '}';
    }

    public void deposit(double value){
        balance += value;
    }

    public void withdraw(double value){
        balance -= (value + 5);
    }
}
