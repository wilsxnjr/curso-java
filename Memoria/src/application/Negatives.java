package application;

import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the vector: ");
        int n = sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("Negatives:");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }

    }
}
