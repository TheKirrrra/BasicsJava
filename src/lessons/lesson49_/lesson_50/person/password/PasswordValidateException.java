package lessons.lesson49_.lesson_50.person.password;

public class PasswordValidateException extends Exception{
    public PasswordValidateException(String message) { super(message); }

    public String getMessage() {
        return "Password validate exception | " +  super.getMessage();
    }

}
