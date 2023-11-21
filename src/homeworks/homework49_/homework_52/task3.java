package homeworks.homework49_.homework_52;

import java.util.function.BiConsumer;

public class task3 {
    public static void main(String[] args) {
        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println(key + "=" + value);
        biConsumer.accept(1, "Test");
    }
}
