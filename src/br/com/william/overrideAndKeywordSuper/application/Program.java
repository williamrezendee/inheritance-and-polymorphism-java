package br.com.william.overrideAndKeywordSuper.application;

import br.com.william.overrideAndKeywordSuper.entities.Account;
import br.com.william.overrideAndKeywordSuper.entities.BusinessAccount;
import br.com.william.overrideAndKeywordSuper.entities.SavingsAccount;

import java.util.BitSet;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000.00);
        Account acc2 = new SavingsAccount(1002, "Pedro", 1000.00, 0.01);
        Account acc3 = new BusinessAccount(1003, "Dell Technologies", 1000.0, 1000.0);

        acc1.withdraw(200.00);
        acc2.withdraw(200.00);
        acc3.withdraw(200.00);

        System.out.println(acc1.getBalance()); // 795.00
        System.out.println(acc2.getBalance()); // 800.00
        System.out.println(acc3.getBalance()); // 793.00
    }
}
