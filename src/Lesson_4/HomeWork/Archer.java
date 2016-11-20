package Lesson_4.HomeWork;

/**
 * Created by Admin on 20.11.16.
 */
public class Archer implements Warrior {

    int health = 80;
    int damage = 80;
    String squadName;

    @Override
    public int attack() {
        return damage;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        if (health > 0)  return true;
        else  return false;
    }

    @Override
    public void setSquadName(String name) {
        squadName = name;
    }
}
