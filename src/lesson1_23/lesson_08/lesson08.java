package lesson1_23.lesson_08;

import java.util.Random;
import java.util.Scanner;

public class lesson08 {
    public static void main(String[] args) {

        int x = 7;

        if (x == 5) {
                System.out.println("if: x равен 5");
        } else if (x == 7) {
            System.out.println("if: x равен 7");
        }
        switch (x) {
            case 5: // двоеточие обязательно
                System.out.println("switch: x равен 5");
                break;
            case 7:
                System.out.println("switch: x равен 7");
        }

        Random random = new Random();

        int money = 100;
        int note = random.nextInt (5) +1;
        System.out.println(note);

        switch (note) {
            case 5:
                money += 20;
                break;
            case 4:
                money += 10;
                break;
            case 2:
                money -= 20;
                break;
            case 1:
                money = 0;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("У меня есть загадка:");
        System.out.println("Что это такое: желтый, большой, с рогами и полный зайцев?");
        System.out.println("Как думаешь?");
        String answer = scanner.nextLine();
        switch (answer) {
            case "Троллейбус":
            case "троллейбус":
            case "троллейбус!":
                System.out.println("Молодец! Угадал!");
                break;
            case "сдаюсь":
            case "Сдаюсь":
            case "сдаюсь!":
                System.out.println("Быстро ты сдался :( \nПравильный ответ - Троллейбус.");
                break;
            default:
                System.out.println("Ответ не верный, попробуй ещё раз!");
        }

        System.out.println("Введите короткое имя валюты: USD, CHF, EUR, PLN, CZK");
        String val = scanner.nextLine();
        String val2 = "Название валюты";
               switch (val) {
                   case "USD":
                       val2 = "Доллары США";
                       System.out.println(val2);
                       break;
                   case "CHF":
                       val2 = "Швейцарские Франки";
                       System.out.println(val2);
                       break;
                       case "EUR":
                       val2 = "Евро";
                       System.out.println(val2);
                       break;
                       case "PLN":
                       val2 = "Польские Злотые";
                       System.out.println(val2);
                       break;
                       case "CZK":
                       val2 = "Чешские Кроны";
                       System.out.println(val2);
                       break;
                   default:
                   System.out.println("Вы ввели неправильную валюту.");
               }




    }
}
