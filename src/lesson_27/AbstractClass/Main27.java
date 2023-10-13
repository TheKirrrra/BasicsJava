package lesson_27.AbstractClass;

public class Main27 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        SuperDog superDog = new SuperDog();
        Cat cat = new Cat();

        dog.move();
        dog.eat();

        cat.move();
        cat.eat();
    }
}
