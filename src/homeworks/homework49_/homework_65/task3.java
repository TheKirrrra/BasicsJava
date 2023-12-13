package homeworks.homework49_.homework_65;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String task = "contact@example.com, user@test.com, admin@example.com";

        Pattern pattern = Pattern.compile("([\\w.-]+)@example\\.com");
        Matcher matcher = pattern.matcher(task);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
