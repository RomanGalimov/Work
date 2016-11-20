package Lesson_4.HomeWork;

import java.util.Random;

/**
 * Created by Admin on 20.11.16.
 */
public class Squad {

    static Random random = new Random();
    Warrior[] team = new Warrior[5];

    public Warrior getRandomWarrior() {

        for (int i = 0; i < team.length; i++) {
            if (team[i] != null)  return team[i];
        }
    }

    public boolean hasAliveWarriors() {
        for (int i = 0; i < team.length; i++) {
            if (team[i] != null )  return true;
        }
        return false;

    }
}
