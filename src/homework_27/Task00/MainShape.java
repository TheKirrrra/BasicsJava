package homework_27.Task00;


public class MainShape {
    public static void main(String[] args) {

        double tempSquare = 0;
        double sumSquare = 0;

        double sumPerimeter = 0;
        double tempPerimeter = 0;

        Triangle triangle = new Triangle(4,6);
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(8,4);

        Shape[] shapes = new Shape[3];
        shapes[0] = triangle;
        shapes[1] = circle;
        shapes[2] = rectangle;

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].square(tempSquare);
            sumSquare = sumSquare + tempSquare;
            shapes[i].perimeter(sumPerimeter);
            sumPerimeter = sumPerimeter + tempPerimeter;
            System.out.println("=================\n");
        }

        System.out.println("Сумма площадей равна: " + sumSquare);
        System.out.println("Сумма периметров равна: " + sumPerimeter);
    }
}
