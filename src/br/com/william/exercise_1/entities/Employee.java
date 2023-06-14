package br.com.william.exercise_1.entities;

public class Employee {

    private final String name;
    private final Integer hours;
    private final Double valuePerHour;

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Double payment() {
        return hours * valuePerHour;
    }

    @Override
    public String toString() {
        return name +
                " - $ " +
                payment();
    }
}
