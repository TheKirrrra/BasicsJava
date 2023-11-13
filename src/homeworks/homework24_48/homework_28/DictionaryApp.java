package homeworks.homework24_48.homework_28;

import java.util.Arrays;

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.put("Hello", "Привет");
        dictionary.put("Bye", "Пока");


        String[] words = {"Привет", "Пока", "Джава"};

        Dictionary.Translator translator = dictionary.new Translator();
        System.out.println(Arrays.toString(translator.translate(words)));

    }
}
