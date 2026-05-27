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
    public boolean validateEmail(String email) {

        return Pattern.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$",
                email
        );
    }
    //UseCase 4
    public boolean mobileValidation(String number)
    {
        return Pattern.matches(   "^[0-9]{2}\\s[0-9]{10}$",number);
    }
}
