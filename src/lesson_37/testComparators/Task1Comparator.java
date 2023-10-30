package lesson_37.testComparators;

import java.util.Comparator;

public class Task1Comparator implements Comparator<Integer> {
    @Override
    public int compare(Integer int1, Integer int2) {
        boolean isFirstEven = (int1 % 2) == 0;
        boolean isSecondEven = (int2 % 2) == 0;

        if (isFirstEven && !isSecondEven) { // первое четное, второе не четное -> первое должно быть меньше (распологаться левее)
            return -1;
        } else if (!isFirstEven && isSecondEven) { // второе четное, первое не четное -> первое должно быть больше (распологаться правее)
            return 1;
        } else { // оба числа четных. Сравниваем их в порядке возрастания
            return Integer.compare(int2, int1);
        }
    }
}
