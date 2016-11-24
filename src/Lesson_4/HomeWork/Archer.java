package Lesson_4.HomeWork;

/**
 * Created by Admin on 20.11.16.
 */
public class Archer implements Warrior {

    int health = 80;
    int damage = 80;
    String squadName;
    String name;

    Archer(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int attack() {
        return damage;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public int getDamage() {
        return damage;
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
    public String getSquadName() {
        return squadName;
    }

    @Override
    public String toString() {
        return "имя: " + name + ", класс: " + getClass().getSimpleName() + ", отряд: " + squadName;
    }

    @Override
    public Warrior clone() throws CloneNotSupportedException {
        Archer obj = (Archer) super.clone();
        obj.health = health;
        obj.damage = damage;
        obj.squadName = squadName;
        obj.name = name;

        return obj;
    }
}
