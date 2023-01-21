package HW12;

public class UnlockerFingerprint implements Unlocker{

    private String fingerprint; // на случай отпечатка пальца

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }


    @Override
    public void unlockerConfirmation() {
        System.out.println("Finger Print OK");;
    }
}
