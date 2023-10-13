package homework_27.Task01;

public class Warrior extends GameCharacter{
    public Warrior() {
    }

    @Override
    void attack() {
        System.out.println("Воин атакует противника мечом");
    }

    @Override
    public String toString() {
        return "Воин";
    }
}
