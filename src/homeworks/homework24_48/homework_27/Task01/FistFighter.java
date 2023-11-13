package homeworks.homework24_48.homework_27.Task01;

public class FistFighter extends GameCharacter{

    public FistFighter() {
    }

    @Override
    void attack() {
        System.out.println("Кулачный боец атакует противника кулаками.");
    }
    @Override
    public String toString() {
        return "Кулачный боец";
    }
}
