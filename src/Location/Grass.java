package Location;
import enums.Weather;
import enums.Color;

public class Grass {
    private Color color;
    public int height;

    public Grass() {
        this.color = Color.GREEN;
        this.height = 2;
    }
    private boolean isDry(Weather weather){
        if (weather == Weather.SUNNY){
            return true;
        } else {
            return false;
        }
    }
}
