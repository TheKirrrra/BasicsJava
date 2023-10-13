package homework_27.Task01;

public class Monk extends GameCharacter{


    public Monk() {
    }

    @Override
    void attack() {
        System.out.println("Монах атакует противника Дайбо.");
    }

    @Override
    public String toString() {
        return "Монах";
    }
}
