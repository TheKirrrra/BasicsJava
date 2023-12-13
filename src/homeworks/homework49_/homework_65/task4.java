package homeworks.homework49_.homework_65;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        String task = "start middle end, beginning center finish";

        Pattern pattern = Pattern.compile("start\\s(.*?)\\send");
        Matcher matcher = pattern.matcher(task);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
