package se.lexicon;

import java.time.LocalDate;

public class Ex6MathOperationsOnDate {
    public static void main(String[] args){
        LocalDate today=LocalDate.now();
        System.out.println("Today's date is "+today);
        today=today.plusYears(10).minusMonths(10);
        System.out.println("New Date is,"+today);
        System.out.println("Month of the new date is "+today.getMonth());
    }
}
