package homework_22;


import java.util.Arrays;
import java.util.Scanner;

import static homework_22.ArrayUtils.*;

public class TestArrayUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int [1000];
        addRandomValues(ints);
        sortArray(ints);
        System.out.println("Какое число хотите найти?");
        int searchMe = scanner.nextInt();
        binearSearch(ints, searchMe);
        System.out.println(Arrays.toString(ints));
    }
}
