import org.w3c.dom.ls.LSOutput;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "adfjjnJRFHn3737";

        //System.out.println(mustNotBeNull(password));
        System.out.println(isPasswordValidWithErrorMessages(password));


    }

    public static boolean mustNotBeNull(String password) {
        if (password == null) {
            return false;
        }
        return true;
    }

    public static boolean isAtLeast8CharsLong(String password1) {
        if (password1.trim().length() >= 8) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean containsAtLeast1Digit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }

        }
        return false;
    }


    public static boolean containsAtLeast1LowerCaseLetter(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsAtLeast1UpperCaseLetter(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }


    public static boolean isCommonPassword(String ben) {
        String[] commonPasswords = {"password", "12345678", "qwerty123", "Password1", "admin123"};

        for (String i : commonPasswords) {
            if (ben.equals(i)) {
                return true;
            }

        }
        return false;

    }


    public static String isPasswordValid(String password) {
        String validPassword = "This password is valid.";
        String invalidPassword = "This password is invalid.";


        if (mustNotBeNull(password) == true
                && isAtLeast8CharsLong(password) == true
                && containsAtLeast1Digit(password) == true
                && containsAtLeast1LowerCaseLetter(password) == true
                && containsAtLeast1UpperCaseLetter(password) == true
                && isCommonPassword(password) == false) {
            return validPassword;
        } else {
            return invalidPassword;
        }
    }


    public static String isPasswordValidWithErrorMessages(String password) {
        String passwordTooShort = " Password doesn't contain at least 8 characters.";
        String passwordWithoutDigit = " Password doesn't contain at least one digit.";
        String passwordWithoutLowercaseLetter = " Password doesn't contain at least one lowercase letter.";
        String passwordWithoutUppercaseLetter = " Password doesn't contain at least one uppercase letter.";
        String passwordIsCommonPassword = " Password is too common.";
        String errors = "";


        if (password == null) {
            return "Password must not be null.";
        }

        if (!isAtLeast8CharsLong(password)) {
            errors += passwordTooShort;
        }

        if (!containsAtLeast1Digit(password)) {
            errors += passwordWithoutDigit;
        }

        if (!containsAtLeast1LowerCaseLetter(password)) {
            errors += passwordWithoutLowercaseLetter;
        }

        if (!containsAtLeast1UpperCaseLetter(password)) {
            errors += passwordWithoutUppercaseLetter;
        }

        if (isCommonPassword(password)) {
            errors += passwordIsCommonPassword;
        }

        if (errors == "") {
            return "This password is valid.";
        }
        return "This password is invalid." + errors;
    }

}
