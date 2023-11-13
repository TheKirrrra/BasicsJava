package homeworks.homework24_48.homework_29.Task01;

public class Triathlete implements Swimmer, Runner{

    private String name;

    private int age;

    public Triathlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println(name + " бежит.");
    }

    @Override
    public void swim() {
        System.out.println(name + " плывёт.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
