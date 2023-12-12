package homeworks.homework49_.homework_64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        String task = "Контакт: email@example.com, qwerty@qwery.jp";

        Pattern pattern = Pattern.compile("(\\b\\S+\\b)@(\\b\\S+\\b)");
        Matcher matcher = pattern.matcher(task);

        while (matcher.find()) {
            System.out.println("Имя пользователя: " + matcher.group(1) + ", Домен: " + matcher.group(2));
        }
    }
}
