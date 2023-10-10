package homework_24.Task00.Task01;

public class Train extends Vehicle{

    int capacity;
    int countPassengers;

    int countWagons;
    static final int WAGON_CAPACITY = 36;

    public Train(String model, int yearOfManufacture, int countWagons, int x, int counter, int mileage) {
        super(model, yearOfManufacture, counter, x, mileage);
        System.out.println("Конструктор Train");
        this.capacity = capacity;
        this.countWagons = countWagons;
        this.x = 20;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCapacity() {
        return capacity;
    }
}
