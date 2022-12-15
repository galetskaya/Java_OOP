package HW7;

public class HotChocolate extends HotDrink {

    public HotChocolate (String name, String type, int volume, int temperature) {
        super(name, type, volume, temperature);
    }

    public String toString() {
        return String.format("%s %s %d %d", name, type, volume, temperature);
    }

}
