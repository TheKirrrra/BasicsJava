package lesson_27.AbstractClass;


abstract class Animal {
    abstract void move();

    abstract void eat();

    public void sayHello(){
        System.out.println("Hello from animal!");
    }
}
