package lessons.lesson24_48.lesson_29.interfaces;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new int[]{3,4,5});
        System.out.println("Сумма values: " + calculator.sum(calculator.getValues()));
        System.out.println("Сумма values: " + calculator.sum(1,2,3,4));

        System.out.println(calculator.getPI());
        System.out.println(calculator.areaCircle(15.0));

    }


}
