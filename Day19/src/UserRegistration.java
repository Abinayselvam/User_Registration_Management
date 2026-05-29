import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(
            String firstName)
            throws InvalidUserException {

        if (!Pattern.matches(
                "^[A-Z][a-zA-Z]{2,}$",
                firstName)) {

            throw new InvalidUserException(

                    InvalidUserException
                            .exceptionType
                            .Invalid_FirstName,

                    "Invalid First Name"
            );
        }

        return true;
    }

    public boolean validateLastName(
            String lastName)
            throws InvalidUserException {

        if (!Pattern.matches(
                "^[A-Z][a-zA-Z]{2,}$",
                lastName)) {

            throw new InvalidUserException(

                    InvalidUserException
                            .exceptionType
                            .Invalid_LastName,

                    "Invalid Last Name"
            );
        }

        return true;
    }

    public boolean validateEmail(
            String email)
            throws InvalidUserException {

        if (!Pattern.matches(

                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$",

                email)) {

            throw new InvalidUserException(

                    InvalidUserException
                            .exceptionType
                            .Invalid_Email,

                    "Invalid Email"
            );
        }

        return true;
    }

    public boolean validateMobile(
            String mobile)
            throws InvalidUserException {

        if (!Pattern.matches(
                "^[0-9]{2}\\s[0-9]{10}$",
                mobile)) {

            throw new InvalidUserException(

                    InvalidUserException
                            .exceptionType
                            .Invalid_Mobile,

                    "Invalid Mobile"
            );
        }

        return true;
    }

    public boolean validatePassword(
            String password)
            throws InvalidUserException {

        if (!Pattern.matches(

                "^(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*]*[!@#$%^&*][^!@#$%^&*]*$).{8,}$",

                password)) {

            throw new InvalidUserException(

                    InvalidUserException
                            .exceptionType
                            .Invalid_Password,

                    "Invalid Password"
            );
        }

        return true;
    }
}