package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ex14FormattingWithDateTimeFormatter {
    public static void main(String[] args){
        // Creating LocalDate for the date "2018-04-05"
        LocalDate date = LocalDate.of(2018, 4, 5);
        // Creating LocalTime for the time "10:00"
        LocalTime time = LocalTime.of(10, 0);

        // Combining LocalDate and LocalTime to create LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.of(date, time);

        // Defining the desired date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm", new Locale("sv", "SE"));

        // Format the LocalDateTime and print
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Formatted LocalDateTime: " + formattedDateTime);
    }
}
