package se.lexicon;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex5WithEnumExtractDay {
    public static void main(String[] args){
        LocalDate currentDate;
        currentDate=LocalDate.of(1945,5,8);
        System.out.println("Date is "+currentDate);
        System.out.println("Day of the week is, "+currentDate.getDayOfWeek());
    }
}
