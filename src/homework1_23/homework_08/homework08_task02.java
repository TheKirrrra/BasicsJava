package homework1_23.homework_08;

import java.util.Random;

public class homework08_task02 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        int max = 60;
        int minute = 45;
        number = random.nextInt(12) +1;
        System.out.println("Оценка: " + number);
        switch (number) {
            case 10:
            case 11:
            case 12:
                minute += 60;
                if (minute > max) {
                    minute = max;
                } else if (minute < 0) {
                    minute = 0;}

                System.out.println("Молодец, ты здорово постаралась, поэтому можешь смотреть телевизор ещё " + minute + " минут.");
                break;
            case 7:
            case 8:
            case 9:
                minute += 45;
                if (minute > max) {
                    minute = max;
                } else if (minute < 0) {
                    minute = 0;}
                System.out.println("Умничка, ты хорошо постаралась, поэтому можешь смотреть телевизор " + minute + " минут.");
                break;
            case 4:
            case 5:
            case 6:
                minute += 15;
                if (minute > max) {
                    minute = max;
                } else if (minute < 0) {
                    minute = 0;}
                System.out.println("Хм, это показывает твои старания, так что можешь смотреть телевизор " + minute + " минут.");
                break;
            case 3:
                minute -= 30;
                if (minute > max) {
                    minute = max;
                } else if (minute < 0) {
                    minute = 0;}
                System.out.println("Маловато будет, давай " + minute + " минут телевизор смотришь, а потом за уроки.");
                break;
            default:
                minute = 0;
                System.out.println("Мдеее, ну что ж, пойдем посмотрим, что тебе не понятно.");

        }
    }
}
