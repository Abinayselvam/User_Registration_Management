import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    UserRegistration user = new UserRegistration();

    // UC1 - First Name
    @Test
    void validateFirstName() {

        assertTrue(user.validateFirstName("Abinaya"));
        assertFalse(user.validateFirstName("ab"));
        assertFalse(user.validateFirstName("abinaya"));
    }

    // UC2 - Last Name
    @Test
    void lastNameValidation() {

        assertTrue(user.lastNameValidation("Selvam"));
        assertFalse(user.lastNameValidation("se"));
        assertFalse(user.lastNameValidation("selvam"));
    }

    // UC3 - Email
    @Test
    void validateEmail() {

        assertTrue(user.validateEmail("abc@yahoo.com"));
        assertTrue(user.validateEmail("abc.100@gmail.com"));

        assertFalse(user.validateEmail("abc@.com"));
        assertFalse(user.validateEmail("abc@gmail"));
    }

    // UC4 - Mobile
    @Test
    void mobileValidation() {

        assertTrue(user.mobileValidation("91 9876543210"));
        assertFalse(user.mobileValidation("919876543210"));
        assertFalse(user.mobileValidation("91 98765"));
    }

    // UC5 - Password
    @Test
    void validatePassword() {

        assertTrue(user.validatePassword("Abinaya1@"));

        assertFalse(user.validatePassword("abinaya"));
        assertFalse(user.validatePassword("ABINAYA123"));
        assertFalse(user.validatePassword("Abinaya123")); // no special char
    }
}