package lesson_34;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person ("kirrra007@gmail.com", "qwert");
        System.out.println(person);
        person.setEmail("email");

        String test = "01@345689.de";
        System.out.println(person);
        person.setEmail("kirrra007@gmail.ua");
        System.out.println(person);

        person.setPassword("Hrcyikngh1!");
        System.out.println(person.getPassword());
    }
}
