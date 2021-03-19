package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private final List<Client> clientList = new ArrayList<>();
    private final List<BankBranch> bankBranch = new ArrayList<>();
    private final BankBranch mainBankBranch;

    public Bank(final String name, final BankBranch mainBankBranch) {
        this.name = name;
        this.mainBankBranch = mainBankBranch;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public List<BankBranch> getBankBranch() {
        return bankBranch;
    }

    public String getName() {
        return name;
    }

    public BankBranch getMainBankBranch() {
        return mainBankBranch;
    }
}
