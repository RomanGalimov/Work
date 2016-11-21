package Lesson_4.HomeWork;

/**
 * Created by Admin on 20.11.16.
 */
public class Viking implements Warrior {

    int health = 120;
    int damage = 50;
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
