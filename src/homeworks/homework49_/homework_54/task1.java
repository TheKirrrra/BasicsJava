package homeworks.homework49_.homework_54;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Из списка целых чисел
выделите те значения, которые больше 10;
 отсортируйте эти значения по значению последней цифры в числе
 и выведите результат на экране
 */
public class task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(0,21,35,57,8,23,102,27,777,1005,3,54,18);

        List<Integer> sortedList = integers.stream()
                .filter(integer -> integer > 10)
                .sorted(Comparator.comparingInt(num -> num % 10))  // Получение последней цифры
                .collect(Collectors.toList());

        // Вывод отсортированного списка
        sortedList.forEach(System.out::println);
    }
}

