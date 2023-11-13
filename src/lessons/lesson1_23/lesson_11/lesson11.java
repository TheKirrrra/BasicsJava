package lessons.lesson1_23.lesson_11;

import java.util.Random;

public class lesson11 {
    public static void main(String[] args) {
 /*       int[] array;
        String[] strings;
        array = new int[6]; // массив типа int с 6 ячейками 0-5
        strings = new String [10]; // создали массив строк с 10 ячейками 0-9

        int[] array2 = new int[8];

        // Значения по умолчанию:
        // для всех числовых типов (в том числе char) это будет 0 (0.0)
        // для boolean ß false
        // для всех ссылочных типов - null (null - ничего)

        int[] numbers = new int[] {45,56,-16,45,0,159,1444}; // явная инициализация массива
        int[] ints = {-10,54,32323,444};

        int value = numbers [0];
        System.out.println("в 0 ячейке массива numbers находится число: " + value);
        System.out.println("в 0 ячейке массива ints находится число: " + ints[2]);
        System.out.println("в 0 ячейке массива array находится число: " + array[3]);
        System.out.println("в 0 ячейке массива strings находится число: " + strings[9]);
        System.out.println(numbers.length);

        System.out.println("Распечатываем массив ints");

        int j = 0;
        while (j < ints.length);{
            System.out.println(ints[j] + ", ");
        }
        System.out.println();

        int i = 0;

        System.out.println("Распечатываем \"красиво\" массив ints");

        String arrayToString = "[";
        while (i< numbers.length) {
            //   arrayToString = arrayToString + numbers[i] + ((i != numbers.length -1)? ", ": "]");

            arrayToString += numbers[i];
            if (i != numbers.length - 1) {
                arrayToString += ", ";
            } else {
                // System.out.print(numbers[i] + " - ");
                i++;
            }

        } System.out.println(arrayToString);


        System.out.println("=================");
        System.out.println("Работаем с типом String как с массивом символов");
        String str = "Hello!";

        int i1=0;

        while (i1 < str.length()) {
            System.out.println(str.charAt(i1)+ ", ");
            i1++;
        }
        System.out.println();

        char[] chars = str.toCharArray(); // java сама посчитает сколько символов в массиве
        System.out.println("длина массива chars: " + chars.length);

        int e = 0;
        while (e < chars.length) {
            System.out.println(chars[e++] + " ");
        }
        System.out.println();

        System.out.println("============= Массив строк ===========");

        String[] strings1 = {"Str1", "Sttrq", "trtrf", "hello"};
        System.out.println(strings1.length);
        System.out.println("strings1[2] -> " + strings1[2]);

        int[] ints1;
        ints1 = new int[]{1, 3, 54, 8 ,6};

        String string = Arrays.toString(ints1); // формирует представление массива в виде строки
        System.out.println(string);
        System.out.println(Arrays.toString(strings1));


  */
 //       ints1[1] = 10; // присвоение нового значения второму элементу (с индексом 1) новое значение

        Random random = new Random();

        int[] nums = new int[10];

        int k = 0;

        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.println(nums[k] + ", ");
            k++;

        }
        System.out.println("]\n");

        int l = 0;
        int min = nums[0];
        while (l < nums.length) {
            if (nums[l] < min) {
                min = nums[l];
            }l++;
        }

    }
}
