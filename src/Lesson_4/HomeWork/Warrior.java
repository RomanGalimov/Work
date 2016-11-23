package Lesson_4.HomeWork;

/**
 * Created by Admin on 20.11.16.
 */
public interface Warrior {

    int attack();
    void takeDamage(int damage);
    boolean isAlive();
    void setSquadName(String name);
    String getWarriorName();
    String getSquadName();
    int getDamage();
    default void atackingUnit(Warrior unit) {
        unit.takeDamage(this.attack());
    }
}
