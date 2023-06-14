package br.com.william.polymorphism.application;

import br.com.william.polymorphism.entities.Account;
import br.com.william.polymorphism.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account x = new Account(1020, "Anne", 1000.0);
        Account y = new SavingsAccount(1023, "Eloa", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
