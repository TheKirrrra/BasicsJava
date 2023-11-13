package homeworks.homework24_48.homework_24.Task02;

public class Animal {
    String species; //семейство, к примеру семейство кошачьих
    String name;
    int age;



    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public void wakeUP() {
        System.out.println(name + " проснулся.");
    }
    public void sleep() {
        System.out.println(name + " спит.");
    }
    public void eat() {
        System.out.println(name + " ест.");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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

    public String info() {
        return "{" + name + "; Возраст: " + age;
    }
}
