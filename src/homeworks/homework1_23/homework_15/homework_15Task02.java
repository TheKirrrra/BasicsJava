package homeworks.homework1_23.homework_15;
/*
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class homework_15Task02 {
    public static void main(String[] args) {
        String[] strings = {"Hello", "world!", "How", "are", "you", "doing?"};

        String[] stringMinMax;

        stringMinMax = minMax(strings);

        printArray(stringMinMax);




    } //Method Area
    public static String[] minMax (String[] array) {
        String longestString = array[0];
        String smallestString = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i].length() > longestString.length()) {
                longestString = array[i];
            } else if (array[i].length() < smallestString.length()) {
                smallestString = array[i];
            }
            i++;
        }
        String[] strings = {smallestString, longestString};
        return strings;
    } //Method Area

    public static void printArray (String[] array) {
        System.out.println("Самая короткая и самая длинная строки в массиве: " );
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
