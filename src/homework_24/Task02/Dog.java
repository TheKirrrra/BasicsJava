package homework_24.Task02;

public class Dog extends Animal{
    String type; //Подвид, к примеру собака

    public Dog(String species, String name, int age, String type) {
        super(species,name,age);
        System.out.println("Конструктор Кота");
        this.type = type;
    }

    public void bark() {
        System.out.println(name + " гавкает.");
    }

}
