package lessons.lesson49_.lesson_54;

import java.util.List;
import java.util.stream.Collectors;

public class DataFilters {
    public static void main(String[] args) {

        task1();
        task2();
        //task3();
    }

    private static void task1() {
        List<Integer> integers = List.of(0,1,5,7,8,3,2,7,7,5,3,4,8);

        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("smallest: " + smallest);


        List<Integer> withoutSmallest = integers.stream()
                .sorted()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println("smallest: " + withoutSmallest);
    }

    private static void task2() {
        List<String> strings = List.of("aa", "bb", "ccc", "dd", "eee");

        List<String> strings1 = strings.stream()
                .takeWhile(string -> string.length() <3)
                .collect(Collectors.toList());

        System.out.println("takeWhile: " + strings1);

        List<String> dropStrings = strings.stream()
                .dropWhile(string -> string.length() <3)
                .collect(Collectors.toList());

        System.out.println("dropWhile: " + dropStrings);

    }


}
