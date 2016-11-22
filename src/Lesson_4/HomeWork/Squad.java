package Lesson_4.HomeWork;

import java.util.Random;

/**
 * Created by Admin on 20.11.16.
 */
public class Squad {

    static Random random = new Random();

    String name;
    Warrior[] team = new Warrior[random.nextInt(6) + 10];

    Squad(String name) {
        this.name = name;
    }

    public Warrior getRandomWarrior() {

        for (int i = 0; i < team.length; i++) {
            if (team[i] != null)  return team[i];
        } return null;
    }

    public boolean hasAliveWarriors() {
        for (int i = 0; i < team.length; i++) {
            if (team[i] != null )  return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
