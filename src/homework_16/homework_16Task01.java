package homework_16;

import java.util.Arrays;

/*
Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
 Метод должен поменять местами значения, хранящихся в этих индексах
 Если индексы за пределами массива? // то вернется обычный массив
 Перегрузка метода для работы с массивами строк.
 */
public class homework_16Task01 {
    public static void main(String[] args) {

        int[] nums = {100,0,6,8,5,3,6,8,2};
        int index1 = 10;
        int index2 = 5; // Если индексы за пределами массива, то вернется обычный массив

        int[] swapNums;
        swapNums = swapIndex(nums,index1,index2);
        System.out.println(Arrays.toString(swapNums));

        String[] strings = {"hello!","world123","how","are","you","doing"};
        String[] swapNumsStrings;
        swapNumsStrings = swapIndex(strings, index1, index2);
        System.out.println(Arrays.toString(swapNumsStrings));

    } //Method Area

    public static int[] swapIndex(int[] array,int firstNum, int secondNum){
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == firstNum && secondNum <= array.length-1) {
                temp1 = array[i];
            }
            if (i == secondNum && firstNum <= array.length-1) {
                temp2 = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == firstNum && secondNum <= array.length-1) {
                array[i] = temp2;
            }
            if (i == secondNum && firstNum <= array.length-1) {
                array[i] = temp1;
            }
        }
        return array;
    } //Method Area
    public static String[] swapIndex(String[] array,int firstNum, int secondNum){
        String temp1 = "";
        String temp2 = "";
        for (int i = 0; i < array.length; i++) {
            if (i == firstNum && secondNum <= array.length-1) {
                temp1 = array[i];
            }
            if (i == secondNum && firstNum <= array.length-1) {
                temp2 = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == firstNum && secondNum <= array.length-1) {
                array[i] = temp2;
            }
            if (i == secondNum && firstNum <= array.length-1) {
                array[i] = temp1;
            }
        }
        return array;
    } //Method Area
}
