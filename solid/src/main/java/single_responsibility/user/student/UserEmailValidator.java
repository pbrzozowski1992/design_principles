package single_responsibility.user.student;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEmailValidator implements EmailValidator {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    @Override
    public boolean validateEmail(User user) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail());
        return matcher.find();
    }
}
