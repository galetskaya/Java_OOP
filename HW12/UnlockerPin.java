package HW12;

public class UnlockerPin implements Unlocker{

    private int pin; // на случай пин-кода

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public void unlockerConfirmation() {
        System.out.println("Ok PIN");;
    }

}
