package lessons.lesson24_48.lesson_30.generics;

public class GenericBoxApp {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>("Hello");
        GenericBox<String> stringBox2 = new GenericBox<>("World");
        System.out.println(stringBox);
        System.out.println(stringBox.getValue() + stringBox2.getValue());
        //GenericBox stringBox = new GenericBox<>();


        GenericBox<Integer> intBox = new GenericBox<>(150);
        GenericBox<Integer> intBox2 = new GenericBox<>(20);

        System.out.println(intBox.getValue() + intBox2.getValue);

        
    }
}
