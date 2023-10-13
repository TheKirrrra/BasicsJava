package homework1_23.homework_10;
// Task 1 Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
public class homework10Task01 {
    public static void main(String[] args) {
        int a = 0;

        do {
            a++;
            if (a % 5 == 0) {
                System.out.println(a);
            }
        } while(a < 100);
        System.out.println("Конец цикла");
    }
}
