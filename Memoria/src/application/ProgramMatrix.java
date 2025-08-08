package application;

import java.util.Scanner;

public class ProgramMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lines: ");
        int n = sc.nextInt();
        System.out.print("Columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (number == matrix[i][j]) {
                    System.out.printf("Position %d, %d %n", i, j);
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}