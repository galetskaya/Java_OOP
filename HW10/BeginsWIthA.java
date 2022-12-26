package HW10;

public class BeginsWIthA implements IsGood<String>{

    @Override
    public boolean isGood(String arg) {
        return arg.startsWith("A");
    }
}
