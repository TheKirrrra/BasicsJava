package homeworks.homework49_.homework_63;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        String task = "Мои контакты: email@example.com, email@example.jp, email@example.order, test@ail@domain.com, asdfqwer.com, asdf@gasjhg";

        Pattern pattern = Pattern.compile("\\b[a-z0-9]*@[a-z0-9]*\\.[a-z]{2,5}\\b");



        Matcher matcher = pattern.matcher(task);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
