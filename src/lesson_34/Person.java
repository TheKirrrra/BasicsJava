package lesson_34;

public class Person {

    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }
    /*
    1. @ присутствует и только одна.
    2. Точка после @.
    3. После последней точки 2 или больше символов
    4. Английский алфавит, цифры,'_','-','.','@'
    5. До собаки должен быть мин 1 символ.
     */

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    private boolean isEmailValid(String email) {
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        if (email.indexOf('.', indexAt) == -1) return false;

        if (email.lastIndexOf('.') >= email.length()-2) return false;

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '.' || c == '-' || c == '@')) {
                return false;
            }
        }
        if (email.indexOf('@') == 0) return false;

            return true;

    }

    public String getPassword() {
        return password;
    }
    /*
    1. длина >= 8
    2. мин 1 цифра
    3. мин 1 маленькая
    4. мин 1 большая
    5. мин 1 спец символ ("!%@$&")
     */

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    private boolean isPasswordValid(String password) {
        if (password.length() < 8) return false;
        boolean indexUC = false;
        boolean indexLC = false;
        boolean indexDigit = false;
        boolean indexSymbol = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                indexUC = true;
            }
            if (Character.isLowerCase(c)) {
                indexLC = true;
            }
            if (Character.isDigit(c)) {
                indexDigit = true;
            }
            if (c == '!' || c == '%' || c == '@' || c == '$' || c == '&') {
                indexSymbol = true;
            }

        }
        return indexUC && indexLC && indexDigit && indexSymbol;
    }


    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }
}
