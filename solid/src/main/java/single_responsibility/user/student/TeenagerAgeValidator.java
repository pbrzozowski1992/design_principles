package single_responsibility.user.student;

public class TeenagerAgeValidator implements AgeValidator {
    @Override
    public boolean checkAge(User user) {
        return user.getAge()>= 13 && user.getAge() < 18;
    }
}
