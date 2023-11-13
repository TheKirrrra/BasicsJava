package lessons.lesson24_48.lesson_24practise;

public class Passenger extends Person {

    String destination;
    String askPrice;
    public Passenger() {this.name = "Kalina"; }

    public Passenger(String name, int ageOf, String destination, String askPrice) {
        super(name, ageOf);
        System.out.println("Конструктор Passenger");
        this.destination = destination;
        this.askPrice = askPrice;
    }

    public void destination() {
        System.out.println("Автобус едет до станции " + destination + "?");

    }

    public void askPrice() {
        System.out.println("А сколько стоит туда доехать?");
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(String askPrice) {
        this.askPrice = askPrice;
    }
}

