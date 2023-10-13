package lesson_27.AbstractClass;

public class Cat extends Animal{
    @Override
    void move() {
        System.out.println("Cat идёт");

    }
    @Override
    void eat() {
        System.out.println("Cat ест");
    }
    @Override
    public void sayHello() {
        System.out.println("Hello from: Cat");
    }
}
