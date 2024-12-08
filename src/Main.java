import Items.Broom;
import Items.Handkerchief;
import Location.Bench;
import Location.Grass;
import Location.Meadow;
import Location.Tree;
import creatures.*;
import enums.Color;
import enums.Mood;
import enums.Weather;

import java.util.ArrayList;

public static void main(String[] args) {

    Donkey donkey1 = new Donkey("Первый Осёл", Mood.getRandomMood());
    Donkey donkey2 = new Donkey("Второй Осёл", Mood.getRandomMood());
    Mool mool = new Mool("Ишак", Mood.getRandomMood());
    Cleaner cleaner = new Cleaner("Уборщица", Mood.getRandomMood());
    Neznaika neznaika = new Neznaika("Незнайка", Mood.getRandomMood());
    Wizard wizard = new Wizard("Волшебник", Mood.getRandomMood());
    Weather rr = Weather.getRandomWeather();
    Meadow meadow = new Meadow(20);
    Bench bench = new Bench(2);
    Tree tree = new Tree("Ель", 20);
    Grass grass = new Grass(rr);
    Handkerchief handkerchief = new Handkerchief("платок", cleaner, Color.getRandomColor());
    Broom broom = new Broom("метла", cleaner, Color.getRandomColor());
    meadow.describeMeadow();
    bench.describeBench();
    tree.description();
    neznaika.sitOnBench(bench);
    wizard.sitOnBench(bench);
    neznaika.sitWith(wizard);
    wizard.reaction(rr);

    ArrayList<Donkey> creatures = new ArrayList<>();
    creatures.add(donkey1);
    creatures.add(donkey2);
    creatures.add(mool);
    System.out.print("\nВ это время на дорожке показались ");
    for (Donkey creature : creatures){
        System.out.print(creature.getName() + " ");
    }
    System.out.println();
    cleaner.go();
    cleaner.wear(handkerchief);
    for (Donkey creature: creatures){
        creature.go();
    }
    for (Donkey creature : creatures){
        creature.eatGrass(grass);
    }
    for (Donkey creature : creatures){
        creature.bite(neznaika);
    }
    for (Donkey creature : creatures){
        neznaika.wasBited(creature);
    }
    neznaika.checkHealth();
    neznaika.speak(wizard);
    wizard.speak(neznaika);
    wizard.treat(neznaika);
    cleaner.sweep(broom);
    cleaner.speak(wizard);
    cleaner.sitOnBench(bench);
    wizard.showFocus(handkerchief);
    cleaner.reactToFocus(handkerchief);
    wizard.leaveBench(bench);
    neznaika.leaveBench(bench);
    //персонажи уходят
    wizard.go();
    neznaika.go();
    System.out.println("\nИстория подошла к концу. Все герои разошлись , а на лугу cнова стало спокойно.");
}