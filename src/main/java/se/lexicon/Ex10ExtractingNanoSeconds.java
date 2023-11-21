package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex10ExtractingNanoSeconds {
    public static void main(String[] args){
        LocalTime currentTime=LocalTime.now();

                // Extract the nanoseconds from the current time
                int nanoseconds = currentTime.getNano();

                // Print the result
                System.out.println("Current time: " + currentTime);
                System.out.println("Nanoseconds: " + nanoseconds);
            }
        }