package enums;

public enum Weather {
    SUNNY, CLOUDY, WINDY;
    public static Weather getRandomWeather() {
        Weather[] weathers = values();
        return weathers[(int) (Math.random() * weathers.length)];
    }
}
