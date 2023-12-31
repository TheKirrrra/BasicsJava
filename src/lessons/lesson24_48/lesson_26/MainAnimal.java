package lessons.lesson24_48.lesson_26;

public class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Barsik");
        Cat cat = new Cat();

        Hamster hamster = new Hamster();


        Animal animal =  new Dog();


        System.out.println("Get class: " + animal.getClass().getName());




        Animal[] animals = new Animal[4];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = hamster;
        animals[3] = new SuperDog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();
        }
        System.out.println("downCast ===================");

        for (Animal currentAnimal: animals) {
            currentAnimal.sound("Lets fun!");
            if (currentAnimal instanceof Cat) {
                Cat tempCat = (Cat) currentAnimal;
                tempCat.sayHello();
            }
        }

        System.out.println("\n==================");

        Object object = new Dog();
        //Нисходящее преобразование
        Dog dog1 = (Dog) object;
        dog1.sound();


        System.out.println("Super Dog ===================");

        Animal superDog = new SuperDog();
        System.out.println(superDog instanceof Dog);
        System.out.println(superDog instanceof SuperDog);


        Bird bird = new Bird();
        bird.sound();


    }
}
