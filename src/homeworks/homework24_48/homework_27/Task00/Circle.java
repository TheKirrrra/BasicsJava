package homeworks.homework24_48.homework_27.Task00;
/*
S=πr^
P = 2 * π * r
 */
public class Circle extends Shape{

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    double square(double sum) {
        double square = Math.PI * Math.pow(r, 2);
        sum = sum + square;
        System.out.println("Площадь круга равна: " + square);
        return sum;
    }

    @Override
    double perimeter(double sum) {
        double perimeter = (2 * Math.PI * r);
        sum = sum + perimeter;
        System.out.println("Периметр круга равен: " + perimeter);
        return sum;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
