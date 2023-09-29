package homework_18;

import lesson_18.RubberArray;

import java.util.Arrays;
import java.util.Scanner;

public class testRubberArray {
    public static void main(String[] args) {
        HWRubberArray ra = new HWRubberArray();
        Scanner scanner = new Scanner(System.in);



        System.out.println("Введите сколько чисел, хотите добавить в массив.");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Введите число, которое хотите видеть в массиве.");
            ra.add(scanner.nextInt());

        }

        System.out.println("Все значения в массиве:\n" + ra.toString());
        System.out.println("Сейчас в массиве: " + ra.length() + " элементов.");
        System.out.println("=======================================================");
        System.out.println("Введите, какое число хотите найти в массиве.");
        int index = ra.indexOf(scanner.nextInt());

        System.out.println("Индекс на котором стоит искомое значение: " + index);
        System.out.println("=======================================================");
        System.out.println("Введите, в каком индексе хотите узнать число массива.");
        int value = ra.valueFind(scanner.nextInt());
        if (value == 2147000000) {
            System.out.println("Такого числа нет в массиве");
        } else {
            System.out.println("Число которое стоит на заданной позиции: " + value);
        }
        System.out.println("=======================================================");

        System.out.println("Введите какой индекс хотите удалить.");

        ra.removeByIndex(scanner.nextInt());

        System.out.println("Массив после удаления по индексу"+ ra.toString());
        System.out.println("=======================================================");
        System.out.println("Введите число которое хотите удалить");
        ra.remove(scanner.nextInt());

        System.out.println("Массив после удаления:\n" + ra.toString());
        System.out.println("=======================================================");

        System.out.println("Введите какой индекс хотите заменить");
        int indexChange = scanner.nextInt();
        System.out.println("И на какое число.");
        int newValue = scanner.nextInt();
        ra.changeValue(indexChange,newValue);
        System.out.println("Массив после замены по индексу:\n" + ra.toString());
        System.out.println("=======================================================");
        System.out.println("Введите какое значение хотите заменить");
        int oldValue = scanner.nextInt();
        System.out.println("И на какое число.");
        int newValue1 = scanner.nextInt();
        ra.changeValueByValue(oldValue,newValue1);
        System.out.println("Массив после замены по значению:\n" + ra.toString());
        System.out.println("=======================================================");
        int[] array = ra.toArray();
        System.out.println("Массив преобразованный в RubberArray:\n" + Arrays.toString(array));
    }
}
