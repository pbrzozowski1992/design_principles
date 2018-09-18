package interface_segregation.bad;

public class OlimpicGames {
    public static void main(String[] args) {
        Athlete athletes[] = {new TriathlonAthlete(), new HighJumperAthlete()};
        for (Athlete athlete : athletes) {
            System.out.println("Athlete: " + athlete.getClass().getSimpleName());
            athlete.run();
            athlete.ride();
            athlete.swim();
            athlete.highJump();
            athlete.longJump();
        }
    }
}

