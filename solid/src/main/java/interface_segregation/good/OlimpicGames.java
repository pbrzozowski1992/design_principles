package interface_segregation.good;

public class OlimpicGames {

    public static void main(String[] args) {
        TriathlonAthlete triathlonAthlete = new TriathlonAthlete();
        triathlonAthlete.swim();
        triathlonAthlete.ride();
        triathlonAthlete.run();
        HighJumperAthlete highJumperAthlete = new HighJumperAthlete();
        highJumperAthlete.highJump();
    }
}
