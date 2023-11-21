package se.lexicon;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex12DateTimeFormatter {
    public static void  main(String[] args){
        LocalTime currentTime=LocalTime.now();
        //Formatting the time
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");

        //Formatting the local time and printing
        String formatTime=currentTime.format(formatter);
        System.out.println("Formatted Localtime is "+formatTime);

    }
}
