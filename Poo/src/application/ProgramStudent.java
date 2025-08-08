package application;

import entities.Student;

import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the name: ");
        student.name = sc.nextLine();

        System.out.println("Enter the marks: ");
        student.nota1 = sc.nextDouble();
        if(student.nota1 > 30) {
            do {
                System.out.println("Invalid, insert again");
                student.nota1 = sc.nextDouble();
            } while(student.nota1 > 30);
        }

        student.nota2 = sc.nextDouble();
        if(student.nota2 > 35) {
            do {
                System.out.println("Invalid, insert again");
                student.nota2 = sc.nextDouble();
            } while(student.nota2 > 35);
        }

        student.nota3 = sc.nextDouble();
        if(student.nota3 > 35) {
            do {
                System.out.println("Invalid, insert again");
                student.nota3 = sc.nextDouble();
            } while(student.nota3 > 35);
        }

        student.passed();

    }
}
