import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double basicPlan = 50;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira os minutos falado: ");
        int minutes = sc.nextInt();

        if(minutes > 100) {
            basicPlan += (minutes - 100) * 2;
        }

        System.out.printf("%.2f", basicPlan);

        sc.close();

    }
}