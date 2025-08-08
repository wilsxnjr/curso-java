package application;

import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];

        System.out.println("Enter the values of a");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the value: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the values of b");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter the value: ");
            b[i] = sc.nextInt();
        }

        System.out.println("Sum of them");
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }


    }
}
