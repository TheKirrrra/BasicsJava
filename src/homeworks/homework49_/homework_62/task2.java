package homeworks.homework49_.homework_62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Напишите регулярное выражение, чтобы найти все вхождения символов @ '&', '!' в строке.
 */
public class task2 {
    public static void main(String[] args) {
        String task = "myemail@example.co!m another&email@example.com";

        Pattern pattern = Pattern.compile("[@&!]");

        Matcher matcher = pattern.matcher(task);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
