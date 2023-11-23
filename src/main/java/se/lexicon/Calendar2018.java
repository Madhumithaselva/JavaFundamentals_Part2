package se.lexicon;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar2018 {
    public static void main(String[] args) {
        int year = 2018;
        for (int month = 1; month <= 12; month++) {

            //Create a LocalDate for the first day of the month
            LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

            LocalDate endDayOfMonth = LocalDate.of(year, month, firstDayOfMonth.lengthOfMonth());

            //Create a Week of Day for the first day of the month
            DayOfWeek firstDayOfWeek = firstDayOfMonth.getDayOfWeek();


            //System.out.println(firstDayOfWeek);
           // System.out.println(firstDayOfMonth.lengthOfMonth());
            int newMonth = firstDayOfWeek.getValue() % 7;

            //Print the header of the month
            System.out.println(firstDayOfMonth.getMonth() + " " + year);
            System.out.println("Mon Tue Wed Thu Fri Sat Sun");

            // Print leading spaces for the first week
            for (int i = 0; i < newMonth; i++) {
                System.out.print("\t");
            }
            int daysInMonth = firstDayOfMonth.lengthOfMonth();
            for (int i = 1; i <= daysInMonth; i++) {
                System.out.printf("%2d\t", i);
                //Move to the next line
                if ((i + newMonth) % 7 == 0 || i == daysInMonth) {
                    System.out.println();
                }
            }

        }
    }
}

