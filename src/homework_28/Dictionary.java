package homework_28;

import lesson_28.Table;

/*
Создать класс "Dictionary" - таблица слов и их переводов.

dictionary.put("Hello", "Привет");
dictionary.put("Bye", "Пока");

dictionary.get("Hello"); // Привет

Вложенный класс - DictionaryPair (содержит исходное слово и перевод)
Внутренний класс - Translator

Translator содержит метод String[] translate(String[] words)

dictionary.put("Hello", "Привет");
dictionary.put("Bye", "Пока");

String[] words = {"Hello", "Bye", "Java"};

translator.translate(words); // {"Привет", "Пока", "Java"}

Он переводит входной набор слов по КОНКРЕТНОМУ словарю.
 */
public class Dictionary {

    public static class DictionaryPair {
        private final String englishWord;
        private String russianWord;

        public DictionaryPair(String englishWord, String russianWord) {
            this.englishWord = englishWord;
            this.russianWord = russianWord;
        }

        @Override
        public String toString() {
            return "DictionaryPair{" +
                    "englishWord='" + englishWord + '\'' +
                    ", russianWord='" + russianWord + '\'' +
                    '}';
        }
    }

    public class Translator {

        public String[] translate(String[] words) {
            String[] strings = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                DictionaryPair current = dictionaryPairs[i];
                if (count > i) {
                    if (current.russianWord.equals(words[i])) {
                        strings[i] = current.englishWord;
                    }
                } else {
                    strings[i] = words[i];
                }
            }
            return strings;
        }
    }

    private int count;

    private final DictionaryPair[] dictionaryPairs;

    public Dictionary() {
        this.dictionaryPairs = new DictionaryPair[10];
        this.count = 0;
    }

    public void put(String englishWord, String russianWord) {
        for (int i = 0; i < count; i++) {
            DictionaryPair current = dictionaryPairs[i];

            if (current.englishWord.equals(englishWord)) {
                current.russianWord = russianWord;
                return;
            }
        }

        DictionaryPair newDictionaryPair = new DictionaryPair(englishWord, russianWord);
        dictionaryPairs[count] = newDictionaryPair;
        count++;
    }

    }

