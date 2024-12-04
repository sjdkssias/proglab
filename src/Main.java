import Items.Broom;
import Items.Handkerchief;
import Location.Bench;
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
    Meadow meadow = new Meadow(20);
    Bench bench = new Bench(2);
    Tree tree = new Tree("Ель", 20);
    Weather rr = Weather.getRandomWeather();
    Handkerchief handkerchief = new Handkerchief("платок", cleaner, Color.getRandomColor());
    Broom broom = new Broom("метла", cleaner, Color.getRandomColor());
    meadow.describeMeadow();
    bench.describeBench();
    tree.description();
    neznaika.sitOnBench(bench);
    wizard.sitOnBench(bench);
    neznaika.sitWith(wizard);
    wizard.reaction(rr);

    ArrayList<Creature> creatures = new ArrayList<>();
    creatures.add(donkey1);
    creatures.add(donkey2);
    creatures.add(mool);
    System.out.print("\nВ это время на дорожке показались ");
    for (Creature creature : creatures){
        System.out.print(creature.getName() + " ");
    }
    System.out.println();
    cleaner.go();
    cleaner.wear(handkerchief);
    donkey1.go();
    donkey2.go();
    mool.go();
    donkey1.bite(neznaika);
    donkey2.bite(neznaika);
    mool.bite(neznaika);
    neznaika.wasBited(donkey1);
    neznaika.wasBited(donkey2);
    neznaika.wasBited(mool);
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
    System.out.println("\nИстория подошла к концу. Все герои разошлись , а на лугу нова стала спокойно.");
}