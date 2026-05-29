import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationParameterizedTest {

    UserRegistration user =
            new UserRegistration();

    @ParameterizedTest
    @ValueSource(strings = {

            "abc@yahoo.com",
            "abc111@abc.com",
            "abc@gmail.com.com"
    })

    void givenValidEmails_ShouldReturnTrue(
            String email)

            throws InvalidUserException {

        assertTrue(
                user.validateEmail(email)
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {

            "abc",
            "abc@.com",
            ".abc@gmail.com",
            "abc..2002@gmail.com"
    })

    void givenInvalidEmails_ShouldThrowException(
            String email) {

        assertThrows(

                InvalidUserException.class,

                () -> user.validateEmail(email)
        );
    }
}