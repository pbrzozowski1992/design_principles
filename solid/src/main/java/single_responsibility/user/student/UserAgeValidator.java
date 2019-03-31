package single_responsibility.user.student;

public class UserAgeValidator implements AgeValidator {

    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 65;

    @Override
    public boolean checkAge(User user) {
        return user.getAge() >= MIN_AGE && user.getAge() <= MAX_AGE;
    }
}
