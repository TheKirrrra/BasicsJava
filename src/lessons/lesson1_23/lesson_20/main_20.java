package lessons.lesson1_23.lesson_20;

public class main_20 {
    public static void main(String[] args) {


    Cat cat = new Cat("Max", 4, 10);

    cat.sayMeow();

    cat.setName("Boris");

    System.out.println("Имя кота - " + cat.getName());
    System.out.println("Возраст кота -  " + cat.getAge());
    System.out.println("Вес кота -  " + cat.getWeight());

    }

}
