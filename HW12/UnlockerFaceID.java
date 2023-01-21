package HW12;

public class UnlockerFaceID implements Unlocker{
    private String faceID; // на случай лица

    public void setFaceID(String faceID) {
        this.faceID = faceID;
    }


    @Override
    public void unlockerConfirmation() {
        System.out.println("Face ID OK");;
    }
}
