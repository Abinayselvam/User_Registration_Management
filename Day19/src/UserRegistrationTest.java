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
                user.validateFirstName(
                        "Abinaya"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateFirstName(
                        "ab"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateFirstName(
                        "abinaya"
                )
        );
    }

    // UC2 Last Name

    @Test
    void lastNameValidation()
            throws InvalidUserException {

        assertTrue(
                user.validateLastName(
                        "Selvam"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateLastName(
                        "se"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateLastName(
                        "selvam"
                )
        );
    }

    // UC3 Email

    @Test
    void validateEmail()
            throws InvalidUserException {

        assertTrue(
                user.validateEmail(
                        "abc@yahoo.com"
                )
        );

        assertTrue(
                user.validateEmail(
                        "abc.100@gmail.com"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateEmail(
                        "abc@.com"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateEmail(
                        "abc@gmail"
                )
        );
    }

    // UC4 Mobile

    @Test
    void mobileValidation()
            throws InvalidUserException {

        assertTrue(
                user.validateMobile(
                        "91 9876543210"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateMobile(
                        "919876543210"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validateMobile(
                        "91 98765"
                )
        );
    }

    // UC5 Password

    @Test
    void validatePassword()
            throws InvalidUserException {

        assertTrue(
                user.validatePassword(
                        "Abinaya1@"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validatePassword(
                        "abinaya"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validatePassword(
                        "ABINAYA123"
                )
        );

        assertThrows(

                InvalidUserException.class,

                () -> user.validatePassword(
                        "Abinaya123"
                )
        );
    }
}