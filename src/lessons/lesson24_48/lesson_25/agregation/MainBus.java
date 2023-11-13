package lessons.lesson24_48.lesson_25.agregation;

public class MainBus {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("B. Smith");
//        System.out.println(passenger.toString());
//        System.out.println(passenger.getTicketNumber());
        BusDriver driver = new BusDriver("K.White", "drive-license: AB-325435");
        System.out.println(driver.toString());

        Bus bus = new Bus("Neoplan", 44, driver);
        System.out.println(bus.toString());

        Bus bus1 = new Bus("Scania", 40);
        System.out.println(bus1.toString());

        Passenger passenger1 = new Passenger("N. Paul");
        Passenger passenger2 = new Passenger("N. 1Paul");
        Passenger passenger3 = new Passenger("N. 2Paul");
        Passenger passenger4 = new Passenger("N. 3Paul");
        bus1.takePassenger(passenger);
        bus1.takePassenger(passenger1);
        bus1.takePassenger(passenger2);
        bus1.takePassenger(passenger3);
        bus1.takePassenger(passenger4);
        bus1.dropPassenger(passenger);
        bus1.dropPassenger(passenger2);
        System.out.println(bus.toString());
    }
}
