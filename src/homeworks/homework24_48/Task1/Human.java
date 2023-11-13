package homeworks.homework24_48.Task1;

public class Human extends Runner{
    private final int speed;
    private final int relax;

    private String type;




    public Human(int speed, int relax) {
        this.speed = speed;
        this.relax = relax;
        this.type = "Обычный чел";
    }

    public void run() {
        System.out.println(type + " побежал, его скорость: " + speed + " км/час");
        relax();
    }
    public void relax() {
        System.out.println("Ему нужно отдохнуть: " + relax + " минут." );
    }

    public void setType(String type) {
        this.type = type;
    }
}
