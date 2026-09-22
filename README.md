Mandatory criteria (baseline):

- at least 8 characters,
- at least one digit (0–9),
- uppercase and lowercase letters (both must be present),
- not included in a list of common/weak passwords.

Optional (bonus policy):

- at least one special character (define allowed set),
- minimum number of distinct character groups (e.g., 3 out of 4: uppercase, lowercase, digit, special character).

public final class PasswordValidator {

public static boolean isAtLeast8CharsLong (String password, int min);  
public static boolean containsAtLeast1Digit (String password);  
public static boolean containsAtLeast1UpperCaseLetter (String password);  
public static boolean containsAtLeast1LowerCaseLetter (String password);
public static boolean isCommonPassword (String password);  
// short internal list with common passwords

// Bonus:  
public static boolean containsSpecialChar (String password, String allowed);  
// Optional overview:  
public static boolean isValid (String password);  
// uses all checks above
}




