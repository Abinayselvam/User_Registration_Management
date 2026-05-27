import java.util.regex.Pattern;

public class UserRegistration {
    //UseCase 3
    public boolean mailValidation(String email)
    {
        return Pattern.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$",
                email
        );

    }
}
