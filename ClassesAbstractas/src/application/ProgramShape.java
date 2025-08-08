package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramShape {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n ; i++) {
            System.out.printf("Shape #%d data: %n", i);
            System.out.print("Rectangle or Circle (r/c)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();
            if (answer == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                Shape shape = new Rectangle(Color.valueOf(color), width, height);
                shapes.add(shape);
            } else if (answer == 'c') {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                Shape shape = new Circle(Color.valueOf(color), radius);
                shapes.add(shape);
            }
        }

        System.out.println();
        System.out.println("SHAPES AREA:");
        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
