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
    //UseCase 3
    public boolean mailValidation(String email)
    {
        return Pattern.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$",
                email
        );

    }



}
