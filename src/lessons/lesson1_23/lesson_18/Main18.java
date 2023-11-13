package lessons.lesson1_23.lesson_18;

import java.util.Arrays;
import java.util.Random;

public class Main18 {
    public static void main(String[] args) {
Random random = new Random();

    RubberArray ra = new RubberArray();

    ra.add(50);
    ra.add(-10);

        for (int i = 0; i < 5; i++) {
            ra.add(random.nextInt(101));

        }

        System.out.println(ra.toString());
        System.out.println("Сейчас в массиве: " + ra.length() + " элементов.");

        ra.add(1,3,4);
        System.out.println(ra.toString());

        int searchMe = -10;
        System.out.println("Поиск в массиве по значению: " + ra.indexOf(searchMe));

        System.out.println("Метод contains: " + ra.contains(searchMe));

        ra.addRandomValues(3,1000);
          ra.addRandomValues(2);
        System.out.println(ra.toString());
        System.out.println("================");

        int index = ra.indexOf(3);
        int lastIndex = ra.lastIndexOf(3);
        System.out.println(index);
        System.out.println(lastIndex);

        if (index != -1 && index != lastIndex) {
            System.out.println("Число вхождений тройки в массиве больше 1");
        }

        if (index != -1 && index == lastIndex) {
            System.out.println("В массиве только один элемент с таким числом");
        }

        System.out.println("========    ============================");
        int index1 = 8;
        System.out.println("Удаляем по " + index1);
        ra.removeByIndex(index1);
        System.out.println(ra);

        System.out.println(ra.remove(4));
        System.out.println(ra.toString());

        int[] array = ra.toArray();

        System.out.println(Arrays.toString(array));

        ra.trim();
        ra.add(555);
        System.out.println(ra.toString());
    }


}
