package application;

import entities.Approved;

import java.util.Scanner;

public class ProgramApproved {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students: ");
        int size = sc.nextInt();

        Approved[] approved = new Approved[size];

        for (int i = 0; i < approved.length; i++) {
            sc.nextLine();
            System.out.printf("Student %d %n", (i + 1));
            String name = sc.nextLine();
            double mark1 = sc.nextDouble();
            double mark2 = sc.nextDouble();
            approved[i] = new Approved(name, mark1, mark2);
        }

        System.out.println("Approved student:");
        for (int i = 0; i < approved.length; i++) {
            double avg = (approved[i].getMark1() + approved[i].getMark2()) / 2;
            if (avg >= 6) {
                System.out.println(approved[i].getName());
            }
        }
    }
}
