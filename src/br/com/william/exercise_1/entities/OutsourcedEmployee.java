package br.com.william.exercise_1.entities;

public class OutsourcedEmployee extends Employee {

    private final Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
