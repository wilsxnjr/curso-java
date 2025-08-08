package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramTaxPayer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Individual or Company (i/c)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.printf("Tax payer #%d data:%n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();
            if(answer == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                TaxPayer taxPayer = new Individual(name, annualIncome, healthExpenditures);
                taxPayers.add(taxPayer);
            } else if (answer == 'c') {
                System.out.print("Number of employees: ");
                Integer employees = sc.nextInt();
                TaxPayer taxPayer = new Company(name, annualIncome, employees);
                taxPayers.add(taxPayer);
            }
        }

        System.out.println();
        for (TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer.toString());
        }

        System.out.println();

        double sum = 0;
        for (TaxPayer taxPayer : taxPayers) {
            sum += taxPayer.taxes();
        }
        System.out.printf("TOTAL TAXES: %.2f %n", sum);

        sc.close();
    }
}
