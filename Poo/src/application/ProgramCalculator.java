package application;

import entities.Calculator;

import java.util.Scanner;

public class ProgramCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference %.2f%n", c);
        System.out.printf("Volume %.2f%n", v);
        System.out.printf("PI value %.2f", Calculator.PI);

        sc.close();

    }

}
