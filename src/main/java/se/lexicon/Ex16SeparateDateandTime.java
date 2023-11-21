package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex16SeparateDateandTime {
    public static void main(String[] args){
        // Creating a LocalDateTime object
        LocalDateTime localDateTime = LocalDateTime.of(2023, 11, 21, 18, 30, 45);

        // Extracting LocalDate and LocalTime components
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        // Printing the results
        System.out.println("Original LocalDateTime: " + localDateTime);
        System.out.println("Extracted LocalDate: " + localDate);
        System.out.println("Extracted LocalTime: " + localTime);
    }
}
