package lessons.lesson24_48.lesson_27.Practise;

abstract class VehicleWithEngine extends Vehicle{
public VehicleWithEngine(Engine engine){
    super.setEngine(engine);
}

public VehicleWithEngine() {

}
    void startEngine() {
        if (getEngine() != null) {
            getEngine().start();
        } else {
            System.out.println("Двигателя нет.");
        }
    }

    @Override
    void stopEngine() {

    }


    abstract public String toString();

}
