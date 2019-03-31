package single_responsibility.user.student;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("Piotr", "pb@wp.pl", 13);
        AgeValidator ageValidator = new TeenagerAgeValidator();
        System.out.println("Sprawdzamy wiek: " + ageValidator.checkAge(user));
    }
}
