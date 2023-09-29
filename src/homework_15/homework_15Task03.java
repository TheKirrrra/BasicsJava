package homework_15;
/*
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
 */
public class homework_15Task03 {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 4, 9, 3,7,13,27,37};

        int[] numsPrime;

        numsPrime = numbersPrime(nums);

        printArray(numsPrime);

    }//Method Area

    public static int[] numbersPrime(int[] array) {
        boolean isPrime;
        int k = 0;
        int[] arrayNumbersPrime = new int [array.length];

        for (int i = 0; i < array.length; i++) {
            isPrime = isNumberPrime(array[i]);
            if (isPrime == true) {
                arrayNumbersPrime[k] = array[i];
                k++;
            }

        }
          int[] result = new int [k]; //уменьшаем массив до количества простых чисел

        for (int i = 0; i < k && i < array.length; i++) {
            result[i] = arrayNumbersPrime[i];
        }
        return result;
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
    public static void printArray (int[] array) {
        System.out.println("Самая короткая и самая длинная строки в массиве: " );
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    } //Method Area

}
