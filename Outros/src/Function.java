import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int higher = max(n1, n2, n3);

        showResult(higher);

        sc.close();

    }

    public static int max(int a, int b, int c) {
        if(a > b && a > c) {
            return a;
        }else if(b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void showResult(int value) {
        System.out.println("Higher " + value);
    }

}
