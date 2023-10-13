package lesson_27.Practise;

public class ElectroBicycle extends Bicycle {

    public ElectroBicycle(ElectroEngine engine) {
        setEngine(engine);
    }

    public ElectroBicycle() {
        setEngine(new ElectroEngine(20));
    }

    @Override
    void startEngine() {
        getEngine().start();
    }

    @Override
    void stopEngine() {
        getEngine().stop();
    }

    @Override
    public String toString() {
        return "E-Bicycle {id:" + getId() + "; " + getEngine() + "}";
    }
}
