package lessons.lesson24_48.lesson_24;

public class InternationalBus extends Bus {

    private String[] countries;

    public InternationalBus(String model, int yearOfMan, int capacity, String[] countries) {
        super(model, yearOfMan, capacity);
        this.countries = countries;
    }

    public InternationalBus(String model, int yearOfMan, int capacity) {
        super(model, yearOfMan, capacity);
        this.countries = new String[0];
    }

    public String[] getCountries() {
        return countries;
    }
}
