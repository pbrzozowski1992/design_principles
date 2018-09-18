package single_responsibility.student;

public class AgeValidatorUtil {

    public static boolean checkAge(int ageToValidate, int minAge, int maxAge){
        return ageToValidate >= minAge && ageToValidate <= maxAge;
    }
}
