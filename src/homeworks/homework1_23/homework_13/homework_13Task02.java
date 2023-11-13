package homeworks.homework1_23.homework_13;

import java.util.Random;

/* Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()

   на вход принимает массив целых чисел и число - длину нового массива.
   Метод должен создать и распечатать массив заданной в параметрах длинны.
   В начало массива должны быть скопированы элементы из входящего массива:

    {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

 */
public class homework_13Task02 {
    public static void main(String[] args) {
        int size = 10;
        int[] nums = new int[size];
        int sizeNotFull = 3;
        fillArrayWithRandomValues(nums);
        printCopyofArray(nums, sizeNotFull);
    } // Method Area
    public static void fillArrayWithRandomValues(int[] arr) {
        Random random = new Random();
        int bound = 101;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }

    } // Method Area
    public static void printArray(int[] array) {
        System.out.print("Массив \n" + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i< array.length - 1) ? ", " : "]\n"));
        }
    }//Method Area
    public static void printCopyofArray(int[] array, int sizeNotFull) {

        int[] result = new int [sizeNotFull];

        for (int i = 0; i < sizeNotFull && i < array.length; i++) {
            result[i] = array[i];
        }
        printArray(result);

    }//Method Area


}
