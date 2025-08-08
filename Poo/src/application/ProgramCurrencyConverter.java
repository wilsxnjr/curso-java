package application;

import entities.CurrencyConverter;

import java.util.Scanner;

public class ProgramCurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        System.out.printf("Amount to be paid = %.2f", CurrencyConverter.dollarToReal(dollarPrice, amount));

    }
}