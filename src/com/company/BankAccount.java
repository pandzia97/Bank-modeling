package com.company;

public class BankAccount {
    private int number;
    private double balance;
    private String currency;

    public BankAccount(int number, double balance, String currency) {
        this.number = number;
        this.balance = balance;
        this.currency = currency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(char balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
