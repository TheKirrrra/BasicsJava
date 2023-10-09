package homework_22;

import java.util.Random;

public class main {

    public static int binearSearch (int[] array, int searchMe) {
        int beginIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0;

        while (beginIndex <= endIndex) {
            counter++;

            middleIndex = beginIndex + (endIndex - beginIndex) / 2;

            if (array[middleIndex] == searchMe) {
                System.out.println("Число находится на: " + (middleIndex+1) + " позицие.");
                System.out.println("Число нашлось, совершено попыток: " + counter);
                return middleIndex;
            }

            if (array[middleIndex] > searchMe) {
                endIndex = middleIndex -1;
            } else {
                beginIndex = middleIndex +1;
            }
        }

        System.out.println("Число не нашлось");
        System.out.println("Мы узнали это за " + counter + " попыток");
        return -1;
    }


    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = searchMinIndex(array, i);

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }
    }

    private static int searchMinIndex(int[] array, int beginIndex) {
        int min = array[beginIndex];
        int minIndex = beginIndex;

        for (int i = beginIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

        }
        return minIndex;
    }

    public static void addRandomValues(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
        }
    }

    public String toStrings(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + ((i < array.length -1) ? ", " : "]");
        }
        return result;
    }


}
