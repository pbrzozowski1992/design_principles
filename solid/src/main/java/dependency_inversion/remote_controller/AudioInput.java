package dependency_inversion.remote_controller;

public interface AudioInput {

    void volumeUp();
    void volumeDown();
    int getVolumeLevel();
}
