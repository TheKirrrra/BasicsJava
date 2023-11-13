package homeworks.homework24_48.homework_47;

import java.util.HashMap;
import java.util.Map;

public class task01 {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";
        Map<String, Integer> frequencyMap = digitsAmount(text);
        System.out.println("Частота вхождений слов:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    public static Map <String,Integer> digitsAmount(String text) {
        Map <String,Integer> frequencyMap = new HashMap<>();

        // Разбиваем текст на слова
        String[] words = text.split("\\s+");

        // Обходим массив слов и обновляем частоту вхождений в карте
        for (String word : words) {
            // Приводим слово к нижнему регистру, чтобы не различать слова по регистру
            word = word.toLowerCase();

            // Убираем знаки препинания вокруг слова
            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "");

            // Если слово не пустое, обновляем его частоту в карте
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return frequencyMap;
    }
}
