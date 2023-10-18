package homework_30.Task00;

import java.util.Arrays;
import java.util.Random;

public class RubberArray<T> {
    private T[] array; // можно инициализировать поле при его объявлении = new int[10];
    private int cursor;
    static final int MULTIPLIER = 2;

    Random random = new Random();

    public RubberArray() {
        array = (T[]) new Object[10];

    }

    public RubberArray(int sizeDefault) {
        array = (T[]) new Object[sizeDefault];
    }

    public void add(T number) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor++] = number;
    }


    public void add(T... values) {

        for (T value : values) {
            add(value);
        }
    }
    

    private void expandArray() {
//        T[] newArray = Arrays.copyOf(array, array.length * 2);
        T[] newArray = (T[]) new Object[array.length * MULTIPLIER];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

    public int length() {
        return cursor;
    }

    public int indexOf(T number) {

        for (int i = 0; i < cursor; i++) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    public <T extends Number> int lastIndexOf(T number) {

        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) >= 0; //переиспользуем уже написанный код (метод)
    }

    public boolean remove(T value) {
        int index = indexOf(value);
        removeByIndex(index);
        return index >= 0;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = (T) array[i];
        }
        return result;
    }

    public void trim() {
        System.out.println("Текущий array1: " + Arrays.toString(array));
        array = toArray();
        System.out.println("Текущий array2: " + Arrays.toString(array));
    }

    public <T extends Number> int removeByIndex(int index) {
        if (index < 0 || index > cursor - 1) return Integer.MIN_VALUE;
        T value = (T) array[index];

        T[] result = (T[]) new Object[array.length - 1];

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = (T) array[i];
            } else { // i >= index
                result[i] = (T) array[i + 1];
            }
        }

        cursor--;

        return (int) value;
    }
}


