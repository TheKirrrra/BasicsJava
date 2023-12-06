package lessons.lesson49_.lesson_62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lesson_62 {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("a");

        String text = "Jack is a cat";

        Matcher matcher = pattern.matcher(text);
    }
}
