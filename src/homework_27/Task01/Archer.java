package homework_27.Task01;

public class Archer extends GameCharacter{

    public Archer() {
    }

    @Override
    void attack() {
        System.out.println("Лучник атакует противника мечом");
    }
    @Override
    public String toString() {
        return "Лучник";
    }
}

