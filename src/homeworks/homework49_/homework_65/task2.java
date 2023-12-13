package homeworks.homework49_.homework_65;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        String task = "3a, 4b, 5cat, d6, e7, f8";

        Pattern pattern = Pattern.compile("\\d(\\w+)");
        Matcher matcher = pattern.matcher(task);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
