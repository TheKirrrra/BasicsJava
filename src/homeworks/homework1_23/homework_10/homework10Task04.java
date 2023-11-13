package homeworks.homework1_23.homework_10;

import java.util.Scanner;

//Task 4 Программа просит пользователя ввести произвольное число Вывести сумму цифр этого числа
public class homework10Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int num1 = num;
        int sum = 0;
        int length = String.valueOf(num).length();
        while (length>0) {
            num = num1 % 10;
            sum = sum + num;
            length--;
            num1 = num1 / 10;
        }
        System.out.println(sum);
    }
}
