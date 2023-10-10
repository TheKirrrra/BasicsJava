package lesson_24practise;

public class BusDriver extends Person {
    String answer;
    int price;
    String answerPrice;

    public BusDriver() {this.name = "Viktor";}

    public BusDriver(String name, int ageOf, String answer, int price, String answerPrice) {
        super (name, ageOf);
        System.out.println("Конструктор Водитель");
        this.answer = answer;
        this.price = price;
        this.answerPrice = answerPrice;
    }

    public void answer() {
        System.out.println("Да, едет.");
    }
    public void answerPrice() {
        System.out.println("Билет до этого места, стоит - " + price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
