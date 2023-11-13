package lessons.lesson1_23.lesson_17;

public class ClassCat {
    String name;
    String color;
    int age;

    // конструктор
    public ClassCat(String catName) {
        name = catName;
    }

    public ClassCat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public ClassCat(String name, String color,int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public ClassCat() {

    }

    public void whoAmI() {
        System.out.println("Я котик " + this.name + ", мой возраст: " + age + ", и мой окрас: " + color);
    }
    void sleep() {
        System.out.println("I am sleeping.");
    } //Method Area

    void sayMeow() {
        System.out.println("MEOW!!");
    } //Method Area

    void run() {
        System.out.println("I am running.");
    } //Method Area
}
