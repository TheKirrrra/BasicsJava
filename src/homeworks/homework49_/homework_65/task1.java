package homeworks.homework49_.homework_65;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        String task = "red apple, green apple, just an apple";

        Pattern pattern = Pattern.compile("(?<!green )apple");
        Matcher matcher = pattern.matcher(task);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
