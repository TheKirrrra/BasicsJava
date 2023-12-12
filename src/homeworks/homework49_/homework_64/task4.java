package homeworks.homework49_.homework_64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        String task = "Дата: 15-03-2023";
        System.out.println(task);

        Pattern pattern = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
        Matcher matcher = pattern.matcher(task);

        System.out.println(matcher.replaceAll("$2/$1/$3"));

    }
}
