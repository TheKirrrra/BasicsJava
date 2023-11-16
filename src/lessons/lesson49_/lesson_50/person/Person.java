package lessons.lesson49_.lesson_50.person;

import lessons.lesson49_.lesson_50.person.email.EmailValidateException;
import lessons.lesson49_.lesson_50.person.email.EmailValidator;
import lessons.lesson49_.lesson_50.person.password.PasswordValidateException;
import lessons.lesson49_.lesson_50.person.password.PasswordValidator;

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

    public void setEmail(String email) {
        try {
            EmailValidator.validate(email);
            System.out.println("Email прошел проверку");
            this.email = email;
        } catch (EmailValidateException e) {
            System.out.println("Email НЕ прошел проверку");
            e.printStackTrace();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            PasswordValidator.validate(password);
            System.out.println("Password прошел проверку");
            this.password = password;
        } catch (PasswordValidateException p) {
            System.err.println("Password НЕ прошел проверку");
            p.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }
}
