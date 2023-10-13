package homework1_23.homework_11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением

Пример:

{ 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}

 */
public class homework11Task01 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (количество чисел в массиве):");
        int num = scanner.nextInt();
        int[] array = new int [num];
        
        int i = 0;
        while (i < array.length) { //Определяются числа в массиве
            array[i] = random.nextInt(101);
            System.out.print(array[i] + ", ");
            i++;
        }
        int min = array[0];
        int minInd = 0;
        int max = array[0];
        int maxInd = 0;
        i = 0;
        while (i < array.length) { // Вычисляется минимальное число в массиве и его индекс
            if (array[i] < min) {
                minInd = i;
                min = array[i];
            }i++;
        }
        System.out.println("\nМинимальное значение - " + min);
        i = 0;
        while (i < array.length) {// Вычисляется максимальное число в массиве и его индекс
            if (array[i] > max) {
                maxInd = i;
                max = array[i];
            }i++;
        }
        System.out.println("Максимальное значение - " + max);

        int temp = array[minInd]; // временное значение минимального индекса, для перестановки
        array[minInd] = array[maxInd];
        array[maxInd] = temp;

        String string = Arrays.toString(array);
        System.out.println("Измененные местами минимальное значение и максимальное:\n" + string);
    }
}
