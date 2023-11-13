package lessons.lesson24_48.lesson_27.Practise;
/*
Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).

Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.

Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
 */
abstract class Vehicle {

    private final int id;

    private static int counter;
    private Engine engine;

    public Vehicle() {
        this.id = counter++;
    }

    abstract void startEngine();

    abstract void stopEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    abstract public String toString();

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }
}
