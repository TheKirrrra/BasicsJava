package lesson_25.agregation;

import homework_24.Task00.Task01.Bus;

public class BusDriver {

    private final int id;
    private String name;
    private String driveLicence;

    private static int counter;

    public BusDriver(String name, String driveLicence) {
        this.name = name;
        this.driveLicence = driveLicence;
        this.id = counter++;
    }

    public String toString() {
        return "{Bus Driver id:" + id + "; name: " + name + "; Licence: " + driveLicence + "}";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriveLicence() {
        return driveLicence;
    }

    public void setDriveLicence(String driveLicence) {
        this.driveLicence = driveLicence;
    }
}
