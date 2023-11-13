package lessons.lesson1_23.lesson_07;

import java.util.Scanner;

public class lesson_07 {
    public static void main(String[] args) {
       /* String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVA";
        String str4 = new String("Java");

        boolean num1 = str1 == str2;
        boolean num2 = str1 == str3;
        boolean num3 = str1 == str4;
        System.out.println("str1 == str2 -> " + num1);
        System.out.println("str1 == str3 -> " + num2);
        System.out.println("str1 == str4 -> " + num3);
        System.out.println("str1.equals(str4) -> " + str1.equals(str4));

        System.out.println("+++++++++++++++++++++++++++++++++");
        int x = 8;
        if (x > 11) {
            System.out.println("Мы находимся в блоке else if");
            System.out.println("Сейчас х равен " + x);
        } else {
            System.out.println("Мы находимся в блоке else");


        }
        System.out.println("Продолжение программы");

         Попросите пользователя ввести число
           Если это число больше 10, прибавьте к числу 20
           Если число меньше 0 - присвойте числу модуль числа (т.е. убрать знак минус)
           Если число равно 4 - умножьте число на 4
           В остальных случаях, поменяйте знак числа

           Выведите в консоль значение числа после манипуляций
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int num = scanner.nextInt();

            if (num > 10) {
                num += 20;
            } else if (num < 0) {
                num *= -1;
            }  else if (num == 4) {
                num *= 4;
            } else {
                num *= -1;
            }
        System.out.println(num);

    }


}

