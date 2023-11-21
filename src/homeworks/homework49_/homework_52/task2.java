package homeworks.homework49_.homework_52;

import java.util.function.Function;

public class task2 {
    public static void main(String[] args) {
        String string = "Hello, world!";

        Function<String, String> function = string1 -> string1.toUpperCase();
        Function<String, String> function1 = string1 -> string1.replaceAll("\\s+", "");
        Function<String, Integer> function2 = String::length;

        Function<String, Integer> combinedFunctions = function1.andThen(function).andThen(function2);

        System.out.println(combinedFunctions.apply(string));

    }
}
