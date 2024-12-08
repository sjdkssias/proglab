package Location;
import enums.Weather;
import enums.Color;

public class Grass{
    private Color color;
    public int height;
    public boolean dryOrNot;
    private Weather weather;
    public Grass(Weather weather) {
        this.weather = weather;
        this.color = Color.GREEN;
        this.height = 3;
        this.dryOrNot = isDry(weather);
    }
    private boolean isDry(Weather weather){
        if (weather == Weather.SUNNY){
            return true;
        } else {
            return false;
        }
    }
}
