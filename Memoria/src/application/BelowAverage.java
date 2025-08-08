package application;

import java.util.Scanner;

public class BelowAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size ");
        int size = sc.nextInt();

        double[] vector = new double[size];
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a value: ");
            vector[i] = sc.nextDouble();
            sum += vector[i];
        }

        double avg = sum / vector.length;
        System.out.println();
        System.out.printf("Average: %.3f %n", avg);
        System.out.println("Below average");
        for (int i = 0; i < vector.length; i++) {
            if (avg > vector[i]) {
                System.out.printf("%.2f %n", vector[i]);
            }
        }
    }
}
