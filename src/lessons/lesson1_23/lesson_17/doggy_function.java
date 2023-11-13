package lessons.lesson1_23.lesson_17;

public class doggy_function {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sher", 7);
        System.out.println(dog1.whoAmI());

        dog1.run();
        dog1.run();
        dog1.run();
        dog1.run();
        dog1.run();
        dog1.run();
        dog1.run();
        dog1.run();

        System.out.println(dog1.whoAmI());
    }
}
