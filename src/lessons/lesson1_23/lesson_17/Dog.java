package lessons.lesson1_23.lesson_17;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    void eat() {
        while (weight > 9) {
            System.out.println("Я объелась, больше не лезет.");
            System.out.println("Надо побегать. Мой вес сейчас: " + weight );
            run();
        }
            System.out.println("Я ем! Вкусно... Мой вес сейчас: " + weight);
            weight++;

    }

    void run() {
        while (weight < 4) {
            System.out.println("Сорян! Я слишком худой и голодный. Бежать не могу.");
            System.out.println("Надо срочно поесть! Мой вес сейчас: " + weight);
            eat();
        }
            System.out.println("Я бегу! Мой вес сейчас: " + weight);
            weight--;
        }


    String whoAmI() {
        return "I am dog: " + name + ", my weight: " + weight;
    }
}
