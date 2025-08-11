package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter a file path: ");
        String strFilePath = sc.nextLine();

        File filePath = new File(strFilePath);

        String folderPath = filePath.getParent();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);
                line = br.readLine();
                list.add(new Product(name, price, quantity));
            }

            boolean success = new File(folderPath + "\\out").mkdir();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(folderPath + "\\out\\summary.csv"))) {
                for (Product product : list) {
                    bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}