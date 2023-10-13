package lesson1_23.lesson_16;

import java.util.Arrays;
import java.util.Random;

public class lesson_16 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] ints = {0,1,2,3,4,5,6,7,8,9,10,11,12,14,14,15};

        System.out.println(Arrays.toString(ints));

        int[] newInts = Arrays.copyOf(ints, 20);
        System.out.println(Arrays.toString(newInts));

        int[] newInts1 = copyOfArray(ints, 20);
        System.out.println(Arrays.toString(newInts1));

        int[] ints1 = Arrays.copyOfRange(ints, 2, 5); // 2, 3, 4
        System.out.println("copyOfRange: " + Arrays.toString(ints1));

        int[] ints2 = copyOfRange(ints, 2,5);
        System.out.println("copyOfRange my: " + ints2);

        String[] strings = {"gfgf", "fggff", "trtrtr"};
        String[] strings1 = Arrays.copyOfRange(strings, 0, 2);
        System.out.println(Arrays.toString(strings1));

        int[] ints3 = new int[7];
        Arrays.fill(ints3, 10);
        System.out.println(Arrays.toString(ints3));

        int[] numbers = {1,2,3};
        int[] ints4 = {1,2,3};

        boolean isEquals;
        isEquals = numbers == ints4;
        isEquals = numbers.equals(ints4);
        System.out.println("isEquals: " + isEquals);
        isEquals = Arrays.equals(numbers, ints4);
        System.out.println("isEquals: " + isEquals);

        // заполняем двумерный массив случайными числами
        int[][] doubleArray = new int[5][5];
        int[][] testArray = new int[5][5];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[0].length; j++) {
                int temp = random.nextInt(101);
                doubleArray[i][j] = temp;
                testArray[i][j] = temp;

            }


        }
        // deepToString() - позволяет получить строковое представление многомерных массивов.
        System.out.println(Arrays.deepToString(doubleArray));

        System.out.println("Сравнение по значению двумерных массивов" + Arrays.deepEquals(doubleArray, testArray));

        int[] numbers1 = {10,11,12,13,1,6,3,8,3,7,5,4};
        // сортировка массива
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));

        // поиск элемента в массиве. Возвращает индекс или отрицательное значение
        System.out.println("binarySearch: " + Arrays.binarySearch(numbers1, 12));

        int[] arrSystemCopy = new int[10];
   //     System.arraycopy(numbers1, 3, arrSystemCopy, 2, 5);

        System.out.println("System.arraycopy: " + Arrays.toString(arrSystemCopy));

        systemArrayCopy(numbers1, 3, arrSystemCopy, 2, 5);
        // метод substring при работе со String-ами. Выделяет подстроку из строки
        String string = "Hello Java";

        String subString = string.substring(7);
        subString = string.substring(6,8); //выделяет подстроку с 6 до (8-1) индекса
        System.out.println("subString: " + subString);

        System.out.println(" ======================== ");

        System.out.println(Arrays.toString(ints));

        int[] ints5 = copyOfRange(ints, 4);
        System.out.println(Arrays.toString(ints5));

        // string.replace() - заменяет один char на другой. Возвращает новую строку.
        String replacedString = string.replace('a', 'A');
        replacedString = string.replace("a", "Etwas");
        System.out.println(replacedString);
        System.out.println(string.replaceFirst("Java", "Python"));

        char[] chars1 = string.toCharArray();
        System.out.println(Arrays.toString(chars1));

    }//Methods Area

    public static int[] copyOfRange(int[] array, int begin) {
        return copyOfRange(array, begin, array.length);
    }

    public static void systemArrayCopy(int[] old, int indexFrom, int[] newArr, int indexTo, int count) {

        for (int i = 0; i <= count; i++) {
            newArr[indexTo + i] = old[indexFrom + i];
        }
    }

    public static boolean isEqualsArrays(int[] a, int[] b) {

        /*
        0. Сравним ссылки. Если обе ссылаются на один массив, говорим что значения в них равны, если нет проверяем значения.
        1. Сравним длины массивов. Если разные - содержимое массивов не равно
        2. Берем цикл. Перебираем индексы. Сравниваем значения. Как только находим несостыковку - возвращаем false.
        3. Прошли цикл - значит не нашли не равные значения - возвращаем тру
         */

        //Сравниваем ссылки
        boolean tempEquals = a == b;
        if (tempEquals) return true;

        //Сравниваем длины. Если не равны - возвращаем false
        tempEquals = a.length != b.length;
        if (tempEquals) return false;

        //перебираем и сравниваем значения. Если найдем не равные, возвращаем false
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static int[] copyOfRange(int[] array, int begin, int end){
        if (end < begin) return new int[0];

        int[] result = new int [end - begin];
        int counter = 0;
        for (int i = 0; i < end; i++) {
            result[counter++] = array[i];

        }


        return result;
    }

    public static int[] copyOfArray(int[] array, int newLength) {
        int[] result = new int [newLength];

        for (int i = 0; i < result.length && i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }//Method Area
}
