package open_closed.bad;

public class Greeter {
    private Greetings greetings;

    public void greet() {
        switch (greetings.getId()) {
            case 1:
                showGermanGreetings();
                break;
            case 2:
                showEnglishGreetings();
                break;
            case 3:
                showFrenchGreetings();
                break;
        }
    }

    private void showGermanGreetings() {
        System.out.println("Guten tag!");
    }

    private void showEnglishGreetings() {
        System.out.println("Good morning!");
    }

    private void showFrenchGreetings() {
        System.out.println("Bonjour!");
    }

    public void setGreetings(Greetings greetings) {
        this.greetings = greetings;
    }
}
