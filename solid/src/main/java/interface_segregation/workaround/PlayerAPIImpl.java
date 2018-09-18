package interface_segregation.workaround;

public class PlayerAPIImpl extends PlayerAPIAbst {
    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }
}
