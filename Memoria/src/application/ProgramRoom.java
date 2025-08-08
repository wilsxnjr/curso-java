package application;

import entities.Room;

import java.util.Scanner;

public class ProgramRoom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented: ");
        int quantity = sc.nextInt();

        Room[] room = new Room[10];

        for (int i = 0; i < quantity; i++) {
            sc.nextLine();
            System.out.println();
            System.out.printf("Rent #%d %n", (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            room[roomNumber] = new Room(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null) {
                System.out.println(i + ": " + room[i]);
            }
        }

    }
}
