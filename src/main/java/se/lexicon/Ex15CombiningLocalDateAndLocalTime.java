package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex15CombiningLocalDateAndLocalTime {
    public static void main(String[] args){
        //Create LocalDate for the date "2023-11-21"
        LocalDate date=LocalDate.parse("2023-11-21");

        //Create Localtime for the time "15:30:45"
        LocalTime time=LocalTime.parse("15:30:45");

        //Combining LocalDate and Localtime to get LocalDateTime
        LocalDateTime localDateTime=LocalDateTime.of(date,time);

        //Printing the result
        System.out.println("Combined LocalDateTime: "+localDateTime);
    }
}
