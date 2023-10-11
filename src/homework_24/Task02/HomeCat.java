package homework_24.Task02;

public class HomeCat extends Cat{

    String breed; //порода

    private static Moustache moustache;

    public HomeCat(String species, String name, int age, String type,String breed) {
        super(species, name, age, type);
        this.breed = breed;
        this.moustache = new Moustache(true);
    }

    public void play() {
        System.out.println(name + " дерёт, когтедралку.");
    }

}
