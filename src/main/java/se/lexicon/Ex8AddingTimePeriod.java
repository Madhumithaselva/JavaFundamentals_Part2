package se.lexicon;

import java.time.LocalDate;
import java.time.Period;

public class Ex8AddingTimePeriod {
    public static void main(String[] args){
        //Creating a period of 4 years,7 months and 29 days
        Period period=Period.of(4,7,29);
        LocalDate today=LocalDate.now();
        System.out.println("Current Date is : "+today);
        LocalDate newDate=today.plusYears(period.getYears()).plusMonths(period.getMonths()).plusDays(period.getDays());
        System.out.println("New Date after adding Period of 4 years,7 months and 29 days is :"+newDate);
    }

}
