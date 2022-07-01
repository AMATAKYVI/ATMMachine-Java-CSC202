import java.util.*;

public class ATM {
    // data fields
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    // methods
    public ATM() {
        id = 0;
        balance = 0;
        annualInterestRate = 0.0;
    }

    public ATM(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // id
    public int get_id() {
        return id;
    }

    public void set_id(int id) {
        this.id = id;
    }

    // balance
    public double get_balance() {
        return balance;
    }

    public void set_balance(double balance) {
        this.balance = balance;
    }

    // annualInterestRate
    public double get_annualInterestRate() {
        return annualInterestRate;
    }

    public void set_annualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // dateCreated
    public Date get_dateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }
}
