package open_closed.bad;

public enum Greetings {
    GERMAN(1), ENGLISH(2), FRENCH(3);

    private int id;

    Greetings(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
