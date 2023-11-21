package se.lexicon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex4LocalDateByParseMethod {
    public static void main(String[] args){
        //Creating a date string in a specified format
        String dateString=  "11-21-2023";
        //Creating a DateTimeFormatter for the specified date format
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        //Parse the string to crate a localDate object
        LocalDate parseDate= LocalDate.parse(dateString,formatter);

        //Print the localDate object
        System.out.println("Parsed localDate: "+parseDate);



    }
}
