package com.company;

import java.util.ArrayList;
import java.util.List;

public class BankBranch {
    private final List<Employee> employees = new ArrayList<>();
    private final Address address;

    public List<Employee> getEmployees() {
        return employees;
    }

    public BankBranch(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
