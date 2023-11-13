package homeworks.homework24_48.homework_36;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator {
    public static void sortEvenOdd(Integer[] integers, boolean ascendingEven, boolean ascendingOdd) {
        Comparator<Integer> comparator = (a, b) -> {
            if (a % 2 == 0 && b % 2 == 0) {
                // Both 'a' and 'b' are even
                return ascendingEven ? a - b : b - a;
            } else if (a % 2 != 0 && b % 2 != 0) {
                // Both 'a' and 'b' are odd
                return ascendingOdd ? a - b : b - a;
            } else if (a % 2 == 0) {
                // 'a' is even, 'b' is odd
                return -1;
            } else {
                // 'a' is odd, 'b' is even
                return 1;
            }
        };

        Arrays.sort(integers, comparator);
    }
    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        System.out.println("Сортировка чет, нечёт:");
        sortEvenOdd(integers, true, true);
        System.out.println(Arrays.toString(integers));

        System.out.println("Сортировка чет, а нечёт в обратной последовательности:");
        sortEvenOdd(integers, true, false);
        System.out.println(Arrays.toString(integers));

    }
}
