package homeworks.homework49_.homework_62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Напишите регулярное выражение, которое находит все отдельные цифры меньше 7 в строке.
 */
public class task1 {
    public static void main(String[] args) {
        String task = "Моя дата рождения 2.6.1990";

        Pattern pattern = Pattern.compile("[0-6]");

        Matcher matcher = pattern.matcher(task);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
