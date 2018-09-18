package interface_segregation.good;

public class TriathlonAthlete implements Swimmer, Cyclist, Runner {
    public void ride() {
        System.out.println("Start ridding a bike!");
    }

    public void run() {
        System.out.println("Start running!");
    }

    public void swim() {
        System.out.println("Start swimming!");
    }
}
