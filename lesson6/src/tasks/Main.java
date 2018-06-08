package tasks;

import java.text.ParseException;

public class Main {

    public static void main(String[] args){
        //taks 1
        MinMax.first();

        //task 2
        System.out.println("\nTask 2:");
        try {
            DateSeason.date();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //task 3
        System.out.println("\nTask 3:");
        Factorial.factorialFor(4);
        Factorial.factorialWhile(4);

        //task 4
        System.out.println("\nTask 4:");
        Four.odd();

        //task 5
        System.out.println("\nTask 5:");
        Fifth.fifth();
    }
}
