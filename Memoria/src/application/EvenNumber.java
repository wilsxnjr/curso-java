package application;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();

        int[] vector = new int[size];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter the number: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("Even numbers");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] % 2 == 0) {
                System.out.print(vector[i] + " ");
            }
        }
    }
}
