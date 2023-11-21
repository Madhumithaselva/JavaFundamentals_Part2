package se.lexicon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex3IsoDateDisplay {
    public static void main(String[] args){
        //Get current date
        LocalDate today= LocalDate.now();
        System.out.println(today);
        //Find the last Monday
        LocalDate lastMonday=today.with(DayOfWeek.MONDAY);
        if(lastMonday.isAfter(today)) {
            lastMonday = lastMonday.minusWeeks(1);
        }
        //Print the Entire week
        DateTimeFormatter formatter=DateTimeFormatter.ISO_DATE;
        for(int i=0;i<7;i++){
            System.out.println(lastMonday.format(formatter));
            lastMonday=lastMonday.plusDays(1);
        }
        }
       /* System.out.println(timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(timestamp.format(DateTimeFormatter.ISO_DATE));
        System.out.println(timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(timestamp.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(timestamp.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(timestamp.format(DateTimeFormatter.ISO_LOCAL_TIME));*/
    }