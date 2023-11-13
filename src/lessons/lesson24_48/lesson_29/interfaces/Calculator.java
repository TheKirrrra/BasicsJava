package lessons.lesson24_48.lesson_29.interfaces;

public class Calculator implements Summable{
    private int[] values;

    public Calculator(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public double getPI() {
        return PI;
    }

    public double areaCircle(double radius) {
        return radius*radius*PI;
    }
}
