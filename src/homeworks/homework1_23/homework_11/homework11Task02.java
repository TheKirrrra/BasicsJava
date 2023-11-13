package homeworks.homework1_23.homework_11;
/*
Дан массив строк. Вывести на экран все символы из самой длинной строки массива

{ “One”, “Two”, “Twenty” } -->

T
w
e
n
t
y
 */
public class homework11Task02 {
    public static void main(String[] args) {
        String[] strings = {"December", "March", "June", "September","January"};
        int ind = 0;
        int indLetter = 0;
        int max = 0;
        while (ind < strings.length) {
            if (strings[ind].length() > max) {
                max = strings[ind].length();
            }ind++;
        }
        ind = 0;
        while (ind < strings.length) {
            if (strings[ind].length() == max) {
                System.out.println("самое длинное слово -> " + strings[ind]);
                while (indLetter < max) {
                    System.out.println(strings[ind].charAt(indLetter));
                    indLetter++;
                }
            } ind++;
        }

    }

}
