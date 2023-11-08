package homework_45;

import java.util.ArrayList;
import java.util.List;

public class task01 {
    public static <T> List<T> arrayElements(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();

        for (T item : list1) {
            if (list2.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(7);
        list2.add(13);

        List<Integer> arrayElementsList = arrayElements(list1, list2);
        System.out.println("Список элементов в массивах: " + arrayElementsList);
    }
}
