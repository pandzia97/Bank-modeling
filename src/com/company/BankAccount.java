package com.company;

public class BankAccount {
    private final int number;
    private double balance;
    private final String currency;

    public BankAccount(final int number, final double balance, final String currency) {
        this.number = number;
        this.balance = balance;
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(final char balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getCurrency() {
        return currency;
    }
}
