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

    public static Bank createBank(final Scanner scanner) {
        System.out.println("Create new bank");
        final String nameBank = scanner.nextLine();
        final BankBranch bankBranch = new BankBranch(createAddress(scanner));
        return new Bank(nameBank, bankBranch);
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
        selectSwitch(scanner, banks.get(select));
    }

    public static boolean deleteBank(final Scanner scanner, final List<Bank> banks) {
        System.out.println("Delete bank");
        final int remove = scanner.nextInt();
        if (remove < 0 || remove >= banks.size()) {
            return false;
        }
        banks.remove(remove);
        return true;
    }

    public static void editBankName(final Scanner scanner, final Bank bank) {
        System.out.println("Edit Bank name");
        final String newBankName = scanner.nextLine();
        bank.setName(newBankName);
    }

    public static void showClients(final Bank bank) {
        System.out.println("Show clients");
        final List<Client> clients = bank.getClientList();
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(i);
            System.out.println(clients.get(i));
        }
    }

    public static void selectClient(final Scanner scanner, final List<Client> clients) {
        System.out.println("Select client");
        final int selectIdClient = scanner.nextInt();
        final Client clientSelect = clients.get(selectIdClient);
        System.out.println(clientSelect);
        selectClientSwitch(scanner, clientSelect);
    }

    public static void showBankBranch(final Bank bank) {
        System.out.println("Show bank branch");
        final List<BankBranch> bankBranches = bank.getBankBranch();
        for (int i = 0; i < bankBranches.size(); i++) {
            System.out.println(i);
            System.out.println(bankBranches.get(i));
        }
    }

    public static void selectBankBranch(final Scanner scanner, final List<BankBranch> bankBranches) {
        System.out.println("Select bank branch");
        final int selectIdBranch = scanner.nextInt();
        final BankBranch branchSelect = bankBranches.get(selectIdBranch);
        System.out.println(branchSelect);
        selectBankBranchSwitch(scanner, branchSelect);
    }

    public static void showMainBank(final Bank bank) {
        System.out.println("Show main bank");
        System.out.println(bank.getMainBankBranch());
    }

    public static void showAccounts(final List<BankAccount> bankAccountList) {
        System.out.println("Show client's accounts");
        for (final BankAccount bankAccount : bankAccountList) {
            System.out.println(bankAccount);
        }
    }

    public static BankAccount createAccount(final Scanner scanner) {
        System.out.println("Create new account");
        System.out.println("Enter number");
        final int numberNewAccount = scanner.nextInt();
        System.out.println("Enter currency");
        final String currencyNewAccount = scanner.nextLine();
        return new BankAccount(numberNewAccount, 0, currencyNewAccount);
    }

    public static void selectClientAccount(final Scanner scanner, final List<BankAccount> bankAccounts) {
        System.out.println("Select account");
        final int selectAccountClient = scanner.nextInt();
        final BankAccount selectAccount = bankAccounts.get(selectAccountClient);
        System.out.println(selectAccount);
        selectClientAccountSwitch(scanner, selectAccount);
    }

    public static void addMoney(final Scanner scanner, final BankAccount bankAccount) {
        System.out.println("Add money");
        System.out.println("How much do you want to add?");
        final double addAmount = scanner.nextDouble();
        bankAccount.setBalance(bankAccount.getBalance() + addAmount);
    }

    public static boolean withdrawMoney(final Scanner scanner, final BankAccount bankAccount) {
        System.out.println("Get money");
        System.out.println("How much do you want to get?");
        final double getAmount = scanner.nextDouble();
        if (bankAccount.getBalance() < getAmount) {
            return false;
        }
        bankAccount.setBalance(bankAccount.getBalance() - getAmount);
        return true;
    }

    public static void showBalance(final BankAccount bankAccount) {
        System.out.println("Show balance");
        System.out.println(bankAccount.getBalance());
    }

    public static void selectClientAccountSwitch(final Scanner scanner, final BankAccount selectAccount) {
        System.out.println("What do you want to do?");
        System.out.println("1. Add money");
        System.out.println("2. Get money");
        System.out.println("3. Show balance");
        System.out.println("0. Exit");
        final int choiceSelectClientAccountSwitch = scanner.nextInt();
        switch (choiceSelectClientAccountSwitch) {
            case 1:
                addMoney(scanner, selectAccount);
                break;
            case 2:
                if (withdrawMoney(scanner, selectAccount)) {
                    System.out.println("Done");
                } else {
                    System.out.println("Error");
                }
                break;
            case 3:
                showBalance(selectAccount);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }

    public static void selectClientSwitch(final Scanner scanner, final Client client) {
        final int choiceSelectClient = scanner.nextInt();
        System.out.println("What do you want to do?");
        System.out.println("1. Show accounts");
        System.out.println("2. Create new account");
        System.out.println("3. Select account");
        System.out.println("0. Exit");
        switch (choiceSelectClient) {
            case 1:
                showAccounts(client.getAccounts());
                break;
            case 2:
                final BankAccount account = createAccount(scanner);
                client.getAccounts().add(account);
                break;
            case 3:
                selectClientAccount(scanner, client.getAccounts());
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }

    public static void showAddressBankBranch(final BankBranch bankBranch) {
        System.out.println("Show address");
        final Address address = bankBranch.getAddress();
        System.out.println(address);
    }

    public static Employee createEmployee(final Scanner scanner) {
        System.out.println("Create employee");
        System.out.println("Enter ID: ");
        final int idNewEmployee = scanner.nextInt();
        System.out.println("Enter name:");
        final String nameNewEmployee = scanner.nextLine();
        System.out.println("Enter surname: ");
        final String surnameNewEmployee = scanner.nextLine();
        return new Employee(idNewEmployee, nameNewEmployee, surnameNewEmployee);
    }

    public static boolean removeEmployee(final Scanner scanner, final BankBranch bankBranch) {
        System.out.println("Remove employee");
        System.out.println("Enter number employee");
        final int removeEmployee = scanner.nextInt();
        if (removeEmployee < 0 || removeEmployee >= bankBranch.getEmployees().size()) {
            return false;
        }
        bankBranch.getEmployees().remove(removeEmployee);
        return true;
    }

    public static void showEmployees(final BankBranch bankBranch) {
        System.out.println("Show employees");
        final List<Employee> employee = bankBranch.getEmployees();
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(i);
            System.out.println(employee.get(i));
        }
    }

    public static void selectBankBranchSwitch(final Scanner scanner, final BankBranch bankBranch) {
        System.out.println("What do you want to do?");
        System.out.println("1. Create employee");
        System.out.println("2. Remove employee");
        System.out.println("3. Show address");
        System.out.println("4. Show employee");
        System.out.println("0. Exit");
        final int choiceSelectBankBranchSwitch = scanner.nextInt();
        switch (choiceSelectBankBranchSwitch) {
            case 1:
                bankBranch.getEmployees().add(createEmployee(scanner));
                break;
            case 2:
                if (removeEmployee(scanner, bankBranch)) {
                    System.out.println("Done");
                } else {
                    System.out.println("Error");
                }
                break;
            case 3:
                showAddressBankBranch(bankBranch);
                break;
            case 4:
                showEmployees(bankBranch);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }

    public static void selectSwitch(final Scanner scanner, final Bank bank) {
        final int choiceSelect = scanner.nextInt();
        System.out.println("What do you want to do?");
        System.out.println("1. Edit bank name");
        System.out.println("2. Show clients");
        System.out.println("3. Select client");
        System.out.println("4. Show bank branch");
        System.out.println("5. Select bank branch");
        System.out.println("6. Show main bank");
        System.out.println("0. Exit");
        switch (choiceSelect) {
            case 1:
                editBankName(scanner, bank);
                break;
            case 2:
                showClients(bank);
                break;
            case 3:
                selectClient(scanner, bank.getClientList());
                break;
            case 4:
                showBankBranch(bank);
                break;
            case 5:
                selectBankBranch(scanner, bank.getBankBranch());
                break;
            case 6:
                showMainBank(bank);
                break;
            default:
                System.out.println("Wrong choice");
                break;
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
                    banks.add(createBank(scanner));
                    break;
                case 2:
                    listBank(banks);
                    break;
                case 3:
                    selectBank(scanner, banks);
                    break;
                case 4:
                    final boolean name = deleteBank(scanner, banks);
                    if (name) {
                        System.out.println("Done");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
