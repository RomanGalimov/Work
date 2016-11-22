package Lesson_4.HomeWork;

/**
 * Created by Admin on 20.11.16.
 */
public class ForTesting {

    public static void main(String[] args) {

        DataHelper dataHelper = new DataHelper();

        System.out.println(dataHelper.getFormattedStartDate());

        dataHelper.skipTime();
        dataHelper.skipTime();
        dataHelper.skipTime();
        dataHelper.skipTime();
        dataHelper.skipTime();
        dataHelper.skipTime();

        System.out.println(dataHelper.getFormattedDiif());

        Warrior warrior = new Viking();
        System.out.println(warrior);


    }
}
