package application;

import entities.PersonalData;

import java.util.Scanner;

public class ProgramPersonalData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();

        PersonalData[] data = new PersonalData[size];

        double sum = 0;
        int countWoman = 0;
        int countMan = 0;
        for (int i = 0; i < data.length; i++) {
            sc.nextLine();
            System.out.printf("Person %d height: ", (i + 1));
            double height = sc.nextDouble();
            System.out.printf("Person %d gender: ", (i + 1));
            char gender = sc.next().charAt(0);
            data[i] = new PersonalData(height, gender);
            if (data[i].getGender() == 'f' || data[i].getGender() == 'F') {
                sum += data[i].getHeight();
                countWoman++;
            } else {
                countMan++;
            }
        }

        double avg = sum / countWoman;

        double maxHeight = data[0].getHeight();
        double minHeight = data[0].getHeight();
        for (int i = 0; i < data.length; i++) {
            if (data[i].getHeight() > maxHeight) {
                maxHeight = data[i].getHeight();
            } else if (data[i].getHeight() < minHeight) {
                minHeight = data[i].getHeight();
            }
        }
        System.out.println("Min Height: " + minHeight);
        System.out.println("Max Height: " + maxHeight);
        System.out.printf("Women Average: %.2f %n", avg);
        System.out.println("Men quantity " + countMan);
    }
}
