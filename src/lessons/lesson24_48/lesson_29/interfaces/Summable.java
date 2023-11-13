package lessons.lesson24_48.lesson_29.interfaces;

public interface Summable {
    double PI = 3.141519;

    int MIN_VALUE = 100;

    default int sum (int...ints) {
        return getSum(ints);
    }

    private int getSum(int[] ints) {
        int sum = 0;
        for (int value: ints) {
            sum += value;
        }

        return sum;
    }


}
