package homeworks.homework1_23.homework_10;
// Task 3 Программа просит пользователя слово "hello" Если пользователь вводит правильное слово - программа распечатывает на экран благодарность и завершает работу Если вводится не верное слово - программа просит ввести слово снова. До тех пор, пока не будет введено запрашиваемое слово
//опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова По окончанию - вывести число попыток на экран
import java.util.Scanner;


public class homework10Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите hello");
        String str = scanner.nextLine();
        int y = 1;
        String hel = "hello";
            while (!str.equals(hel)){
                System.out.println("Неверно, введите ещё раз!");
                str = scanner.nextLine();
                y++;

            } System.out.println("Верно, спасибо (: " + "\nКоличество попыток " + y);

    }
}
