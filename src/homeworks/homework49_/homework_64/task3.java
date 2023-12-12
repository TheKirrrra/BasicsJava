package homeworks.homework49_.homework_64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String task = "<p>Это пример текста.</p>\n<p>Это другой текст.</p>";


        Pattern pattern = Pattern.compile("<p>(.*?)</p>");
        Matcher matcher = pattern.matcher(task);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
