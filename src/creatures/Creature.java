package creatures;

import enums.Mood;

import java.util.Objects;

public abstract class Creature {
    protected String name;
    protected Mood mood;
    protected int hp;
    public Creature(String name, Mood mood) {
        this.name = name;
        this.mood = mood;
        this.hp = 80;

    }

    public String getName() {
        return name;
    }
    public Mood getMood() {
        return mood;
    }
    public abstract void go();
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Creature creature = (Creature) obj;
        return Objects.equals(name, creature.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "'}";
    }
}
