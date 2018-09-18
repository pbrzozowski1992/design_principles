package interface_segregation.bad;

public class TriathlonAthlete implements Athlete {

    public void run() {
        System.out.println("Start running!");
    }

    public void ride() {
        System.out.println("Start biking!");
    }

    public void swim() {
        System.out.println("Start swimming!");
    }

    public void highJump() {

    }

    public void longJump() {

    }
}
