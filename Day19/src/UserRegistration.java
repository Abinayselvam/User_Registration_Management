import java.util.regex.Pattern;

public class UserRegistration {
    //UserCase 1
    public boolean validateFirstName(String firstName)
    {
        return Pattern.matches(
                "^[A-Z][a-zA-Z]{2,}$",
                firstName
        );
    }
}
