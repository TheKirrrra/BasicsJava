package lessons.lesson24_48.lesson_29.flyable;

public class Duck implements Swimable, Flyable{

    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
}
