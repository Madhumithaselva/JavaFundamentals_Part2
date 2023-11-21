package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex11ParsetheTimeObject {
    public static void main(String[] args){
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);
        String timeString="15:30:45";

        //Creating DateTImeFormatter
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");

        //Printing the localtime object
        LocalTime parseTime=LocalTime.parse(timeString,formatter);
        System.out.println(parseTime);

    }
}
