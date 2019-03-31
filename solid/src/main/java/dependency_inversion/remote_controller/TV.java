package dependency_inversion.remote_controller;

public class TV implements AudioInput {
    private int volumeLevel = 50;

    @Override
    public void volumeUp() {
        volumeLevel++;
        System.out.println("TV głośniej: " + volumeLevel);
    }

    @Override
    public void volumeDown() {
        volumeLevel--;
        System.out.println("TV ciszej: " + volumeLevel);
    }

    @Override
    public int getVolumeLevel() {
        return volumeLevel;
    }
}
