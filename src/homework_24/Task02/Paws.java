package homework_24.Task02;

public class Paws {
    private int amountPaws;

    public Paws(int amountPaws) {
        this.amountPaws = amountPaws;
    }

    public String toString() {
        return "{Paws: Количество лап: " + amountPaws;
    }

    public int getAmountPaws() {
        return amountPaws;
    }

    public void setAmountPaws(int amountPaws) {
        this.amountPaws = amountPaws;
    }
}

