package se.lexicon;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ex2LocalDateWithDateFormatter {
    public static void main(String[] args){
        LocalDate today= LocalDate.now();
        System.out.println("LocalDate: "+today);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("eeee dd MMMM");
        String formattedDate=today.format(formatter);
        System.out.println("Formatted Date:"+formattedDate);

    }
}
