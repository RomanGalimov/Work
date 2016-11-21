package Lesson_4.HomeWork;

import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Admin on 20.11.16.
 */
public class ForTesting {

    public static void main(String[] args) {
        LocalDateTime localTime = LocalDateTime.now();
        LocalDateTime ltime = localTime.plusHours(2);

        System.out.println(Duration.between(ltime, localTime).toHours());




        //https://docs.oracle.com/javase/tutorial/datetime/iso/period.html

        //System.out.println(localDate);
        //System.out.println(localTime);

        /*DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("G yyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(dateFormatter));
        System.out.println(localDateTime.format(timeFormatter));*/

        LocalTime lt = LocalTime.of(0, 0);
        System.out.println(lt);





    }
}
