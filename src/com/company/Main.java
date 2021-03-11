package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Bank> banks = new ArrayList<>();
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Create new bank");
            System.out.println("2. List banks");
            System.out.println("3. Select bank");
            System.out.println("4. Delete bank");
            System.out.println("0. Exit");

            final Scanner scanner = new Scanner(System.in);

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.println("Create new bank");
                    String nameBank = scanner.nextLine();
                    System.out.println("Enter the address");
                    System.out.println("City:");
                    String cityNewBank = scanner.next();
                    System.out.println("Zip code:");
                    int zipCodeNewBank = scanner.nextInt();
                    System.out.println("Street:");
                    String streetNewBank = scanner.nextLine();
                    System.out.println("House number:");
                    int houseNumberNewBank = scanner.nextInt();
                    System.out.println("Apartment number:");
                    int apartmentNumberNewBank = scanner.nextInt();
                    Address address = new Address(cityNewBank, zipCodeNewBank, streetNewBank, houseNumberNewBank, apartmentNumberNewBank);
                    BankBranch bankBranch = new BankBranch(address);
                    Bank bank = new Bank(nameBank, bankBranch);

                    banks.add(bank);
                    break;
                case 2:
                    System.out.println("List banks");
                    for (int i = 0; i < banks.size(); i++) {
                        System.out.println(i);
                        System.out.println(banks.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Select bank");
                    int select = scanner.nextInt();
                    Bank selectBank = banks.get(select);
                    break;
                case 4:
                    System.out.println("Delete bank");
                    int remove = scanner.nextInt();
                    if (remove < banks.size()) {
                        banks.remove(remove);
                    } else {
                        System.out.println("Wrong id");
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
