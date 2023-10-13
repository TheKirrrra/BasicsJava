package homework1_23.homework_13;

import java.util.Scanner;

/*
Написать метод, принимающий на вход целое число.
Метод должен вывести на экран 2 в степени это - Число
 */
public class homework_13Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int index = scanner.nextInt();

        printIndex(index);

    } //Method Area

    public static void printIndex(int index) {
        int sum = 1;
        int index1 = 2;
        boolean isPositive = index>= 0;

        if (index <0 ) {
            index *= -1;
        }

        for (int i = 1; i < index; i++) {
            sum *= index1;

        }

        if (isPositive) {
            System.out.println(index1 + " в степени " + index + " -> "  + sum);
        } else {
            System.out.println((double) 1/sum);
            System.out.printf("1/%d\n", sum);
        }

    } //Method Area
}// Class Area
