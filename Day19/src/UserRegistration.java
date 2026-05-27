import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateEmail(String email) {

        return Pattern.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$",
                email
        );
    }
}
