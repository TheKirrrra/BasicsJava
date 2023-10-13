package homework_27.Task00;
/*
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle. Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.


 */
abstract class Shape {

    public Shape() {

    }

    abstract double square(double sum);

    abstract double perimeter(double sum);

}
