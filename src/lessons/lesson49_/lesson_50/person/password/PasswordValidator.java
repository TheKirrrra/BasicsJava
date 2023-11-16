package lessons.lesson49_.lesson_50.person.password;

public class PasswordValidator {
    public static void validate (String password) throws PasswordValidateException {
        // 1. длина 8 символов и более
        if (password.length() < 8) throw new PasswordValidateException("Length error");

        // 2. Наличие одного upper case
        if (!containsUpperCase(password)) throw new PasswordValidateException("UpperCase error");
        // 3. Наличие одного lower case
        if (!containsLowerCase(password)) throw new PasswordValidateException("LowerCase error");
        // 4. наличие цифры
        if (!containsDigit(password)) throw new PasswordValidateException("Digit error");
        // 5. наличие спец символа +#$%^&*
        if (!containSpecSymbols(password)) throw new PasswordValidateException("Special Symbol error");

    }
    private static boolean containsUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
    private static boolean containsLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    private static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    private static boolean containSpecSymbols(String password) {
        String specialCharacters = "+#$%^&*";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
