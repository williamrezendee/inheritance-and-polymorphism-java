package br.com.william.inheritance.application;

import br.com.william.inheritance.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {

        BusinessAccount businessAccount = new BusinessAccount(1122, "William", 100000.00);

        System.out.println("Number: " + businessAccount.getNumber());
        System.out.printf("Holder: %s%n", businessAccount.getHolder());
        System.out.printf("Balance: %.2f%n", businessAccount.getBalance());
        System.out.printf("Loan limit: %.2f%n", businessAccount.getLoanLimit());

        businessAccount.withdraw(20000.00);
        System.out.printf("Balance after a withdraw: %.2f%n", businessAccount.getBalance());

        businessAccount.deposit(50000.00);
        System.out.printf("Balance after a deposit: %.2f%n", businessAccount.getBalance());
    }
}
