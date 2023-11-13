package homeworks.homework1_23.homework_07;

import java.util.Random;


public class homework_07_task01 {
    public static void main(String[] args) {
        int number;
        int number2;
        int number3;
        int number4;

        Random random = new Random();

        number = random.nextInt(101);
        number2 = random.nextInt(101);
        number3 = random.nextInt(101);
        number4 = random.nextInt(101);
        System.out.println(number + " " + number2 + " " + number3 + " " + number4);

        if (number > number2 & number > number3 & number > number4) {
            System.out.println(number);
        } else if (number2 > number & number2 > number3 & number2 > number4) {
            System.out.println(number2);
        } else if (number3 > number & number3 > number2 & number3 > number4) {
            System.out.println(number3);
        } else if (number4 > number & number4 > number2 & number4 > number3) {
            System.out.println(number4);
        }
        }


    }

