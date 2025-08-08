package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class OperationDateTime {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2003-05-05");
        LocalDateTime d05 = LocalDateTime.parse("2003-05-05T14:30:30");
        Instant d06 = Instant.parse("2003-05-05T22:30:30Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(d05, nextWeekLocalDateTime);
        Duration t3 = Duration.between(d06, nextWeekInstant);

        System.out.println("t1 days = " + t1.toDays());
        System.out.println("t2 days = " + t2.toDays());
        System.out.println("t3 days = " + t3.toDays());

    }
}
