package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Address createAddress(final Scanner scanner) {
        System.out.println("Enter the address");
        System.out.println("City:");
        final String cityNewBank = scanner.next();
        System.out.println("Zip code:");
        final int zipCodeNewBank = scanner.nextInt();
        System.out.println("Street:");
        final String streetNewBank = scanner.nextLine();
        System.out.println("House number:");
        final int houseNumberNewBank = scanner.nextInt();
        System.out.println("Apartment number:");
        final int apartmentNumberNewBank = scanner.nextInt();
        return new Address(cityNewBank, zipCodeNewBank, streetNewBank, houseNumberNewBank, apartmentNumberNewBank);
    }

    public static void createBank(final Scanner scanner, final List<Bank> banks) {
        System.out.println("Create new bank");
        final String nameBank = scanner.nextLine();
        createAddress(scanner);
        final BankBranch bankBranch = new BankBranch(createAddress(scanner));
        final Bank bank = new Bank(nameBank, bankBranch);

        banks.add(bank);
    }

    public static void listBank(final List<Bank> banks) {
        System.out.println("List banks");
        for (int i = 0; i < banks.size(); i++) {
            System.out.println(i);
            System.out.println(banks.get(i));
        }
    }

    public static void selectBank(final Scanner scanner, final List<Bank> banks) {
        System.out.println("Select bank");
        final int select = scanner.nextInt();
        final Bank bankSelect = banks.get(select);
        System.out.println(bankSelect);
    }

    public static void deleteBank(final Scanner scanner, final List<Bank> banks) {
        System.out.println("Delete bank");
        final int remove = scanner.nextInt();
        if (remove < banks.size()) {
            banks.remove(remove);
        } else {
            System.out.println("Wrong id");
        }
    }

    public static void main(final String[] args) {

        final List<Bank> banks = new ArrayList<>();
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Create new bank");
            System.out.println("2. List banks");
            System.out.println("3. Select bank");
            System.out.println("4. Delete bank");
            System.out.println("0. Exit");

            final Scanner scanner = new Scanner(System.in);

            final int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    return;
                case 1:
                    createBank(scanner, banks);
                    break;
                case 2:
                    listBank(banks);
                    break;
                case 3:
                    selectBank(scanner, banks);
                    break;
                case 4:
                    deleteBank(scanner, banks);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
