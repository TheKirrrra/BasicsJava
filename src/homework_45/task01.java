package homework_45;

import java.util.ArrayList;
import java.util.List;

public class task01 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(7);
        list2.add(13);

        list2.retainAll(list1);

        System.out.println("Список элементов в массивах: " + list2);

    }
}

