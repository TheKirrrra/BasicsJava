package homeworks.homework1_23.homework_16;

import java.util.Arrays;

/*
Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
 */
public class homework_16Task00 {
    public static void main(String[] args) {
        // Использую unicode 10. lower case - 32 = upper case. Сделать исключение для остальных символов
        String[] strings = {"hello!","world123","how","are","you","doing"};

        String[] stringsUpperCase;
        stringsUpperCase = toUpperCase(strings);
        System.out.println(Arrays.toString(stringsUpperCase));
    } //method area

    public static String[] toUpperCase(String[] array){

        char[] lower;

        for (int i = 0; i < array.length; i++) {
            lower = array[i].toCharArray();
            for (int j = 0; j < lower.length; j++) {
                if (lower[j] >= 97 && lower[j] <= 122) {
                    lower[j] = (char) (lower[j]-32);
                    array[i] = String.valueOf(lower);
            }
            }
        }
        return array;
    }//Method Area
}
