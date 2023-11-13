package lessons.lesson1_23.lesson_22;

import java.util.Arrays;

public class MainArraysUtil {
    public static void main(String[] args) {
        int[] ints = {25,13,-56,44,57,78,34,8,10,77,-25};

        int searchMe = 25;

 //       System.out.println(ArraysUtil.linearSearch(ints, searchMe));

        ArraysUtil.sortArray(ints);

        System.out.println(Arrays.toString(ints));

        System.out.println("Результат бинарного поиска: "
                + ArraysUtil.binarySearch(ints, searchMe));

        int[] testInts = ArraysUtil.initTestArray(1000);
        int[] searchValues = ArraysUtil.initTestArray(10);


        // Возвращает текущее время в миллисекундах
        long startTime = System.currentTimeMillis();

        int[] resultFromLinear = new int[10];
        for (int i = 0; i < searchValues.length; i++) {
            resultFromLinear[i] = ArraysUtil.linearSearch(testInts, searchValues[i]);
        }
        for (int value: searchValues) {
            ArraysUtil.linearSearch(testInts, value);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Затрачено времени: " + (endTime - startTime));
        System.out.println("Результаты поиска: " + Arrays.toString(resultFromLinear));

        startTime = System.currentTimeMillis();
        ArraysUtil.sortArray(testInts);


        resultFromLinear = new int[10];
        for (int i = 0; i < searchValues.length; i++) {
            resultFromLinear[i] = ArraysUtil.linearSearch(testInts, searchValues[1001]);
        }
        for (int value: searchValues) {
            ArraysUtil.linearSearch(testInts, value);
        }

        endTime = System.currentTimeMillis();

        System.out.println("Затрачено времени: " + (endTime - startTime));
        System.out.println("Результаты поиска: " + Arrays.toString(resultFromLinear));

    }
}
