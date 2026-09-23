import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void mustNotBeNullReturnsTrueIfPasswordNotNull() {
        String password = "Whatever";

        boolean actual = PasswordValidation.mustNotBeNull(password);

        assertTrue(actual);
    }


    @Test
    void isAtLeast8CharsLongReturnsTrue() {
        String password = "Password";
        boolean expected = true;

        boolean actual = PasswordValidation.isAtLeast8CharsLong(password);

        assertEquals(expected, actual);
    }


    @Test
    void isAtLeast8CharsLongReturnsFalse() {
        String password = "Pass";
        boolean expected = false;

        boolean actual = PasswordValidation.isAtLeast8CharsLong(password);

        assertEquals(expected, actual);
    }


    @Test
    void containsAtLeast1DigitReturnsTrue() {
        String password = "Password1";
        boolean expected = true;

        boolean actual = PasswordValidation.containsAtLeast1Digit(password);

        assertEquals(expected, actual);
    }


    @Test
    void containsAtLeast1LowerCaseLetterReturnsTrue() {
        String password = "password1";
        boolean expected = true;

        boolean actual = PasswordValidation.containsAtLeast1LowerCaseLetter(password);

        assertEquals(expected, actual);
    }


    @Test
    void containsAtLeast1UpperCaseLetterReturnsTrue() {
        String password = "Password1";
        boolean expected = true;

        boolean actual = PasswordValidation.containsAtLeast1UpperCaseLetter(password);

        assertEquals(expected, actual);
    }


    @Test
    void ifPasswordisCommonPasswordShouldReturnTrue() {
        String[] commonPasswords = {"password", "12345678", "qwerty123", "Password1", "admin123"};
        String password = "12345678";
        boolean expected = true;

        boolean actual = PasswordValidation.isCommonPassword(password);

        assertEquals(expected, actual);

    }


    // Test against common passwords as parameterized test
    //"run this test multiple times"
    @ParameterizedTest
    //"here is the data to use each time"
    @CsvSource({
            "password, true",
            "12345678, true",
            "qwerty123, true",
            "sfhkjssfSDFSD2332, false",
            "Password1 , true",
            "admin123 , true"
    })
    void ifPasswordIsCommonPasswordShouldReturnTrue(String password, boolean expected) {
        boolean actual = PasswordValidation.isCommonPassword(password);
        assertEquals(expected, actual);

    }


}

