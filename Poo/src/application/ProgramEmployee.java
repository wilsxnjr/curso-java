package application;

import entities.Employee;

import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Employee: " + employee);

        System.out.println(" ");
        System.out.print("Which percentage you want to increase? ");
        double increase = sc.nextDouble();

        employee.increaseSalary(increase);

        System.out.println(" ");
        System.out.println("Update: " + employee);

    }
}
