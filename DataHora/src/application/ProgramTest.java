package application;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgramTest {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d04 = LocalDate.parse("2003-05-05");
        LocalDateTime d05 = LocalDateTime.parse("2003-05-05T14:30:30");
        Instant d06 = Instant.parse("2003-05-05T14:30:30Z");

        System.out.println(fmt1.format(d04));
        System.out.println(fmt2.format(d05));
        System.out.println(fmt3.format(d06));
        System.out.println(fmt4.format(d06));

    }
}
