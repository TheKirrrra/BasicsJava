package lessons.lesson1_23.lesson_20;

public class Cat {

    private String name = "Cat";

    private int age = 0;

    private int weight = 1;

    public Cat(String name, int age, int weight) {
        setName(name);
        setAge(age);
        setWeight(weight);

    }

    void sayMeow() {
        System.out.println("Meow!");
    }

    public void setName(String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
        }
    }
    public void setAge(int newAge) {
        if (newAge >= 0 && newAge <= 20) {
            this.age = newAge;
        }
    }
    public void setWeight(int newWeight) {
        if (newWeight >= 1 && newWeight <= 20) {
            this.age = newWeight;
        }
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }

}
