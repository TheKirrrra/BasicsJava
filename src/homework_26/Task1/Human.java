package homework_26.Task1;

public class Human {
    private final int speed;
    private final int relax;

    private final String type;




    public Human(String type, int speed, int relax) {
        this.speed = speed;
        this.relax = relax;
        this.type = type;
    }

    public void run() {
        System.out.println(type + " побежал, его скорость: " + speed + " км/час");
        relax();
    }
    public void relax() {
        System.out.println("Ему нужно отдохнуть: " + relax + " минут." );
    }

}
