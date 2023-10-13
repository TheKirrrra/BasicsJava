package lesson1_23.lesson_21;

public class Car {

    private static int countCar;
    private String model;
    private int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        countCar++;
    }

    public void info() {
        System.out.println("Car " + model + "; power: " + powerPS + ". Всего выпущено машин " +countCar);
        getCountCar();
    }

    public static int getCountCar() {
        return countCar;
    }

    public static void main(String[] args) {

    Car car1 = new Car("BMW", 200);
    car1.info();
    Car car2 = new Car("Skoda", 150);

        System.out.println("Всего создано автомобилей - " + Car.countCar);
    }
}
