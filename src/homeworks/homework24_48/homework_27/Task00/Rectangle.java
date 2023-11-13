package homeworks.homework24_48.homework_27.Task00;
/*
S=a*b
P=(a+b)*2
 */
public class Rectangle extends Shape{

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double square(double sum) {
        double square = a*b;
        sum = sum + square;
        System.out.println("Площадь прямоугольника равна: " + square);
        return sum;
    }
    @Override
    double perimeter(double sum) {
        double perimeter = (a+b)*2;
        sum = sum + perimeter;
        System.out.println("Периметр прямоугольника равен: " + perimeter);
        return sum;
    }
}
