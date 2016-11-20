package Lesson_4.HomeWork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Admin on 20.11.16.
 */
public class ForTesting {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        DataHelper d = new DataHelper();
        System.out.println(d.getFormattedStartDate());
    }
}
