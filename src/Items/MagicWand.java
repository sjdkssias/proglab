package Items;

import creatures.Person;
import enums.Color;

public class MagicWand extends Item{
    public MagicWand(String name, Person owner, Color color) {
        super(owner, name, color);
    }
}
