package lessons.lesson24_48.lesson_27.Practise;

public class MainTransport {
    public static void main(String[] args) {
        Car car1 = new Car(new Engine(200,"Petrol"));
        Bicycle bicycle = new Bicycle();
        Motorcycle motorcycle = new Motorcycle();
        ElectroBicycle electroBicycle = new ElectroBicycle();

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = car1;
        vehicles[1] = bicycle;
        vehicles[2] = motorcycle;
        vehicles[3] = electroBicycle;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.startEngine();
            System.out.println("============\n");
        }

    }
}
