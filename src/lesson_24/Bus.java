package lesson_24;

public class Bus extends Vehicle {
        int capacity;
        int countPassengers;

        public Bus() {
            this.model = "Bus-01";
        }

        public Bus(String model, int yearOfMan, int capacity) {
            super(model, yearOfMan);
            System.out.println("Конструктор Bus");
            this.capacity = capacity;
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

