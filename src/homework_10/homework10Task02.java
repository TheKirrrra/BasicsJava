package homework_10;
// Task 2 Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
public class homework10Task02 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0; // колво выводов

        while (x<=100 && y < 7 && x != 0)

        {
            if (x % 5 == 0) {
                System.out.println(x + "; ");
                y++;
            }
            x++;

        }
        System.out.println("количество цифр: " + y);
    }
}
