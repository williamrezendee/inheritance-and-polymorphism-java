package br.com.william.upcastingAndDowncasting.application;

import br.com.william.upcastingAndDowncasting.entities.Account;
import br.com.william.upcastingAndDowncasting.entities.BusinessAccount;
import br.com.william.upcastingAndDowncasting.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        BusinessAccount businessAccount = new BusinessAccount(1002, "Lenovo Technologies", 0.00, 100000.00);

        // UPCASTING
        Account account = businessAccount;
        Account businessToAccount = new BusinessAccount(1003, "Dell Technologies", 100000.00, 1000000.00);
        Account savingsToAccount = new SavingsAccount(1004, "Pedro Pascal", 100.00, 0.01);

        System.out.println(account.getHolder()); // Lenovo Technologies
        System.out.println(businessToAccount.getHolder()); // Dell Technologies
        System.out.println(savingsToAccount.getHolder()); // Pedro

        // DOWNCASTING
        BusinessAccount businessAccount1 = (BusinessAccount) businessToAccount;
        businessAccount1.loan(100.0);

        System.out.println(businessAccount1.getHolder()); // Dell Technologies
        System.out.println(businessAccount1.getBalance()); // 100100.00
    }
}
