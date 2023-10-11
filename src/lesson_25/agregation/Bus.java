package lesson_25.agregation;

public class Bus {
    private final int id;
    private final String model;
    private int mileage;
    private final int capacity;

    private BusDriver driver; //входящий класс в класс.
    private final AutoPilot autoPilot;
    private final Passenger[] passengers;
    private int amountPassengers;

    private static int counter;
    private static int ticketCounter;

    public Bus(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.id = counter++;
        passengers = new Passenger[capacity];
        this.autoPilot = new AutoPilot("V.001-B");
    }public Bus(String model, int capacity, BusDriver driver) {
        this.driver = driver;
        this.model = model;
        this.capacity = capacity;
        this.id = counter++;
        passengers = new Passenger[capacity];
        this.autoPilot = new AutoPilot("V.001-B");
    }

    public boolean takePassenger(Passenger passenger) {
        if (amountPassengers < capacity) {
            passenger.setTicketNumber(generateTicket(passenger.getId()));
            passengers[amountPassengers++] = passenger;


          return true;
        }
        return false;
    }

    public boolean dropPassenger(Passenger passenger) {


        int indexPassenger = isPassengerInBus((passenger.getId()));

        if (indexPassenger >= 0) {
            //TODO надо сдвигать пассажиров с индексами больше indexPassenger
            passengers[indexPassenger] = null;
            passenger.setTicketNumber(null);
            amountPassengers--;
            sortArray(passengers);

            return true;
        }

        return false;
    }


    // метод проверяющий находится ли пассажиры в автобусе
    private int isPassengerInBus(int idPass) {
        for (int i = 0; i < amountPassengers; i++) {
            if (passengers[i].getId() == idPass) {
                return i;
            }
            
        }
        return -1;
    }

    private String generateTicket(int passengerId) {
        return "B" + id + "-" + passengerId + String.format("%05d", ++ticketCounter);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bus id: ").append(id).append("; model: ").append(model).append("; ");
        sb.append("capacity: ").append(capacity).append("; ");
        sb.append(" Driver: ");
        sb.append((driver == null ? "on vacation" : driver)).append("; ");
        sb.append(getStringPassengerList());
        sb.append("; AP: ").append(autoPilot);
        sb.append("}");
        return sb.toString();
    }

    private String getStringPassengerList() {
        StringBuilder sb = new StringBuilder("{");
        for (Passenger passenger : passengers) {
            if (passenger != null) {
                sb.append(passenger).append("; ");
            }
        }

        if (sb.length() > 1) {
            sb.setLength(sb.length()-2); //обрезается вывод на 2 символа
        }

        sb.append("}");
        return sb.toString();


    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getCapacity() {
        return capacity;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

        public static Passenger[] sortArray(Passenger[] array) {
            for (int index = 0; index < array.length; index++) {
                if (array[index] == null) {
                    int point = index;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] != null) {
                            int notNullIndex = i;
                            i = point;
                            point = notNullIndex;
                        }
                    }
                }
            }
            return array;
        }
}
