package homework_24.Task02;

public class Cat extends Animal {

    String type; //Подвид, к примеру вид "домашние кошки".

    private static Paws amountPaws;



    public Cat(String species, String name, int age, String type) {
        super(species,name,age);
        System.out.println("Конструктор Кота");
        this.type = type;
        this.amountPaws = new Paws(4);


    }

    public void purr() {
        System.out.println(name + " мурлычет.");
    }

}
