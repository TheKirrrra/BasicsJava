package homework_07;

import java.util.Scanner;

public class homework_07_task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        String name = scanner.nextLine();
            if (name.length() != 4) {
                System.out.println("Невозможно продолжение операции");
            } else {
                if (name.charAt(0) + name.charAt(1) == name.charAt(2) + name.charAt(3)) {
                    System.out.println("Число " + name + " -> " + name.charAt(0) + " + " + name.charAt(1) + " = "+ name.charAt(2) +  " + " + name.charAt(3) + " -> счастливое.");
                    System.out.println();
                } else {
                    System.out.println("Число " + name + " -> НЕ является счастливым.");
                }
            }

    }
}

