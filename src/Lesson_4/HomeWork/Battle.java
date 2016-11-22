package Lesson_4.HomeWork;

import java.time.*;

/**
 * Created by Admin on 20.11.16.
 */
public class Battle {





    public static void main(String[] args) {

        Squad english = new Squad("England");
        Squad french = new Squad("France");

        System.out.println("Битва началась " + DataHelper.getFormattedStartDate());


        int iEnglish = Squad.random.nextInt(english.team.length);
        int iFrench = Squad.random.nextInt(french.team.length);

        english.team[iEnglish].atackingUnit(french.team[iFrench]);
        DataHelper.skipTime();
        if (!french.hasAliveWarriors())  return;

        french.team[iFrench].atackingUnit(english.team[iEnglish]);
        DataHelper.skipTime();
        if (!english.hasAliveWarriors())  return;

        /*while (english.hasAliveWarriors() && french.hasAliveWarriors()) {

        }*/

    }
}
