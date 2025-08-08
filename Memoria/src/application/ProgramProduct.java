package application;

import entities.Product;

import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            sc.nextLine();
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }

        double avg = sum / products.length;

        System.out.printf("AVERAGE = %.2f", avg);
    }
}