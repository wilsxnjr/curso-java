package application;

import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the vector: ");
        int size = sc.nextInt();

        double[] vector = new double[size];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter the value: ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0;
        System.out.println();
        System.out.print("Values = ");
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
            System.out.print(vector[i] + " ");
        }

        double avg = sum / vector.length;

        System.out.println();
        System.out.printf("Sum = %.2f %n",sum);
        System.out.printf("Avg = %.2f %n",avg);

        sc.close();

    }
}
