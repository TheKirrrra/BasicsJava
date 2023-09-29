package lesson_12;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class lesson_12 {
    public static void main(String[] args) {

 /*       int j = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println("\n end for loop");

        for (String str ="Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }
        int k = 0;
        k = 14;
        for (int a = 0; k >= 0; k--, a = a + k) {
            System.out.println(k + " : " + a);
        }


        Random random = new Random();
        int[] nums = new int[random.nextInt(11) + 5]; // получим длину от 5 до 15
        System.out.println("Длина массива: " + nums.length);

        System.out.print("["); // ln делает перенос строки
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(101) - 50; // -50 -> +50
            System.out.print(nums[i] + ", " + ((i<nums.length - 1) ? "," : "]\n"));
        }

        // Найти элемент в массиве по его значению.
        // Допустим нужно найти число 5;
     */    // Если число найдено - сохраняем в переменную его индекс. Если не найдено, сохраняем -1;
        int[] ints = {1,2,3,3,3,3,3,4,5,6,7,5,8,9,10};
        int k = 5;
        int j = -1;
        for (int i=0; i<10; i++) {
            if (ints[i] == k) {
                j = i;
            }


        }
       System.out.println("Число 5 -> " + j);
        System.out.println("=========================");

 /*       for (int i = 1; i < 7; i++) {
            if (1 == 3) continue; // завершает текущую этерацию цикла в месте, где он вызван
            System.out.println(i + " ");
        }
        System.out.println();



        for (int i = 1; i < 7; i++) {
            if (1 == 3) break; // завершает текущий цикл
            System.out.println(i + " ");

  */
            // цикл for-each
            for (int number : ints) { // тип массива - имя переменной, в которой будет храниться текущее значение :
                // переменная со ссылкой массива
                System.out.print(number + "  ");}

        System.out.println();

            String[] strings = {"Ddddd", "referer", "asdasda","gregret"};

            for (String str : strings) {
                System.out.println(str);
            }

            int sum= 0;
            for (int currentValue : ints) {
                sum += currentValue;
            }
        System.out.println("сумма: " + sum);

        }

        }




