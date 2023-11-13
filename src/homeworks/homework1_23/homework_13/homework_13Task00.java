package homeworks.homework1_23.homework_13;

import java.util.Random;

/*
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
 */
public class homework_13Task00 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int[] nums = new int[size];

        int index = 4;

        boolean isTrue = random.nextBoolean();

        fillArrayWithRandomValues(nums); // берем числа для массива
        printArray(nums); // печатаем в обычном порядке
        printArrayRecursive(nums); // печатаем в обратном порядке
        printArrayIndex(nums, index); // печатаем массив, но после определенного индекса в обратном направлении
        printArrayTrue(nums,isTrue); // Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке


    } //Method Area
    public static void fillArrayWithRandomValues(int[] arr) {
        int bound = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = bound++;
        }

    } //Method Area

    public static void printArray(int[] array) {
        System.out.print("Массив в обычном порядке\n" + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i< array.length - 1) ? ", " : "]\n"));
        }
        }//Method Area

    public static void printArrayRecursive(int[] array) {
        System.out.print("Массив в обратном порядке\n" + "[");
        for (int i = (array.length-1); i <= array.length & i >= 0; i--) {
            System.out.print(array[i] + ((i <= array.length - 1 & i > 0) ? ", " : "]\n"));
        }


    } //Method Area
    public static void printArrayIndex(int[] array, int index) {
        System.out.print("Массив в частично обратном порядке\n" + "[");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ", ");
            if (array[j] == index-1) {
                for (int i = (array.length-1); i <= array.length & i >= index; i--) {
                    System.out.print(array[i] + ((i <= array.length - 1) ? ", " : "]\n"));

            } break;

        }
        }


    } //Method Area

    public static void printArrayTrue(int[] array, boolean isTrue) {


        System.out.print("\nBoolean condition:");

        if (isTrue) {
            System.out.print(" False -> печатаем массив в обычном порядке\n" + "[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ((i< array.length - 1) ? ", " : "]\n"));
            }
        } else {
            System.out.print(" True -> печатаем массив в обратном порядке\n" + "[");
            for (int i = (array.length - 1); i <= array.length & i >= 0; i--) {
                System.out.print(array[i] + ((i <= array.length - 1 & i > 0) ? ", " : "]\n"));
            }
        }
        }//Method Area


    }


