package creatures;

import Location.Grass;
import enums.Mood;
import interfaces.AnimalAction;


public class Donkey extends Creature implements AnimalAction {
    private boolean isHungry;
    public Donkey(String name, Mood mood) {
        super(name, mood);
        this.isHungry = calculateHungry(mood);
    }
    public boolean calculateHungry(Mood mood){
        switch (mood){
            case HAPPY:
                return false;
            case ANGRY:
                return true;
            case SAD:
                return true;
            case NEITRAL:
                return Math.random()<0.5;
            default:
                return false;
        }
    }
    public void eatGrass(Grass grass){
        if ((isHungry==true)&&(grass.height>1)&&(grass.dryOrNot==false)){
            grass.height -= 1;
            isHungry = false;
            mood = Mood.HAPPY;
            System.out.println(name + " ест зеленую травку");
        } else if(isHungry==true&&grass.height <= 1) {
            mood = Mood.ANGRY;
            System.out.println(name + " не может поесть травки, так как ему ее не хватило");
        } else if(isHungry==true&&grass.dryOrNot==true) {
            mood = Mood.ANGRY;
            System.out.println(name + " не может поесть травки, так как она сухая");
        } else if (isHungry==false) {
            System.out.println(name + " не голоден");
        }
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
