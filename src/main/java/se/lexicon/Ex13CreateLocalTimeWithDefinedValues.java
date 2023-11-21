package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex13CreateLocalTimeWithDefinedValues
{
    public static void main(String[] args){
        // Create LocalDate for the date "2018-04-05"
        LocalDate localDate = LocalDate.of(2018, 4, 5);

        // Create LocalTime for the time "10:00"
        LocalTime localTime = LocalTime.of(10, 0);

        // Combine LocalDate and LocalTime to create LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        // Print the result
        System.out.println("Created LocalDateTime: " + localDateTime);
    }
}
