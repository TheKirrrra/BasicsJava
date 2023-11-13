package homeworks.homework1_23.homework_13;

import java.util.Random;

/*
Дано: Два отсортированных массива целых чисел.
Вам нужно найти элемент, который будет находиться на k-й позиции в объединенном отсортированном массиве.

 */
public class homework_13Task03 {
    public static void main(String[] args) {
        int size = 10;
        int size1 = 10;
        int[] nums = new int[size];
        int[] nums1 = new int[size1];
        int[] nums2 = new int[size+size1];
        int k = 7;
        fillArrayWithValues(nums);
        printArray(nums);
        fillArrayWithValues1(nums1);
        printArray1(nums1);
        fillArrayWithExistingValues(nums2, size, size1, nums1, nums);
        printArrayK(nums2, k);
    } // Method Area
    public static void fillArrayWithValues(int[] arr) {
        Random random = new Random();
        int bound = 101;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }

    } // Method Area
    public static void printArray(int[] arr) {
        System.out.print("Первый массив \n" + "[");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов, если текущий больше следующего
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        System.out.print("\nПервый отсортированный массив \n" + "[");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }//Method Area
    public static void fillArrayWithValues1(int[] arr) {
        Random random = new Random();
        int bound = 101;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }

    } // Method Area
    public static void printArray1(int[] arr) {
        System.out.print("\nВторой массив\n" + "[");
        for (int num : arr) {
            System.out.print(num + ", ");
        }


        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов, если текущий больше следующего
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        System.out.print("\nВторой отсортированный массив\n" + "[");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }//Method Area
    public static void fillArrayWithExistingValues(int[] nums2, int size1, int size2, int[] nums, int[] nums1) {
        // Копируем элементы из первого массива в новый массив
        for (int i = 0; i < size1; i++) {
            nums2[i] = nums[i];
        }

        // Копируем элементы из второго массива в новый массив
        for (int i = 0; i < size2; i++) {
            nums2[size1 + i] = nums1[i];
        }

        System.out.println("\nОбъединенные два массива в одном");
        for (int num : nums2) {
            System.out.print(num + ", ");
        }

        int n = nums2.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums2[j] > nums2[j + 1]) {
                    // Обмен элементов, если текущий больше следующего
                    int temp = nums2[j];
                    nums2[j] = nums2[j + 1];
                    nums2[j + 1] = temp;
                }
            }
        }
        
        // Выводим объединенный массив
        System.out.println("\nОбъединенные и отсортированные два массива в одном");
        for (int num : nums2) {
            System.out.print(num + ", ");
        }
        
        
        

    }//Method Area
    public static void printArrayK(int[] nums2, int k) {
        System.out.println("\nОтсортированный массив до k");
        for (int i = 0; i < k; i++) {

            System.out.print(nums2[i] + ", ");
        }




    } // Method Area




}
