package Lesson_4.HomeWork;

import java.util.Random;

/**
 * Created by Admin on 20.11.16.
 */
public class Squad {

    static Random random = new Random();

    String name;
    Warrior[] team = new Warrior[8];
    static String[] warriorName = {"Ader", "Abner", "Alford", "Bennet", "Ward", "Wilf", "Iorik", "Kallen", "Oldin"};

    Squad(String name) {
        this.name = name;
        createTeam();
    }

    void createTeam() {
        int randomDigit;
        for (int i = 0; i < team.length; i++) {
            randomDigit = Squad.random.nextInt(3);
            if (randomDigit == 0) {
                team[i] = new Viking(getRandomNameWarrior());
                team[i].setSquadName(name);
            } if (randomDigit == 1) {
                team[i] = new Archer(getRandomNameWarrior());
                team[i].setSquadName(name);
            } if (randomDigit == 2){
                team[i] = new Barbarian(getRandomNameWarrior());
                team[i].setSquadName(name);
            }
        }
    }

    String getRandomNameWarrior() {
        int index = Squad.random.nextInt(warriorName.length);
        return warriorName[index];
    }

    public boolean hasAliveWarriors() {
        for (int i = 0; i < team.length; i++) {
            if (team[i].isAlive())  return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    protected Squad clone() throws CloneNotSupportedException {
        Squad clone = new Squad(this.name);

        for (int i = 0; i < this.team.length; i++) {
            clone.team[i] = this.team[i];
        }
        return clone;
    }
}
