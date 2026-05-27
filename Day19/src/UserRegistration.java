import java.util.regex.Pattern;

public class UserRegistration {
    public boolean mobileValidation(String number)
    {
        return Pattern.matches(   "^[0-9]{2}\\s[0-9]{10}$",number);
    }
}
