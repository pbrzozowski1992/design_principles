package open_closed.good;

public class Greeter {
    public Greetings greetings;

    public void greet() {
        greetings.greet();
    }

    public void setGreetings(Greetings greetings) {
        this.greetings = greetings;
    }
}
