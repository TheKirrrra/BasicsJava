package homework_27.Task00;

/*
S=a*h/2
P=a*3
 */
public class Triangle extends Shape{

    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    double square(double sum) {
        double square = a*h/2;
        sum = sum + square;
        System.out.println("Площадь равностороннего треугольника равна: " + square);
        return sum;
    }

    @Override
    double perimeter(double sum) {
        double perimeter = a*3;
        sum = sum + perimeter;
        System.out.println("Периметр равностороннего треугольника равен: " + perimeter);
        return sum;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
