package Lesson_4.HomeWork;

/**
 * Created by Admin on 20.11.16.
 */
public class ForTesting {

    public static void main(String[] args) throws CloneNotSupportedException {

        Warrior warrior1 = new Viking("Pablo");
        Warrior warrior2 = warrior1.clone();

        System.out.println(warrior1.getSquadName() + " " + warrior2.getSquadName());
        System.out.println("-------------------------------------------");

        warrior2.setSquadName("Truther");

        System.out.println(warrior1.getSquadName() + " " + warrior2.getSquadName());

    }
}
