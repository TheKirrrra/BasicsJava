package lesson_27.Practise;

public class Motorcycle extends VehicleWithEngine{

    public Motorcycle(Engine engine) {
        super(engine);
    }

    public Motorcycle() {
        super(new Engine(50,"Petrol"));
    }

    @Override
    public String toString() {
        return "Motorcycle {id" +
                getId() + "; " + getEngine() + "}";
    }
}
