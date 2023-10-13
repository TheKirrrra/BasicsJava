package homework1_23.homework_11;

import java.util.Random;

/*Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.

Вывести на экран:

минимальное значение, хранящееся в массиве
максимальное
среднее арифметическое всех значений в массиве

 */
public class homework11Task00 {
    public static void main(String[] args) {
        Random random = new Random();
       int[] array = new int[5];
        int i = 0;
        int sum = 0;

        while (i < array.length) {
            array[i] = random.nextInt(101);
            System.out.print(array[i] + ", ");
            i++;
        }
        int min = array[0];
        int max = array[0];
        i = 0;
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            } sum = (sum + array[i]);
            i++;
        }
        System.out.println("\nМинимальное значение - " + min);
        System.out.println("Максимальное значение - " + max);
         System.out.print("Среднее арифметическое - " + sum / array.length);

    }
}
