package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) {

        String path = "C:\\Users\\PC\\Desktop\\JR\\out.txt";
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Evening"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
