package homework1_23.homework_18;

/*
Добавление элемента (строка 32)
Добавление нескольких элементов (в качестве аргументов передает последовательность значений) (строка 35)
Вывести все значения в массиве в консоль (строка 54)
Текущее количество элементов в массиве (строка 62)
Поиск элемента по значению (строка 66)
Возвращение значения по индексу (строка 101)
Удаление элемента по индексу (строка 74)
Удаление элемента по значению (строка 109)
Замена значения по индексу (есть индекс и новое значение) (строка 115)
Замена значения по значению (есть старое и новое значение) (строка 124)
Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями (132 строка)
 */
public class HWRubberArray {

    int[] array;

    int arrayEnd; //cursor

    public HWRubberArray() {
        array = new int[10];
    }

    public HWRubberArray(int sizeDefault) {
        array = new int[sizeDefault];
    }

    void add(int number) { //добавление элемента
        if (arrayEnd > array.length * 0.9) {
            expandArray();
        }
        array[arrayEnd++] = number;
    }

    void add(int... ints) {
        for (int value: ints) {
            add(value);

        }
    }

    void expandArray() {
        int[] newArray = new int[array.length*2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array [i];
        }
        array = newArray;
    }

    public String toString() { //Вывести все значения в массиве в консоль
        String result = "[";
        for (int i = 0; i < arrayEnd; i++) {
            result += array[i] + ((i < arrayEnd -1) ? ", " : "]");
        }
        return result;
    }

    int length() { //Текущее количество элементов в массиве
        return arrayEnd;
    }

    int indexOf(int num) { //поиск по значению
        for (int i = 0; i < arrayEnd; i++) {
            if (array[i] == num) return i;
        }

        return -1;
    }

    int removeByIndex(int index) { // Удаление элемента по индексу
        if (index < 0 || index > arrayEnd -1) return Integer.MIN_VALUE;
        int value = array[index];

        int[] result = new int[array.length - 1];

        System.arraycopy(array, 0, result, 0, index);
        System.arraycopy(array, index +1, result, index, arrayEnd - 1 - index);

        arrayEnd--;


        for (int i = 0; i < arrayEnd; i++) {
            if (i < index) {
                result[i] = array[i];
            } else {
                result[i] = array[i+1];
            }
        }
        array = result;

        return value;
    }

    int valueFind(int value) { //Возвращение значения по индексу
        if (indexOf(value) >= 0) {
            return array[value];
        }
        return 2147000000;
    }

    boolean remove(int value) { // Удаление элемента по значению
        int index = indexOf(value);
        removeByIndex(index);
        return index >= 0;
    }

    int changeValue(int index, int newValue) { // Замена значения по индексу (есть индекс и новое значение)

        if (valueFind(index) >= 0){
            array[index] = newValue;
            return newValue;
        }

        return newValue;
    }


    int changeValueByValue(int value, int newValue) {//Замена значения по значению (есть старое и новое значение)
        int index = indexOf(value);
        if (index >= 0){
            changeValue(index,newValue);
        }
        return value;
    }

    int[] toArray() { //Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
        int[] result = new int[arrayEnd];
        for (int i = 0; i < arrayEnd; i++) {
            result[i] = array[i];

        }
        return result;
    }


}
