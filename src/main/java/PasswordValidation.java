public class PasswordValidation {
    public static void main(String[] args) {
    }


    public static boolean isAtLeast8CharsLong(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
