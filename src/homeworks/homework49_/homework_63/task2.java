package homeworks.homework49_.homework_63;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        String task = "I need to rewrite and reread these reports.";

        Pattern pattern = Pattern.compile("\\bre\\w*\\b");

        Matcher matcher = pattern.matcher(task);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
