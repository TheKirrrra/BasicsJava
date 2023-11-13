package homeworks.homework24_48.homework_24.Task02;

public class Dog extends Animal{
    String type; //Подвид, к примеру собака

    private static Paws amountPaws;


    public Dog(String species, String name, int age, String type) {
        super(species,name,age);
        System.out.println("Конструктор Кота");
        this.type = type;
        this.amountPaws = new Paws(4);

    }

    public void bark() {
        System.out.println(name + " гавкает.");
    }

}
