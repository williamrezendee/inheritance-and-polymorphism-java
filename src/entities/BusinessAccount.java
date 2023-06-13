package entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = 10000.00;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double amount) {
        this.loanLimit = amount;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }
}
