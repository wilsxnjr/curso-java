package application;

import java.util.Scanner;

public class HighestPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();

        int[] vector = new int[size];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        int value = 0;
        int position = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] > value) {
                value = vector[i];
                position = i;
            }
        }

        System.out.println();
        System.out.printf("Highest value %d %n", value);
        System.out.printf("Position %d %n", position);
    }
}
