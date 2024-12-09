package se.lexicon;

public class InsufficientFundsException extends Exception{

    private double balance;
    private double amount;

    public InsufficientFundsException(String message, double balance, double amount) {
        super(message);
        this.balance = balance;
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
