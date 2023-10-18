package lesson_30.methods;

public class Printer<E> {

    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public <T extends  Comparable<T>> T minValue(T[] array) {
        T min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public <T extends Number> T sumArray(T[] array) {
        Double sum = 0.0;
        for (T value : array) {
            sum += value.doubleValue();
        }
        return (T)sum;
    }
    public void print (E value) {
        System.out.println(value);
    }
}
