package homework_04;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите вашу фамилию: ");
        String lastname = scanner.nextLine();
        System.out.println("Введите ваш город: ");
        String city = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите ваш рост (в метрах):");
        double height = scanner.nextDouble();
        System.out.println("Меня зовут: " + name + " " + lastname + "\nЖиву сейчас в " + city + "\nМне на данный момент " + age + " лет." + "\nМой рост - " + height + " метр.");
    }
}
