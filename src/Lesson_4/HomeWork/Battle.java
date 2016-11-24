package Lesson_4.HomeWork;

import java.time.*;

/**
 * Created by Admin on 20.11.16.
 */
public class Battle {
    static int iEnglish;
    static int iFrench;





    public static void main(String[] args) {

        Squad english = new Squad("England");
        Squad french = new Squad("France");

        System.out.println("Бой начался " + DataHelper.getFormattedStartDate());

        //Fase1
        while (true) {

            if (english.hasAliveWarriors()) {

                if (!french.hasAliveWarriors()) {
                    System.out.println("отряд \"England\" победил");
                    break;
                } else {

                    //если у обеих отрядов есть живые, то выбираем их рандомно
                    while (true) {
                        iEnglish = Squad.random.nextInt(english.team.length);
                        if (english.team[iEnglish].isAlive()) break;
                    }

                    while (true) {
                        iFrench = Squad.random.nextInt(french.team.length);
                        if (french.team[iFrench].isAlive()) break;
                    }

                    english.team[iEnglish].atackingUnit(french.team[iFrench]);

                    System.out.println(english.team[iEnglish].getClass().getSimpleName() + " "
                            + english.team[iEnglish].getWarriorName() + " из отряда \"" +
                            english + "\" нанёс " + french.team[iFrench].getClass().getSimpleName() + "`у "
                            + french.team[iFrench].getWarriorName() + " из отряда \"" + french + " "
                            + english.team[iEnglish].getDamage() + " единиц урона!");
                }

            } else {
                System.out.println("отряд \"France\" победил");
                break;
            }

            DataHelper.skipTime();

            if (french.hasAliveWarriors()) {

                if (!english.hasAliveWarriors()) {
                    System.out.println("отряд \"France\" победил");
                    break;
                } else {

                    //если у обеих отрядов есть живые, то выбираем их рандомно
                    while (true) {
                        iFrench = Squad.random.nextInt(french.team.length);
                        if (french.team[iFrench].isAlive()) break;
                    }

                    while (true) {
                        iEnglish = Squad.random.nextInt(english.team.length);
                        if (english.team[iEnglish].isAlive()) break;
                    }

                    french.team[iFrench].atackingUnit(english.team[iEnglish]);

                    System.out.println(french.team[iFrench].getClass().getSimpleName() + " "
                            + french.team[iFrench].getWarriorName() + " из отряда \"" +
                            french + "\" нанёс " + english.team[iEnglish].getClass().getSimpleName() + "`у "
                            + english.team[iEnglish].getWarriorName() + " из отряда \"" + english + " "
                            + french.team[iFrench].getDamage() + " единиц урона!");
                }

            } else {
                System.out.println("отряд \"England\" победил");
                break;
            }
        }

        System.out.println("Бой окончен за " + DataHelper.getFormattedDiif());


    }
}
