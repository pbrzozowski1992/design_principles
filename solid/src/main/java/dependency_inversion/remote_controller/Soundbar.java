package dependency_inversion.remote_controller;

public class Soundbar implements AudioInput {
    private int volumeLevel = 50;

    @Override
    public void volumeUp() {
        volumeLevel+=5;
        System.out.println("Soundbar głośniej: " + volumeLevel);
    }

    @Override
    public void volumeDown() {
        volumeLevel-=5;
        System.out.println("Soundbar ciszej: " + volumeLevel);
    }

    @Override
    public int getVolumeLevel() {
        return volumeLevel;
    }
}
