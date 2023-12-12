package homeworks.homework49_.homework_64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        String task = "Она сказала: 'быстро', а потом добавила: 'осторожно'.";

        Pattern pattern = Pattern.compile("'([^']+)'");
        Matcher matcher = pattern.matcher(task);

        while (matcher.find()) {

            System.out.println("Первое слово в кавычках: " + matcher.group(1));
            break;
        }
    }
}
