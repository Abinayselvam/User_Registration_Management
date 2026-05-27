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
    //UserCase2
    public boolean lastNameValidation(String lastName)
    {
        return Pattern.matches(
                "^[A-Z][a-zA-Z]{2,}$",
                lastName
        );
    }



}
