package lesson_27.Practise;

public class Bicycle extends Vehicle {
        public Bicycle() {
            setEngine(null);
        }

    @Override
    void startEngine() {
        System.out.println("Двигатель отсутствует.");
    }

    @Override
    void stopEngine() {
        System.out.println("Нельзя остановить то, чего нет!");
    }

    @Override
    public String toString() {
        return "Bycicle {id" +
                getId() + "; Двигателя нет.}";
    }
}
