package homeworks.homework1_23.homework_06;

import java.util.Scanner;

public class homework06_Task00 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное значение");
        int digit = scanner.nextInt();
        boolean num1 = digit!=0 & digit % 2==0;
        boolean num2 = digit!=0 & digit % 3==0;
        System.out.println("Число: " + digit + " четное: " + num1 + " кратно 3: " + num2 + " четное и кратное 3: " + (num1 & num2));
    }
}
