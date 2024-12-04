package Items;

import creatures.Person;
import enums.Color;

public abstract class Item {
    public Color color;
    protected String name;
    protected Person owner;

    public Item(Person owner, String name, Color color) {
        this.owner = owner;
        this.color = color;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
}
