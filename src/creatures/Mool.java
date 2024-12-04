package creatures;

import enums.Mood;
import interfaces.AnimalAction;

public class Mool extends Donkey implements AnimalAction {
    private boolean hybrid ;
    public Mool(String name, Mood mood  ) {
        super(name, mood);
        this.hybrid = true;
    }

    @Override
    public void bite(Creature creature) {
        super.bite(creature);
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void wiggle() {
        super.wiggle();
    }
}
