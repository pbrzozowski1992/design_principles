package dependency_inversion.remote_controller;

public class Phone {
    private AudioInput audioInput;

    public Phone(AudioInput audioInput) {
        this.audioInput = audioInput;
    }


    public void changeVolumeLevel(int volumeLevel) {
        if (audioInput.getVolumeLevel() > volumeLevel) {
            //ciszej
            while (audioInput.getVolumeLevel()>volumeLevel) {
                audioInput.volumeDown();
            }
        } else {
            //głośniej
            while (audioInput.getVolumeLevel() < volumeLevel) {
                audioInput.volumeUp();
            }
        }
    }
}
