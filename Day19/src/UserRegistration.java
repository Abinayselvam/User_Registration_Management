import java.util.regex.Pattern;

public class UserRegistration {
    public boolean lastNameValidation(String lastName)
    {
        return Pattern.matches(
                "^[A-Z][a-zA-Z]{2,}$",
                lastName
        );
    }
}
