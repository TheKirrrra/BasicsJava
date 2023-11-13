package lessons.lesson24_48.lesson_24practise;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public void sayHello() {
        System.out.println("Здравствуйте! - сказал " + name);
    }

    public void sayAge() {
        System.out.println("Мне " + age + " лет - сказал " +name);
    }
    public void sayBye() {
        System.out.println("До Свидания! - сказал " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "Имя человека: " + name + ", его возраст: " + age;
    }
}
