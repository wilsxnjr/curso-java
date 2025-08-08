package application;

import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();

        double[] vector = new double[size];

        double sum = 0;
        int count = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextDouble();
            if (vector[i] % 2 == 0) {
                sum += vector[i];
                count++;
            }
        }

        if (count > 0) {
            double avg = sum / count;
            System.out.printf("Average %.2f", avg);
        } else {
            System.out.println("Nenhum número par");
        }
    }
}
