package interface_segregation.bad;

public class HighJumperAthlete implements Athlete {

    public void run() {

    }

    public void ride() {

    }

    public void swim() {

    }

    public void highJump() {
        System.out.println("Start high jump!");
    }

    public void longJump() {

    }
}
