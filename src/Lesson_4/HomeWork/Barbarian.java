package Lesson_4.HomeWork;

/**
 * Created by Admin on 20.11.16.
 */
public class Barbarian implements Warrior{

    int health = 100;
    int damage = 30;
    String squadName;
    String name;

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

    @Override
    public String toString() {
        return "имя: " + name + ", класс: " + getClass().getSimpleName() + ", отряд: " + squadName;
    }
}
