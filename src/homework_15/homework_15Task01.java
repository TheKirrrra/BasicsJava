package homework_15;
/*
Написать метод, принимающий массив целых чисел.
Метод должен вернуть количество простых чисел в массиве.
Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
 */
public class homework_15Task01 {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 4, 9, 3,7,13,27,37};

        int numsPrime;

        numsPrime = numbersPrime(nums);
        System.out.println("Количество простых чисел в массиве -> " + numsPrime);
    }//Method Area

    public static int numbersPrime(int[] array) {
        int numsPrime = 0;
        boolean isPrime;

        for (int i = 0; i < array.length; i++) {
            isPrime = isNumberPrime(array[i]);
            if (isPrime) {
                numsPrime++;
            }

        }
        return numsPrime;
    }//Method Area

    public static boolean isNumberPrime(int x) {
        boolean isPrime = true;
        for (int p = 2; p < x; p++) {

            if (x % p == 0) {
                isPrime = false;
            }

        }
        return isPrime;
    } //Method Area
}
