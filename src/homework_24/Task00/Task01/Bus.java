package homework_24.Task00.Task01;

public class Bus extends Vehicle{
    int capacity;
    int countPassengers;

    public Bus() {this.model = "Bus-111";}

    public Bus(String model, int yearOfMan, int capacity, int counter, int mileage, int x) {
        super(model, yearOfMan, counter, x, mileage);
        System.out.println("Конструктор Bus");
        this.capacity = capacity;
        this.x = 2; //Обычный автобус от остановки до остановки проезжает 2км
    }

    public void takePassenger() {
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус");
        }
    }

    public void dropOffPassenger() {
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса");
        } else {
            System.out.println("В автобусе нет пассажиров!");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


}
