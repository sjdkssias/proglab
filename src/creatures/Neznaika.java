package creatures;

import enums.Mood;


public class Neznaika extends Person  {
    private boolean isBite;
    public Neznaika(String name, Mood mood) {
        super(name, mood);
        this.isBite = false;
    }
    @Override
    public void speak(Person person) {
        if (isBite==true){
            askForHelp(person);
            System.out.println("Как мне не нравятся эти ослы! - сказал Незнайка.");
        } else {
            switch (mood){
                case SAD -> System.out.println(name + " грустит, на ослов он даже не хочет смотреть.");
                case HAPPY -> System.out.println(name + "Говорит волшебнику, что таких интересных ослов он ни разу не видел.");
                case NEITRAL -> System.out.println("Ослы как ослы - говорит " + name);
            }
        }
    }
    public void sitWith(Person person) {
        System.out.println("Незнайка долго сидел на лавочке с " + person.getName() + "ом");
    }

    public void checkHealth(){
        if (hp<80){
            isBite = true;
        }
    }
    public void wasBited(Creature creature) {
        if (creature.getMood()==Mood.ANGRY) {
            hp -= 20;
            System.out.println("Незнайку покусал " + creature.getName() + ". Его здоровье уменьшилось.");
        }
    }

    private void askForHelp(Person person){
        System.out.println(name + " просит о помощи " + person.getName());
    }

    @Override
    public void go() {
        System.out.println(name + " прощается со всеми и уходит по делам.");
    }
}
