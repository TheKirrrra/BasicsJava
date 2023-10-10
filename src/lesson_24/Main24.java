package lesson_24;


public class Main24 {

    public static void main(String[] args) {
Vehicle vehicle = new Vehicle ("Vehicle1", 2007);
    Vehicle vehicle1 = new Vehicle();
    System.out.println("Модель " + vehicle.getModel());


    Bus bus = new Bus("Bus-xModel", 2000, 3);
    bus.start();
    bus.stop();
    bus.dropOffPassenger();
    bus.takePassenger();
    bus.takePassenger();
    System.out.println("Пассажиров в автобусе: " + bus.getCountPassengers());
    bus.takePassenger();
    bus.takePassenger();

    Bus bus1 = new Bus();
    bus1.start();
    bus1.stop();

    InternationalBus iBus =
            new InternationalBus("Icarus",
            1960,32, new String[]{"Spain", "Italy", "Germany"});

        System.out.println(iBus.toString());
        iBus.start();
        iBus.takePassenger();
        iBus.takePassenger();
        iBus.dropOffPassenger();

        bus1.goToRoute();

}
}
