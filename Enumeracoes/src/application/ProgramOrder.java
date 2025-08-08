package application;

import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.Client;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramOrder {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth Date: ");
        Date clientBirth = sdf1.parse(sc.next());

        Client client = new Client(clientName, clientEmail, clientBirth);

        sc.nextLine();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter #%d item data:%n", i);
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, product.getPrice(), product);
            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
    }
}