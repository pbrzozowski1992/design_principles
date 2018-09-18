package open_closed.good;

public class Airport {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greetings greetingsArray[] = {new EnglishGreetings(),
                new GermanGreetings(),
                new FrenchGreetings()};
        for (Greetings greetings : greetingsArray) {
            greeter.setGreetings(greetings);
            greeter.greet();
        }
    }
}
