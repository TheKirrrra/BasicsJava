package lessons.lesson24_48.lesson_27.Practise;

public class Engine {
    private final int id;
    private int power;
    private boolean isActive;
    private static int counterId;

    private String typeFuel;

    public Engine(int power, String typeFuel) {
        this.power = power;
        this.typeFuel = typeFuel;
        this.id = counterId++;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id: " + id +
                ", power = " + power +
                ", isActive = " + isActive +
                ", typeFuel = '" + typeFuel + '\'' +
                '}';
    }

    public void start() {
        if (!isActive) {
            System.out.println("Двигатель запущен.");
            isActive = true;
        } else {
            System.out.println("Двигатель уже работает.");
        }
    }

    public void stop() {
        if (isActive) {
            System.out.println("Двигатель остановлен!");
            isActive = false;
        } else {
            System.out.println("Двигатель уже остановлен.");
        }
    }


    public int getId() {
        return id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getTypeFuel() {
        return typeFuel;
    }
}
