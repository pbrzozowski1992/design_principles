package open_closed.bad;

public class Airport {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        for (Greetings greetings : Greetings.values()) {
            greeter.setGreetings(greetings);
            greeter.greet();
        }
    }
}
