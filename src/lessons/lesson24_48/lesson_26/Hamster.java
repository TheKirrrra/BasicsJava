package lessons.lesson24_48.lesson_26;

public class Hamster extends Animal{

    @Override
    public void sound() {
        System.out.println("Hamster say: hrum-hrum");
    }

    @Override
    public String toString() {
        return "Хомяк";
    }
}
