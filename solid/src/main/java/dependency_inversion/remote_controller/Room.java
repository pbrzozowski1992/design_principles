package dependency_inversion.remote_controller;

public class Room {

    public static void main(String[] args) {
        AudioInput audioInput = new Soundbar();
        Phone phone = new Phone(audioInput);
        phone.changeVolumeLevel(60);
    }
}
