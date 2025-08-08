package application;

import entities.Height;

import java.util.Scanner;

public class ProgramHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Vector size: ");
        int size = sc.nextInt();

        Height[] heights = new Height[size];

        for (int i = 0; i < heights.length; i++) {
            sc.nextLine();
            System.out.printf("Person %d: %n", (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            heights[i] = new Height(name, age, height);
        }

        double sum = 0;
        double count = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i].getHeight();
            if (heights[i].getAge() < 16) {
                count++;
            }
        }

        System.out.println();
        double avg = sum / heights.length;
        double percentage = (count / heights.length) * 100;

        System.out.printf("Height average: %.2f %n", avg);
        System.out.printf("Percentage of people 16-: %.1f %n", percentage);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i].getAge() < 16) {
                System.out.printf("%s %n", heights[i].getName());
            }
        }

        sc.close();
    }
}
