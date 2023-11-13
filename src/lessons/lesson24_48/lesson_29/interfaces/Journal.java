package lessons.lesson24_48.lesson_29.interfaces;

public class Journal implements Printable {
    String name;

    int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Journal: " + name + " #" + number);
    }

    @Override
    public void test() {
        System.out.println("Journal test");
    }
}
