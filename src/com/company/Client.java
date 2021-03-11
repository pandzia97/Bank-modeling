package com.company;

public class Client {
    private int id;
    private String surname;
    private String name;
    private int pesel;
    private BankAccount account;

    public Client(int id, String surname, String name, int pesel, BankAccount account) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.pesel = pesel;
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getPesel() {
        return pesel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
}

