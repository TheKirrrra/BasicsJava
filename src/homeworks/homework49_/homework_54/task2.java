package homeworks.homework49_.homework_54;

import java.util.List;
import java.util.stream.Stream;

/*
Разбейте строку на слова, используя в качестве разделителя пробел.
Используя функцию reduce верните суммарное количество букв в словах, которые длиннее 4 символов
 */
public class task2 {
    /*
    String text = "Hello, world and good afternoon";
int countLetters = countLetters(text);
System.out.println("countLetters: " + countLetters);
// Output:
countLetters: 19
     */
    public static void main(String[] args) {
        String text = "Hello, world and good afternoon";

        List<String> strings = List.of(text.split(" "));
        int sum = strings.stream()
                .map(s -> s.replaceAll("[^a-zA-Z]", ""))
                .filter(string -> string.length() > 4)
                .mapToInt(String::length)
                .sum();
        System.out.println("Суммарное количество букв в словах длиннее 4 символов: " + sum);
    }
}
