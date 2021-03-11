package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private final List<Client> clientList = new ArrayList<>();
    private final List<BankBranch> bankBranch = new ArrayList<>();
    private BankBranch mainBankBranch;

    public Bank(String name, BankBranch mainBankBranch) {
        this.name = name;
        this.mainBankBranch = mainBankBranch;
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
