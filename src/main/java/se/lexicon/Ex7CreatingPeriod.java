package se.lexicon;

import java.time.LocalDate;
import java.time.Period;

public class Ex7CreatingPeriod {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2033, 1, 21);
        LocalDate nextBirthDate = LocalDate.of(2023, 12, 8);
        Period period = Period.between(nextBirthDate, currentDate);
        System.out.println("Time to next Birthday in " + currentDate.getYear() + " is : ");
        System.out.println(period.getYears() + "Years " + period.getMonths() + "Months " + period.getDays() + "Days");
    }
}
