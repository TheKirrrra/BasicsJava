package lesson_04;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальную остановку: ");
        String start = scanner.nextLine();
        System.out.println("Введите конечную остановку");
        String finish = scanner.nextLine();

        System.out.println("Введите кол-во минут, которое вы хотите затратить: ");

        double minutes = scanner.nextDouble();

        System.out.println("Введите расстояние в метрах: ");

        int distance = scanner.nextInt();

        String message = "Вам нужно от " + start + " до " + finish + "\nТак как расстояние равняется: " + distance + " метров." + "\nТо это займет около: " + minutes + " минут." ;

        System.out.println(message);
    }
}
