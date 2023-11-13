package homeworks.homework24_48.homework_24.Task00.Task01;

public class InternationalBus extends Bus {
    private String[] countries;

    public InternationalBus(String model, int yearOfMan,int counter, int x, int mileage, int capacity, String[] countries) {
        super(model, yearOfMan, counter, x, mileage, capacity);
        System.out.println("Конструктор iBus");
        this.countries = countries;
        this.x = 100;
    }

    public InternationalBus(String model, int yearOfMan,int counter, int x, int mileage, int capacity) {
        super(model, yearOfMan, counter, x, mileage, capacity);
        System.out.println("Конструктор iBus");
        this.countries = new String[0];
        this.x = 100;
    }

    public String[] getCountries() {
        return countries;
    }
}
