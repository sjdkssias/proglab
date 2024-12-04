package interfaces;

import Items.Item;
import creatures.Creature;
import creatures.Person;

public interface Magic {
    public void treat(Person person);
    public void showFocus(Item item);
}
