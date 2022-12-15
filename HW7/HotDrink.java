package HW7;

public class HotDrink {
    protected String name;
    protected String type;
    protected int volume;
    protected int temperature;

    public HotDrink(String name, String type, int volume, int temperature) {
        this.name = name;
        this.type = type;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getType (String type) {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public int getTemperature(int temperature) {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume(int volume) {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}


