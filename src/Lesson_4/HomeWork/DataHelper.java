package Lesson_4.HomeWork;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Admin on 20.11.16.
 */
public class DataHelper {

    static LocalDateTime startTime;
    static LocalDateTime currentTime;

    public String getFormattedStartDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("G yyy-MM-dd | HH:mm:ss");
        startTime = LocalDateTime.now().minusYears(1500);
        currentTime = LocalDateTime.now().minusYears(1500);
        return startTime.format(formatter).toString();
    }

    public void skipTime() {
        currentTime = currentTime.plusMinutes(45);
    }

    public String getFormattedDiif() {
        Duration duration = Duration.between(startTime, currentTime);
        long days = duration.toDays();
        long hours = 0;
        long minutes = 0;

        /*
        * Условный оператор используется для правильного расчёта времени по
        * каждому разряду.
        * Пример: разность = 185 минут.
        * дней: 0, часов 3, минут 185  ---> не правильно.
        * дней: 0, часов 3, минут 5    ---> правильно.
        */
        if ((duration.toMinutes() % 60) != 0)  minutes = duration.toMinutes() % 60;
        if ((duration.toHours() % 24) != 0)  hours = duration.toHours() % 24;

        return "дней " + days + ", часов " + hours + ", минут " + minutes;
    }
}
