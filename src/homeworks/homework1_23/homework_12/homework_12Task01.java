package homeworks.homework1_23.homework_12;

import java.util.Scanner;

/*За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу,
в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for.

Пусть сумма вклада будет представлять тип float.

 */
public class homework_12Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prozent = 7;
        float sum = 0;
            System.out.println("Меню");
            System.out.println("Внесите деньги на счет");
        int money = scanner.nextInt();
        System.out.println("На сколько месяцев?");
        int month = scanner.nextInt();
        for (int i = 0; i<month; i++) {
            sum =sum + (sum + (float)money)*prozent/100; // прогрессирующий процент

        }
        System.out.println("Сумма вклада: " + money);
        System.out.println("Срок вклада в месяцах: " + month);
        System.out.println("После " + month + " месяцев сумма вклада составит: " + (money + sum));



    }
}
