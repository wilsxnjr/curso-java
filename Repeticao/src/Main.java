import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char answer;

        do {
            System.out.print("Insert number: ");
            int n = sc.nextInt();
            System.out.print("Continue? (y/n): ");
            answer = sc.next().charAt(0);
        } while (answer == 'y');

    }
}