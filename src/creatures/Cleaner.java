package creatures;


import Items.Item;
import enums.Mood;
import interfaces.Cleanable;
import interfaces.Wearable;

public class Cleaner extends Person implements  Cleanable, Wearable {
    public Cleaner(String name, Mood mood) {
        super(name, mood);
    }

    @Override
    public void speak(Person person) {
        System.out.println("Как же тут грязно! - сказала она волшебнику");
    }

    @Override
    public void wear(Item item) {
        System.out.println("На ней надет " + item.color.getDescriptionColor() + " платок" );
    }

    @Override
    public void go() {
        System.out.println("Следом идет " + name);
    }


    @Override
    public void sweep(Item item) {
        System.out.println(name + " подходит к лавочке.");
        switch (mood){
            case ANGRY -> System.out.println("Начинает отчитывать героев за беспорядок. С помощью " + item.getName() + " подметает территорию");
            case HAPPY -> System.out.println(name + " радостно здоровается с героями. С помощью " + item.getName() + " подметает территорию");
            case NEITRAL -> System.out.println(name + " с помощью " + item.getName() + " подметает территорию");
            case SAD -> System.out.println(name + " говорит : 'Не хочу ничего подметать. Настроения нет!'");
        }
    }

    @Override
    public void wipe() {

    }
    public void reactToFocus(Item item){
        System.out.println("Уборщица говорит: теперь мой " + item.getName() + " приобрел " + item.getColor().getDescriptionColor() + " цвет");
    }
}
