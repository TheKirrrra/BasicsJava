package homework_24.Task02;

public class HomeCat extends Cat{

    String breed; //порода

    public HomeCat(String species, String name, int age, String type,String breed) {
        super(species, name, age, type);
        this.breed = breed;
    }

    public void play() {
        System.out.println(name + " дерёт, когтедралку.");
    }

}
