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


        List <Integer> result = new ArrayList<>(list1);
        result.retainAll(list2);


        System.out.println("Список элементов в массивах: " + result);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

    }
}

