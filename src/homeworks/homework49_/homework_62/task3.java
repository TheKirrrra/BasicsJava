package homeworks.homework49_.homework_62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Напишите регулярное выражение, чтобы найти все заглавные буквы в строке.
 */
public class task3 {
    public static void main(String[] args) {
        String task = "London is the capital of Great Britain.";

        Pattern pattern = Pattern.compile("[A-Z]");

        Matcher matcher = pattern.matcher(task);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
