package homeworks.homework49_.homework_63;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        String task = "Мой индекс 12345, а его индекс 67890. А число 456789 не подходит";

        Pattern pattern = Pattern.compile("\\b\\d{5}\\b");

        Matcher matcher = pattern.matcher(task);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
