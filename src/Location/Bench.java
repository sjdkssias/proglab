package Location;

import creatures.Person;
import exceptions.NoSpace;

import java.util.Arrays;

public class Bench {
    private final Person[] seats;

    public Bench(int numberOfSeats) {
        this.seats = new Person[numberOfSeats];
        Arrays.fill(this.seats, null);
    }


    public boolean leave(Person person) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null && seats[i].equals(person)) {
                seats[i] = null;
                System.out.println(person.getName() + " освободил(а) место " + (i + 1) + " на лавочке.");
                return true;
            }
        }
        System.out.println(person.getName() + " не занимает лавочку.");
        return false;
    }
    public void describeBench(){
        System.out.println("\nМы можем увидеть здесь лавочку.");
    }
    public void sitEx(Person person) throws NoSpace {
        if (!sit(person)) {
            throw new NoSpace(person.getName());
        }
    }

    private boolean sit(Person person) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                seats[i] = person;
                return true;
            }
        }
        return false;
    }
}

