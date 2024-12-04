package creatures;

import Items.Item;
import enums.Color;
import enums.Mood;
import enums.Weather;
import interfaces.Magic;


public class Wizard extends Person implements Magic {
    private boolean hasWand;
    public Wizard(String name, Mood mood) {
        super(name, mood);
        this.hasWand = true;
    }
    public void reaction(Weather weather){
        if (weather==Weather.WINDY){
            hasWand = false;
            System.out.println("Вдруг " + name + " теряет свою волшебную палочку из-за ветра");
            switch (mood){
                case HAPPY -> System.out.println("Он говорит: 'да ладно. И без нее справлюсь с магией'");
                case ANGRY -> System.out.println("Волшебник злится и проклинает погоду");
                case SAD -> System.out.println("'Как жаль. Ведь это был подарок от моих родителей'-сказал он");
                case NEITRAL -> System.out.println("Ну ничего - сказал Волшебник");
            }
        } else if (weather==Weather.CLOUDY) {
            System.out.println(name + " говорит: 'Как же сегодня облачно!'");

        } else if (weather==Weather.SUNNY) {
            if (mood == Mood.ANGRY){
                System.out.println(name + " говорит: 'Как же солнечно! Аж противно!'");
            } else if (mood == Mood.HAPPY) {
                System.out.println(name + " говорит: 'Как же солнечно! Чудесная погода!'");
            } else {
                System.out.println(name + " говорит: 'Как же солнечно..... Жаль настроения нет.'");
            }
        }
    }

    @Override
    public void speak(Person person) {

        System.out.println("Я тебя понимаю! - отвечает Волшебник");
    }

    @Override
    public void go() {
        System.out.println(name + " после этого необычного дня направляется домой");
    }

    @Override
    public void treat(Person person) {
        if (person.hp < 80) {
            person.hp += 25;
            System.out.println("Волшебник с помощью магии лечит " + person.getName());
        }
    }

    @Override
    public void showFocus(Item item) {
        if (mood==mood.ANGRY&&item.color!=Color.BLACK){
            item.setColor(Color.BLACK);
            System.out.println("Как вдруг волшебник решил изменить цвет " + item.getName() + " и поменял его на чёрный из-за своего плохого настроения. ");
        } else if (mood == mood.SAD&&item.color!=Color.BLUE) {
            item.setColor(Color.BLUE);
            System.out.println("Как вдруг волшебник решил изменить цвет " + item.getName() + " и поменял его на голубой из-за своего грустного настроения.");
        } else if (item.color!=Color.YELLOW&&mood==Mood.HAPPY){
            item.setColor(Color.YELLOW);
            System.out.println("Как вдруг волшебник решил изменить цвет " + item.getName() + " и поменял его на жёлтый из-за своего хорошего настроения, так как это его любимый цвет.");
        } else if (item.color!=Color.PINK){
            item.setColor(Color.PINK);
            System.out.println("Как вдруг волшебник решил изменить цвет " + item.getName() + " и поменял его на розовый из-за своего хорошего настроения, чтобы порадовать других таким ярким фокусом.");
        }
    }

}
