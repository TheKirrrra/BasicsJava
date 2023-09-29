package chernovik;

import java.util.Scanner;

public class chernovik {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        // Вычисляем размер нового массива
        int length1 = arr1.length;
        int length2 = arr2.length;
        int combinedLength = length1 + length2;

        // Создаем новый массив для объединения
        int[] combinedArray = new int[combinedLength];

        // Копируем элементы из первого массива в новый массив
        for (int i = 0; i < length1; i++) {
            combinedArray[i] = arr1[i];
        }

        // Копируем элементы из второго массива в новый массив
        for (int i = 0; i < length2; i++) {
            combinedArray[length1 + i] = arr2[i];
        }

        // Выводим объединенный массив
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }
    }
}


