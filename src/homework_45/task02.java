package homework_45;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class task02 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        fillListWithRandomValues(arrayList, 1000, 10000);
        fillListWithRandomValues(linkedList, 1000, 10000);

        long arrayListGetTime = measureTime(() -> getAllElementsByIndex(arrayList));
        long linkedListGetTime = measureTime(() -> getAllElementsByIndex(linkedList));

        long arrayListInsertTime = measureTime(() -> insertRandomValuesAtIndex(arrayList));
        long linkedListInsertTime = measureTime(() -> insertRandomValuesAtIndex(linkedList));

        long arrayListRemoveTime = measureTime(() -> removeRandomValuesAtIndex(arrayList));
        long linkedListRemoveTime = measureTime(() -> removeRandomValuesAtIndex(linkedList));

        System.out.println("ArrayList:");
        System.out.println("Время добавления 1000 новых элементов: " + arrayListInsertTime + " мс");
        System.out.println("Время получения всех элементов: " + arrayListGetTime + " мс");
        System.out.println("Время удаления 1000 элементов: " + arrayListRemoveTime + " мс");

        System.out.println("\nLinkedList:");
        System.out.println("Время вставки 1000 новых элементов: " + linkedListInsertTime + " мс");
        System.out.println("Время получения всех элементов: " + linkedListGetTime + " мс");
        System.out.println("Время удаления 1000 элементов: " + linkedListRemoveTime + " мс");
    }

    public static void fillListWithRandomValues(List<Integer> list, int size, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue + 1));
        }
    }

    public static void getAllElementsByIndex(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    public static void insertRandomValuesAtIndex(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(list.size() + 1);
            list.add(index, random.nextInt(10000));
        }
    }

    public static void removeRandomValuesAtIndex(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
    }

    public static long measureTime(Runnable operation) {
        long startTime = System.currentTimeMillis();
        operation.run();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}

