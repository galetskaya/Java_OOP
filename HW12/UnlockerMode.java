package HW12;

public class UnlockerMode implements Unlocker{

    private int mode; // режим

    public void setMode(int mode) {
        this.mode = mode;
    }

    @Override
    public void unlockerConfirmation() {
        System.out.println("Ok Mode");;
    }
}
