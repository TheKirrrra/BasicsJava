package homeworks.homework49_.homework_52;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 5, 11, 102, 55, 50, 7, 12);

        Predicate<Integer> predicate1 = integer -> integer % 2 == 0; // проверка на четность
        Predicate<Integer> predicate2 = integer -> integer > 10;
        Predicate<Integer> predicate3 = integer -> integer < 100;
        Predicate<Integer> combinedPredicates = predicate1.and(predicate2).and(predicate3);

        List<Integer> result = filterNumbers(list, combinedPredicates);
        System.out.println(result);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List <Integer> result = new ArrayList<>();

        for (Integer value: numbers) {
            if (predicate.test(value)){
                result.add(value);
            }
        }
        return result;
    }
}
