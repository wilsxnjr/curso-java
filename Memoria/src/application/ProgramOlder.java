package application;

import entities.Older;

import java.util.Scanner;

public class ProgramOlder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many people: ");
        int size = sc.nextInt();

        Older[] older = new Older[size];

        for (int i = 0; i < older.length; i++) {
            sc.nextLine();
            System.out.printf("Person %d %n", (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            older[i] = new Older(name, age);
        }

        int maxAge = 0;
        String oldestName = "";
        for (int i = 0; i < older.length; i++) {
            if (older[i].getAge() > maxAge) {
                maxAge = older[i].getAge();
                oldestName = older[i].getName();
            }
        }
        System.out.println("Oldest person: " + oldestName);
        sc.close();
    }
}
