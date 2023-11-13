package homeworks.homework24_48.homework_27.Task01;

public class Wizard extends GameCharacter{

    public Wizard() {
    }

    @Override
    void attack() {
        System.out.println("Маг атакует противника огненным шаром");
    }
    @Override
    public String toString() {
        return "Маг";
    }
}

