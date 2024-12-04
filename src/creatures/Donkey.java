package creatures;

import enums.Mood;
import interfaces.AnimalAction;


public class Donkey extends Creature implements AnimalAction {
    public Donkey(String name, Mood mood) {
        super(name, mood);
    }

    @Override
    public void bite(Creature creature) {
        switch (mood) {
            case ANGRY -> System.out.println(name + " пытается укусить " + creature.getName());
            case SAD -> System.out.println(name + " не в настроении кого-то кусать");
            case HAPPY -> System.out.println(name + " не кусается");
            case NEITRAL -> System.out.println(name + " не кусается");
        }
    }

    @Override
    public void go() {
        switch (mood) {
            case HAPPY -> System.out.println(name + " весело идет, постукивая копытцами.");
            case ANGRY -> System.out.println(name + " сердито идет, стуча копытами.");
            case SAD -> System.out.println(name + " тихонько идет, опустив голову.");
            case NEITRAL -> System.out.println(name + " идет в спокойном темпе.");
        }
    }

    @Override
    public void wiggle() {
        switch (mood) {
            case HAPPY -> System.out.println("Резво шевелит ушами.");
            case ANGRY -> System.out.println("От злости оттопырил уши назад.");
            case SAD -> System.out.println("Грустно опустил уши.");
            case NEITRAL -> System.out.println("Незаметно для других шевелит ушами");
        }
    }
}
