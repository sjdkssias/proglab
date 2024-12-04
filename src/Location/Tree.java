package Location;

public record Tree(String type, int heightmetr) {
    public void description() {
        if (heightmetr > 15) {
            System.out.println("Также тут стоит высокое дерево породы " + type + ".");
        }
        else {
            System.out.println("Также стоит дерево среднего размера породы " + type + ".");
        }
    }
}
