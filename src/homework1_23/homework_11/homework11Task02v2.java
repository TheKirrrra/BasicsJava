package homework1_23.homework_11;
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
public class homework11Task02v2 {
    public static void main(String[] args) {
        String[] strings = {"December", "March", "June", "September","January"};

        String langestString = strings [0];

        int i=0;
        while (i < strings.length) {
            if (strings[i].length() > langestString.length()) {
                langestString = strings[i];
            }
            i++;
            }
        int k = 0;
        while (k < langestString.length()) {
            System.out.println(langestString.charAt(k++));
        }

        }
    }

