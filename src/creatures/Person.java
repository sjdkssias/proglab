package creatures;

import Location.Bench;
import enums.Mood;
import exceptions.NoSpace;

public abstract class Person extends Creature {
    public Person(String name, Mood mood) {
        super(name, mood);
    }
    public abstract void speak(Person person);

    public void sitOnBench(Bench bench) {
        try {
            bench.sitEx(this);
            System.out.println(getName() + " сел на лавочку.");
        } catch (NoSpace e) {
            System.out.println(e.getMessage());
        }
    }

    public void leaveBench(Bench bench) {
        System.out.println(getName() + " встал с лавочки.");
    }

}
