package lessons.lesson24_48.lesson_24;

public class Train extends Vehicle {

    int capacity;
    int countPassengers;

    int countWagons;
    static final int WAGON_CAPACITY = 32;

    public Train(String model, int yearOfManufacture, int countWagons) {
        super(model, yearOfManufacture);
        this.capacity = capacity;
        this.countWagons = countWagons;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        capacity = countWagons * WAGON_CAPACITY;
        this.countWagons = countWagons;
    }
}
