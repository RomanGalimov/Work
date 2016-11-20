package Lesson_4.HomeWork;

import java.time.LocalDate;

/**
 * Created by Admin on 20.11.16.
 */
public class DataHelper {

    public String getFormattedStartDate() {
        LocalDate nowDate = LocalDate.now();
        return nowDate.minusYears(1500).toString();
    }

    public void skipTime() {

    }

    public void getFormattedDiif() {

    }
}
