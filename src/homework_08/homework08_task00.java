package homework_08;

import java.util.Scanner;

public class homework08_task00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: 1,2 или 3. ");
        int number = scanner.nextInt();
        int[] numbers = {1,2,3};
        switch (number) {
            case 1:
            System.out.println("Вы ввели число -> 1");
                break;
            case 2:
        System.out.println("Вы ввели число -> 2");
        break;
            case 3:
                System.out.println("Вы ввели число -> 3");
                break;
            default:
                System.out.println("Вы ввели неправильное число.");
        }
    }

}

