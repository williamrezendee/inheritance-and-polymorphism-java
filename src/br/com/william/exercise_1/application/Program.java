package br.com.william.exercise_1.application;

import br.com.william.exercise_1.entities.Employee;
import br.com.william.exercise_1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();

        //scanner.nextLine();
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("Employee #%d data:%n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            String choice = scanner.next().trim();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if (choice.equals("y")) {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        scanner.close();
    }
}
