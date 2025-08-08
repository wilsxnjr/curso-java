package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println();
            System.out.printf("Employee #%d: %n", (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            while (hasId(list, id)) {
                System.out.print("This id already exist, try again: ");
                id = sc.nextInt();
                sc.nextLine();
            }
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        Integer employeeId = sc.nextInt();
        Integer pos = position(list, employeeId);
        if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    public static Integer position(List<Employee> list, Integer id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, Integer id) {
        for (Employee employee : list) {
            if (employee.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}