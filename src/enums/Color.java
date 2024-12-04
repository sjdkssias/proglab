package enums;

public enum Color {
    WHITE("белый"), BLUE("голубой"), RED("красный"), GREEN("зеленый"), PINK("розовый"), FIOL("фиолетовый"), YELLOW("жёлтый"), BLACK("черный");
    public static Color getRandomColor() {
        Color[] colors = values();
        return colors[(int) (Math.random() * colors.length)];
    }
    private String description;

    Color(String description) {
        this.description = description;
    }
    public String getDescriptionColor() {
        return description;
    }
}
