package homeworks.homework24_48.homework_46;

import java.util.*;

public class task01 {
    public static void main(String[] args) {
        String inputStr = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        List<String> result = sortUniqueWords(inputStr);
        System.out.println(result);
    }



    public static List<String> sortUniqueWords(String inputString) {
        String[] words = inputString.split("[^a-zA-Zа-яА-Я]+"); // регулярное выражение для слов
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words)); // убираем повторения
        List<String> sortedUniqueWords = new ArrayList<>(uniqueWords);

        // Сортировка по длине и естественному порядку
        sortedUniqueWords.sort((s1, s2) -> {
            int result = Integer.compare(s1.length(), s2.length());
            return (result != 0) ? result : s1.compareTo(s2);
        });

        return sortedUniqueWords;
    }
}
