package lesson_24;

public class Vehicle {
    String model;
    int yearOfManufacture;

    public Vehicle(String model, int yearOfManufacture) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Vehicle() {
    }

    public void goToRoute() {
        System.out.println(getModel() + " отправляется по маршруту");
        start();
        stop();
    }

    public void start() {
        System.out.println(model + " начинает движение");
    }
    public void stop() {
        System.out.println(model + " заканчивает движение");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
