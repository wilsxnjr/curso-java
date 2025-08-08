package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the value in position %d: ", i);
            vector[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vector[i];
        }

        double avg = sum / n;

        System.out.printf("Average: %.2f", avg);

    }
}
