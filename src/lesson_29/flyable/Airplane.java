package lesson_29.flyable;

public class Airplane extends Transport implements Flyable{

    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }
}
