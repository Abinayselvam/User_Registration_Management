import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    UserRegistration user =
            new UserRegistration();

    // UC1 First Name

    @Test
    void validateFirstName()
            throws InvalidUserException {

        assertTrue(
                user.validateFirstName.validate(
                        "Abinaya"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateFirstName.validate(
                        "ab"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateFirstName.validate(
                        "abinaya"
                )
        );
    }

    // UC2 Last Name

    @Test
    void lastNameValidation()
            throws InvalidUserException {

        assertTrue(
                user.validateLastName.validate(
                        "Selvam"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateLastName.validate(
                        "se"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateLastName.validate(
                        "selvam"
                )
        );
    }

    // UC3 Email

    @Test
    void validateEmail()
            throws InvalidUserException {

        assertTrue(
                user.validateEmail.validate(
                        "abc@yahoo.com"
                )
        );

        assertTrue(
                user.validateEmail.validate(
                        "abc.100@gmail.com"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateEmail.validate(
                        "abc@.com"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateEmail.validate(
                        "abc@gmail"
                )
        );
    }

    // UC4 Mobile

    @Test
    void mobileValidation()
            throws InvalidUserException {

        assertTrue(
                user.validateMobile.validate(
                        "91 9876543210"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateMobile.validate(
                        "919876543210"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateMobile.validate(
                        "91 98765"
                )
        );
    }

    // UC5 Password

    @Test
    void validatePassword()
            throws InvalidUserException {

        assertTrue(
                user.validatePassword.validate(
                        "Abinaya1@"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validatePassword.validate(
                        "abinaya"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validatePassword.validate(
                        "ABINAYA123"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validatePassword.validate(
                        "Abinaya123"
                )
        );
    }
}