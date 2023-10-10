package homework_24.Task00.Task01;

public class Vehicle {

    String model;

    int yearOfManufacture;

    int counter; //Количество остановок, одна остановка это x расстояние

    int x; // Расстояние которое преодолел транспорт

    int mileage;
    public Vehicle(String model, int yearOfManufacture,int counter, int x,int mileage) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.counter = counter;
        this.x = x;
        this.mileage = counter*x;  //Общий пробег транспорта
    }

    public Vehicle() {

    }

    public void start() {
        System.out.println(model + " начинает движение");
    }
    public void stop() {
        counter++;
        System.out.println(model + " заканчивает движение");
    }
    public void goToRoute() {
        System.out.println(getModel() + " отправляется по маршруту");
        start();
        stop();
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getCounter() {
        return counter;
    }

    public int getMileage() {
        return mileage;
    }


}
