package lesson1_23.lesson_18;
/*

 */


import java.util.Arrays;
import java.util.Random;

public class RubberArray {

    int[] array;

    int cursor;

    Random random = new Random();

    public RubberArray() {

        array = new int[10];

    }

    public RubberArray(int sizeDefault) {
        array = new int[sizeDefault];
    }

    void add(int number) {
        if (cursor > array.length * 0.9) {
            expandArray();
        }
        array[cursor++] = number;
    }

    void add(int... ints) { //Добавление нескольких элементов (в качестве аргументов передает последовательность значений)

        ints[0] = 100;

        for (int value: ints) {
            add(value);

        }
    }

    void addRandomValues(int count, int bound) {

        for (int i = 0; i < count; i++) {
            add(random.nextInt(bound));

        }

    }

    void addRandomValues(int count) {
        addRandomValues(count, 101);
    }

    void expandArray() {
        int[] newArray = new int[array.length*2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor -1) ? ", " : "]");
        }
        return result;
    }

    int length() {
        return cursor;
    }

    int indexOf(int number) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == number) return i;
        }

        return -1;
    }

    int lastIndexOf(int number) {
        for (int i = cursor; i >= 0; i--) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    boolean contains(int value) {
   /*    for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return true;

        }
        return false;
    */
        return indexOf(value) >= 0;
    }

    boolean remove(int value) {
        int index = indexOf(value);
        removeByIndex(index);
        return index >= 0;
    }

    int[] toArray() {
        int[] result = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];

        }
        return result;
    }

    void trim() {
        array = toArray();
    }

    int removeByIndex(int index) {
        if (index < 0 || index > cursor -1) return Integer.MIN_VALUE;
        int value = array[index];

        int[] result = new int[array.length - 1];

        System.arraycopy(array, 0, result, 0, index);
        System.arraycopy(array, index +1, result, index, cursor - 1 - index);

        cursor--;

        System.out.println(Arrays.toString(result));



        for (int i = 0; i < cursor; i++) {
                if (i < index) {
                    result[i] = array[i];
                } else {
                    result[i] = array[i+1];
                }
            }
        array = result;

        return value;
    }

}
