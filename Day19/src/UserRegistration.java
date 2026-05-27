import java.util.regex.Pattern;

public class UserRegistration {
    // UC5, UC6, UC7, UC8 Password Rules
    public boolean validatePassword(
            String password) {

        return Pattern.matches(
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*]*[!@#$%^&*][^!@#$%^&*]*$).{8,}$",
                password
        );
    }
}
