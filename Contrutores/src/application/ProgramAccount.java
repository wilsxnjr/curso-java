package application;

import entities.Account;

import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);

        double amount;

        if(response == 'y') {
            System.out.print("Enter initial deposit value: ");
            amount = sc.nextDouble();
            account = new Account(holder, number, amount);
        } else {
            account = new Account(holder, number);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Update data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Update data: ");
        System.out.println(account);

    }
}