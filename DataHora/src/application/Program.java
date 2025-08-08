package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //Formatar data
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //Texto ISO 8601
        LocalDate d04 = LocalDate.parse("2003-05-05");
        LocalDateTime d05 = LocalDateTime.parse("2003-05-05T14:30:30");
        Instant d06 = Instant.parse("2003-05-05T14:30:30Z");
        Instant d07 = Instant.parse("2025-07-11T19:55:30+02:00");

        //Data customizada
        LocalDate d08 = LocalDate.parse("05/05/2003", fmt1);
        //LocalDate d08 = LocalDate.parse("05/05/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("05/05/2003 14:30", fmt2);

        //Informando a data separado
        LocalDate d10 = LocalDate.of(2003, 5, 5);
        LocalDateTime d11 = LocalDateTime.of(2006, 9, 7, 14, 30);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}
