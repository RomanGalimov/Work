package Lesson_4.HomeWork;

import java.time.*;

/**
 * Created by Admin on 20.11.16.
 */
public class Battle {





    public static void main(String[] args) {

        Squad english = new Squad("England");
        Squad french = new Squad("France");
        int iEnglish = 0;
        int iFrench = Squad.random.nextInt(french.team.length);

        System.out.println("Битва началась " + DataHelper.getFormattedStartDate());


        //Fase1
        if (english.hasAliveWarriors()) {

            while (true) {
                iEnglish = Squad.random.nextInt(english.team.length);
                if (english.team[iEnglish].isAlive()) break;
            }


        } else {
            System.out.println("отряд \"France\" победил");
            return;
        }

        //Fase2
        if (french.hasAliveWarriors()) {

            while (true) {
                iFrench = Squad.random.nextInt(french.team.length);
                if (french.team[iFrench].isAlive()) break;
            }
        } else {
            System.out.println("отряд \"England\" победил");
            return;
        }

        ////////////////////////////////////////////////////////////////////////////////////////
        
        
        
        english.team[iEnglish].atackingUnit(french.team[iFrench]);

        System.out.println(english.team[iEnglish].getClass().getSimpleName() + " " 
                + english.team[iEnglish].getWarriorName() + " из отряда \"" +
                english + "\" нанёс " + french.team[iFrench].getClass().getSimpleName() + "`у "
                + french.team[iFrench].getWarriorName() + " из отряда \"" + french + " "
                + english.team[iEnglish].getDamage() + " единиц урона!");


        

        //если защищающийся помер.
        if (!french.team[iFrench].isAlive()) {
            System.out.println(french.team[iFrench].getWarriorName() + " из отряда \"France\" погиб!");
        }

        DataHelper.skipTime();
        if (!french.hasAliveWarriors()) {
            System.out.println("Отряд: " + english.name + "победил!");
            DataHelper.getFormattedDiif();
            return;
        }
        // end Fase1

        french.team[iFrench].atackingUnit(english.team[iEnglish]);
        DataHelper.skipTime();
        if (!english.hasAliveWarriors()) {
            System.out.println("Отряд: " + french.name + "победил!");
            DataHelper.getFormattedDiif();
            return;
        }

        /*while (english.hasAliveWarriors() && french.hasAliveWarriors()) {

        }*/

    }
}
