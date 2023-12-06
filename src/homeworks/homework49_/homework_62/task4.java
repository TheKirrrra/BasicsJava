package homeworks.homework49_.homework_62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Создайте регулярное выражение для поиска всех вхождений букв 'b' и 'B' в строке.
 */
public class task4 {
    public static void main(String[] args) {
        String task = "Bears, Bees, and Bunnies are beautiful.";

        Pattern pattern = Pattern.compile("[bB]");

        Matcher matcher = pattern.matcher(task);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
