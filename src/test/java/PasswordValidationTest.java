import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void isAtLeast8CharsLongReturnsTrue() {
        String password = "Password";
        boolean expected = true;

        boolean actual = PasswordValidation.isAtLeast8CharsLong(password);

        assertEquals(expected, actual);

    }
}

