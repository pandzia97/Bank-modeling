package com.company;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final int id;
    private final String surname;
    private final String name;
    private final int pesel;
    private final List<BankAccount> accounts = new ArrayList<>();

    public Client(final int id, final String surname, final String name, final int pesel) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.pesel = pesel;
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

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}

