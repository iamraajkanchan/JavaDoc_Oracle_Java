package basics;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class DateClassExample {
    public static void main(String[] args) {
        ChronoLocalDate enteredStartDate = LocalDate.parse("2022-11-03");
        ChronoLocalDate enteredToDate = LocalDate.parse("2022-11-23");
        LocalDate fromDate = LocalDate.parse("2022-11-01");
        LocalDate toDate = LocalDate.parse("2022-11-28");
        if (fromDate.isBefore(enteredStartDate)) {
            System.out.println("enteredStartDate is a valid date");
        } else if (toDate.isAfter(enteredStartDate)) {
            System.out.println("enteredStartDate is a valid date");
        } else {
            System.out.println("enteredStartDate is invalid date");
        }
        if (fromDate.isBefore(enteredToDate)) {
            System.out.println("enteredToDate is a valid date");
        } else if (toDate.isAfter(enteredToDate)) {
            System.out.println("enteredToDate is a valid date");
        } else {
            System.out.println("enteredToDate is invalid date");
        }
    }
}
