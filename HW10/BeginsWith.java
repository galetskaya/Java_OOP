package HW10;

public class BeginsWith implements IsGood<String> {

    private String item;
    public BeginsWith(String item) {
        this.item = item;
    }

    @Override
    public boolean isGood(String arg) {
        return arg.startsWith(item);
    }
}
