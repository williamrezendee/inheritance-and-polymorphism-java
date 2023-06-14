package br.com.william.inheritance.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) {
        balance -= amount;
    }

    public void deposit(Double amount) {
        balance += amount;
    }
}
