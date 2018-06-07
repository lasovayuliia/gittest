package tasks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class DateSeason {

    public static void date() throws ParseException {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2018, 12, 31).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(String.valueOf(randomDate));

        int monthInt = randomDate.getMonthValue();
        String season = "";
        if (monthInt >= 9 && monthInt <= 11) {
            season = "Autumn";
        } else if (monthInt >= 3 && monthInt <= 5) {
            season = "Spring";
        } else if (monthInt >= 6 && monthInt <= 8) {
            season = "Summer";
        } else {
            season = "Winter";
        }

        System.out.println(date);
        System.out.println("For this date the season is: " + season);
    }
}
