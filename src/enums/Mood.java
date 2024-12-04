package enums;

import creatures.Creature;

public enum Mood {
    HAPPY("радуется"),
    SAD("грустит"),
    ANGRY("злится"),
    NEITRAL("нейтрален");

    public static Mood getRandomMood() {
        Mood[] moods = values();
        return moods[(int) (Math.random() * moods.length)];
    }
    private String description;

    Mood(String description) {
        this.description = description;
    }

    public String getDescription(Creature creature) {
        return creature.getName() + description;
    }
}