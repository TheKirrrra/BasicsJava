package lessons.lesson24_48.lesson_27.AbstractClass;

public class Dog extends Animal{
    @Override
    void move() {
        System.out.println("Собака двигается");

    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Dog");
    }

    @Override
    void eat() {
        System.out.println("Собака кушает!");
    }
}
