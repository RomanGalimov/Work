package Lesson_4.HomeWork;


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
        return "";
    }
}
