package homeworks.homework49_.homework_63;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String task = "Мои номера: +123-456-7890, +987-654-3210, +1234-123-1234, +234-2345-2345, +345-345-345.";

        Pattern pattern = Pattern.compile("\\b+\\d{3}-\\d{3}-\\d{4}");

        Matcher matcher = pattern.matcher(task);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
