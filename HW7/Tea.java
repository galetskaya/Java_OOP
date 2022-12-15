package HW7;

public class Tea extends HotDrink {
    private String taste;

    public Tea(String name, String type, String taste, int volume, int temperature) {
        super(name, type, volume, temperature);
        this.taste = taste;
    }

    public String toString() {
        return String.format("%s %s %s %d %d", name, type, taste, volume, temperature);
    }
}
