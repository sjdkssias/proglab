package exceptions;

public class NoSpace extends Exception{
    // Конструктор принимает имя персонажа, для которого не нашлось места
    public NoSpace(String person) {
        super("Нет свободного места на лавочке для " + person + ".");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
